package com.gigazelensky.antispoof.utils;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.bukkit.ChatColor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Utility class for parsing color codes and MiniMessage strings.
 */
public final class MessageUtil {
    private MessageUtil() {}

    // Matches hex colors in both '&#RRGGBB' and '&x&F&F&F&F&F&F' formats
    private static final Pattern HEX_PATTERN =
            Pattern.compile("([&§]#[A-Fa-f0-9]{6})|([&§]x([&§][A-Fa-f0-9]){6})");

    /**
     * Parses a string containing legacy color codes or MiniMessage markup and
     * returns a legacy formatted string compatible with older Bukkit
     * versions. Hex color codes using the &#RRGGBB or &x&F&F&F&F&F&F formats
     * are also supported.
     *
     * @param input the input string
     * @return the parsed string with legacy colour codes
     */
    public static String miniMessage(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        // Unescape common sequences when received via commands
        input = input.replace("\\n", "\n").replace("\\\"", "\"");

        // Convert hex color codes to MiniMessage format
        Matcher matcher = HEX_PATTERN.matcher(input);
        StringBuilder sb = new StringBuilder(input.length());
        while (matcher.find()) {
            String hex = matcher.group(0).replaceAll("[&§x#]", "");
            matcher.appendReplacement(sb, "<#" + hex + ">");
        }
        input = matcher.appendTail(sb).toString();

        // Translate standard legacy color codes to section symbol
        input = ChatColor.translateAlternateColorCodes('&', input);

        // Map legacy codes to MiniMessage tags that are not parsed automatically
        input = input
                .replace("§0", "<!b><!i><!u><!st><!obf><black>")
                .replace("§1", "<!b><!i><!u><!st><!obf><dark_blue>")
                .replace("§2", "<!b><!i><!u><!st><!obf><dark_green>")
                .replace("§3", "<!b><!i><!u><!st><!obf><dark_aqua>")
                .replace("§4", "<!b><!i><!u><!st><!obf><dark_red>")
                .replace("§5", "<!b><!i><!u><!st><!obf><dark_purple>")
                .replace("§6", "<!b><!i><!u><!st><!obf><gold>")
                .replace("§7", "<!b><!i><!u><!st><!obf><gray>")
                .replace("§8", "<!b><!i><!u><!st><!obf><dark_gray>")
                .replace("§9", "<!b><!i><!u><!st><!obf><blue>")
                .replace("§a", "<!b><!i><!u><!st><!obf><green>")
                .replace("§b", "<!b><!i><!u><!st><!obf><aqua>")
                .replace("§c", "<!b><!i><!u><!st><!obf><red>")
                .replace("§d", "<!b><!i><!u><!st><!obf><light_purple>")
                .replace("§e", "<!b><!i><!u><!st><!obf><yellow>")
                .replace("§f", "<!b><!i><!u><!st><!obf><white>")
                .replace("§r", "<reset>")
                .replace("§k", "<obfuscated>")
                .replace("§l", "<bold>")
                .replace("§m", "<strikethrough>")
                .replace("§n", "<underlined>")
                .replace("§o", "<italic>");

        Component component = MiniMessage.miniMessage().deserialize(input).compact();
        return LegacyComponentSerializer.legacySection().serialize(component);
    }
}
