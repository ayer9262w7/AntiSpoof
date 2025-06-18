# AntiSpoof - Advanced Client Spoof Detection

<div align="center">
  <img src="https://i.imgur.com/Tyji4mJ.jpeg" alt="AntiSpoof Banner" style="width:500px; height:auto;">
  
  **Advanced, customizable Minecraft plugin for detecting client spoofing through brand analysis and channel monitoring**
  
  ![Java](https://img.shields.io/badge/Java-21%2B-orange)
  ![Minecraft](https://img.shields.io/badge/Minecraft-1.8.9-1.21.5-brightgreen)
  ![License](https://img.shields.io/badge/License-GPL%20v3-blue)
</div>

---

## 📋 Table of Contents

- [Key Features](#key-features)
- [Download Options](#download-options)
- [What AntiSpoof Can Do](#what-antispoof-can-do)
- [What AntiSpoof Cannot Do](#what-antispoof-cannot-do)
- [Why AntiSpoof is the Best Solution](#why-antispoof-is-the-best-solution)
- [Design Philosophy](#design-philosophy)
- [Installation](#installation)
- [Commands & Permissions](#commands--permissions)
- [PlaceholderAPI Integration](#placeholderapi-integration)
- [Configuration](#configuration)
- [How It Works](#how-it-works)
- [Troubleshooting](#troubleshooting)
- [FAQ](#frequently-asked-questions)
- [Support & Development](#support--development)
- [Complete Configuration Example](#complete-configuration-example)
- [License](#license)

---

## 🌟 Key Features

### Client Brand Analysis
- **Brand Filtering**: Block/whitelist specific client brands (Fabric, Forge, Lunar Client, etc.)
- **Pattern Matching**: Use regex to identify suspicious brand patterns
- **Geyser Verification**: Detect Java players pretending to be Bedrock clients

### Channel Monitoring
- **Vanilla Verification**: Flag players claiming to use vanilla with plugin channels
- **Channel Control**: Whitelist or blacklist specific plugin channels
- **Strict Matching**: Enforce exact channel requirements for specific client types

### Bedrock Player Integration
- **Floodgate Integration**: Seamless support for Floodgate API
- **Prefix Verification**: Identify Bedrock players by username prefix
- **Special Handling**: Configure exempt or ignore modes for legitimate Bedrock users

### Advanced Detection
- **Multiple Check Modes**: Customize which checks are active and their severity
- **Configurable Actions**: Define custom punishment commands for each violation type
- **Real-time Alerts**: Notify staff when suspicious activity is detected

### Diagnostic Tools
- **Player Inspection**: Check detailed client information of any player
- **Brand Analysis**: View and verify client brands in real-time
- **Channel Listing**: Inspect registered plugin channels for any player

### Discord Integration
- **Webhook Support**: Send alerts to your Discord server
- **Customizable Embeds**: Configure colors, fields, and formatting
- **Comprehensive Data**: Include player details, violation reasons, and more

### PlaceholderAPI Support
- **Client Information**: Access player client details from other plugins
- **Detection Status**: Check if players are using modified clients
- **Bedrock Integration**: Verify Bedrock player status

### Rich Color Messaging

* **Hybrid formatting engine** – one string can mix

  * MiniMessage tags `<gradient:#ff7f00:#ffd700><bold>Hello</bold></gradient>`
  * Legacy `&` color/style codes `&aGreen &lBold`
  * Hex colours `&#FFAA00` or `&x&F&F&A&A&0&0`
* Powered by the new `MessageUtil.miniMessage()` helper, so every configurable alert, Discord embed, or command output can use gradients, bold, italics, obfuscated text, etc.

---

## 📦 Download Options

AntiSpoof is available in two versions to suit different server setups:

### Full Version (Recommended for most users)
- **All-in-one package** with PacketEvents included
- No additional plugins required
- Simple drop-in installation
- Larger file size but simpler setup

### Lite Version (For advanced setups)
- **Requires external [PacketEvents 2.7.1+](https://github.com/retrooper/packetevents) installation**
- Significantly smaller file size
- Prevents duplicate PacketEvents instances
- Ideal for servers already using plugins that depend on PacketEvents
- Better for performance on servers with multiple PacketEvents-based plugins

Both versions provide identical functionality - the only difference is whether PacketEvents is included in the JAR file or needs to be installed separately.

---

## 🎯 What AntiSpoof Can Do

AntiSpoof is designed to catch the vast majority of cheaters who don't properly spoof their client brand or channels:

### 1. Detect Obvious Spoofers
Most hacked clients (like Wurst, Meteor, Impact, LiquidBounce, etc.) don't properly spoof their brand or channel information. Their modifications often leave telltale signs that AntiSpoof can easily detect.

### 2. Enforce Vanilla-Only Policies
Identify players who claim to be using "vanilla" but have registered plugin channels (which is technically impossible with a true vanilla client).

### 3. Block or Whitelist Specific Clients
Use powerful regex patterns to control exactly which client brands and channels are allowed on your server, giving you granular control over which modifications are permitted.

### 4. Protect Against Geyser Spoofing
Detect Java players who attempt to disguise themselves as Bedrock players to bypass security measures.

### 5. Create Custom Security Policies
The flexible configuration system allows you to tailor the plugin to your specific server's needs, from extremely strict (vanilla only) to more permissive (allowing certain mods).

---

## ⚠️ What AntiSpoof Cannot Do

Due to Minecraft's inherent limitations, there are some things that AntiSpoof cannot detect:

### 1. Stop Sophisticated Spoofers
A determined cheater with a custom client can spoof both their client brand and channels to perfectly mimic a vanilla client. However, such sophisticated spoofing is extremely rare and requires significant technical knowledge.

### 2. Detect VPNs or Alt Accounts
AntiSpoof focuses on client-side detection and does not include IP-based or account-based checks. For these protections, you would need additional security plugins.

### 3. Replace a Full Anti-Cheat
AntiSpoof is not designed to detect in-game cheats like fly hacks, kill aura, or other movement/combat hacks. It complements traditional anti-cheat plugins but does not replace them.

### 4. Guarantee 100% Protection
No anti-cheat solution can provide absolute protection. AntiSpoof is a powerful layer in your security stack but works best when combined with other protective measures.

---

## 💪 Why AntiSpoof is the Best Solution

Despite the limitations, AntiSpoof remains one of the most effective tools for detecting modified clients:

### 1. Catches 95% of Spoofing Cheaters
The vast majority of cheaters don't use sophisticated spoofing techniques. AntiSpoof catches these players easily, blocking most hacked clients with minimal false positives.

### 2. Highly Customizable
Every server has different needs. AntiSpoof's extensive configuration options allow you to tailor the plugin precisely to your requirements, from very strict to more permissive.

### 3. Specialized Use Cases
Whether you want to block non-vanilla clients entirely, enforce specific mod policies, or just protect against Geyser spoofing, AntiSpoof has you covered with targeted detection methods.

### 4. Realistic Expectations
AntiSpoof acknowledges Minecraft's limitations and focuses on what *can* be done effectively rather than making unrealistic promises. This honesty and transparency is why server owners trust it.

### 5. Lightweight & Efficient
Designed with performance in mind, AntiSpoof has minimal impact on your server's resources while providing robust protection.

---

## 🧠 Design Philosophy

AntiSpoof was built with several core principles in mind:

### Granular Control Over Client Types
Instead of a traditional blacklist/whitelist approach, AntiSpoof implements a sophisticated per-brand configuration system. This allows server administrators to:

- Define precise detection criteria for specific clients
- Set custom policies for different client types
- Craft tailored responses to various violations

### Defense in Depth
The plugin uses multiple layers of detection to catch different types of spoofing:
- Client brand verification
- Channel pattern analysis
- Channel registration monitoring
- Bedrock authentication checks

This multi-layered approach ensures that even if one check is bypassed, others may still catch suspicious activity.

### Balance Between Security and Usability
AntiSpoof strikes a careful balance between:
- Strong security measures to catch malicious clients
- Flexibility to allow legitimate client modifications
- Clear, actionable alerts for server staff
- Minimal false positives to avoid frustrating genuine players

### Transparent Operation
The plugin is designed to provide clear visibility into what it's detecting and why:
- Comprehensive debug logging options
- Detailed check commands for staff
- Explicit violation messages
- User-friendly configuration format

This transparency helps administrators understand exactly how the plugin is working and make informed adjustments to their security policies.

---

## 🔧 Installation

### Requirements
- Java 21 or higher
- Spigot, Paper, or compatible fork (1.8.9-1.21.5)
- Appropriate server permissions to install plugins

### Optional Dependencies
- **Floodgate** (for better Bedrock player detection)
- **PlaceholderAPI** (for placeholders in other plugins)
- **ViaVersion/ViaBackwards** (for version compatibility information)
- **PacketEvents 2.7.1+** (required for Lite version only)

### Installing the Full Version
1. Download the latest `antispoof-[version].jar` from the [releases page](https://github.com/GigaZelensky/AntiSpoof/releases)
2. Place the JAR file in your server's `plugins` folder
3. Restart your server
4. Configure the plugin via the generated `plugins/AntiSpoof/config.yml` file
5. Apply changes with `/antispoof reload`

### Installing the Lite Version
1. First, ensure PacketEvents 2.7.1+ is installed:
   - Download [PacketEvents 2.7.1+](https://github.com/retrooper/packetevents/releases)
   - Place the PacketEvents JAR in your server's `plugins` folder
2. Download the latest `antispoof-lite-[version].jar` from the [releases page](https://github.com/GigaZelensky/AntiSpoof/releases)
3. Place the AntiSpoof Lite JAR in your server's `plugins` folder
4. Restart your server
5. Configure the plugin via the generated `plugins/AntiSpoof/config.yml` file
6. Apply changes with `/antispoof reload`

---

## 🔍 Commands & Permissions

### Command Reference
| Command | Description | Permission |
|---------|-------------|------------|
| `/antispoof check [player]` | Check if a player is spoofing (empty for all online players) | `antispoof.command` |
| `/antispoof runcheck [player]` | Re-analyze player data and run detection checks again | `antispoof.admin` |
| `/antispoof channels <player>` | View a player's registered plugin channels | `antispoof.command` |
| `/antispoof brand <player>` | Show a player's client brand | `antispoof.command` |
| `/antispoof reload` | Reload the configuration | `antispoof.admin` |
| `/antispoof blockedchannels` | Show current channel whitelist/blacklist configuration | `antispoof.admin` |
| `/antispoof blockedbrands` | Show current brand whitelist/blacklist configuration | `antispoof.admin` |
| `/antispoof help` | Display help message with all commands | `antispoof.command` |

### Permission Nodes
| Permission | Description | Default |
|------------|-------------|---------|
| `antispoof.command` | Access to basic AntiSpoof commands | op |
| `antispoof.admin` | Access to administrative commands like reload | op |
| `antispoof.alerts` | Receive in-game alerts when spoofing is detected | op |
| `antispoof.bypass` | Bypass all spoofing checks | false |

---

## 🔄 PlaceholderAPI Integration

AntiSpoof integrates with PlaceholderAPI to provide useful placeholders for other plugins. This allows you to display client information on scoreboard plugins, tab list plugins, chat formatting plugins, and more.

### Available Placeholders

| Placeholder | Description | Example Output |
|-------------|-------------|----------------|
| `%antispoof_brand%` | Shows the player's client brand | "vanilla", "fabric", "lunarclient:v1.8.9-10b0" |
| `%antispoof_channels%` | Shows a comma-separated list of player's registered channels | "minecraft:brand, fabric:registry/sync, fabric:screen-handler-api" |
| `%antispoof_channels_count%` | Shows the number of registered channels | "5" |
| `%antispoof_is_spoofing%` | Returns whether the player is detected as spoofing | "true" or "false" |
| `%antispoof_is_bedrock%` | Returns whether the player is detected as a Bedrock player | "true" or "false" |

### Usage Examples

Here are some examples of how you can use these placeholders:

#### Chat Format (with a chat plugin)
```
[%antispoof_brand%] %player_name%: %message%
```

#### Welcome Message (with an essentials-like plugin)
```
&aWelcome! &7You're using &e%antispoof_brand%&7 with &e%antispoof_channels_count%&7 plugin channels.
```

#### Custom Scoreboard
```
&6═════ &bServer Info &6═════
&7Client: &e%antispoof_brand%
&7Channels: &e%antispoof_channels_count%
&7Bedrock: &e%antispoof_is_bedrock%
&6════════════════════
```

### Setup Instructions

1. Ensure PlaceholderAPI is installed on your server
2. No additional setup required - AntiSpoof registers its placeholders automatically
3. Use the placeholders in any PlaceholderAPI-compatible plugin

---

## ⚙️ Configuration

The configuration file (`config.yml`) is extensively documented with comments explaining each option. Here's a breakdown of the key sections:

### Core Settings
- **delay-in-seconds**: Time to wait after login before checking a player (default: 1)
- **debug**: Enable detailed logging for troubleshooting (default: false)

### Detection Methods
1. **Vanilla Spoof Check**: Detect players claiming to use vanilla with plugin channels
2. **Non-Vanilla Check**: Optionally block all clients that aren't vanilla (strict mode)
3. **Channel Filtering**: Block or whitelist specific plugin channels with regex support
4. **Brand Filtering**: Block or whitelist specific client brands with regex support
5. **Bedrock Handling**: Special processing for legitimate Bedrock players
6. **Geyser Spoof Detection**: Identify Java players pretending to be Bedrock

### Client Brands Configuration System

The `client-brands` section allows for sophisticated control over different client types. Each brand configuration includes:

- **Identification**: Regex patterns to identify specific client brands
- **Flag/Alert Settings**: Whether to flag, alert, or send to Discord
- **Custom Messages**: Brand-specific alert messages
- **Punishment Controls**: Whether to punish and what commands to run
- **Required Channels**: Channels that must be present for legitimate instances of the client
- **Special Handling**: Features like strict-check for modified vanilla clients

Example brand configuration:
```yaml
lunar:
  enabled: true
  values:
    - "^lunarclient:v\\d+\\.\\d+\\.\\d+-\\d{4}$"
  # Whether to count the player as flagged by AntiSpoof
  flag: false
  # Whether to send in-game alerts for this brand
  alert: true
  # Whether to send Discord alerts for this brand
  discord-alert: false
  # Custom alert messages for this brand
  alert-message: "&8[&eAntiSpoof&8] &7%player% is using &9Lunar Client &7version: &b%brand%"
  console-alert-message: "%player% is using Lunar Client: %brand%"
  # Whether to punish players using this brand
  punish: false
  # Punishment commands if punish is true
  punishments: []
  # Channels that must be present for this brand to be legitimate
  required-channels:
    - "lunar.*"  # Must have at least one lunar channel
  # Punish players if they do not have the channel(s)? Set to false to simply alert.
  required-channels-punish: false
  required-channels-punishments:
    - "kick %player% &cLunar Client spoofing detected"
```

This system allows you to create tailored policies for each client type, rather than a one-size-fits-all approach.

### Action Configuration
For each detection method, you can configure:
- Whether it's enabled
- Custom alert messages
- Whether violations trigger punishment
- Custom punishment commands with placeholders

### Discord Integration
- Webhook URL and formatting options
- Customizable embed content
- Alert filtering options

The config.yml is thoroughly documented with examples and explanations. For a full example, refer to the default configuration included with the plugin.

---

## 🔬 How It Works

AntiSpoof uses multiple detection techniques to identify clients attempting to bypass security measures:

### 1. Client Brand Analysis
When a player joins, they send their client brand as a packet (e.g., "vanilla", "forge", "fabric"). AntiSpoof captures this information and compares it against your configured whitelist or blacklist.

### 2. Plugin Channel Registration
Modified clients register plugin channels to communicate with the server. A true vanilla client has no plugin channels, so any client claiming to be "vanilla" but registering channels is spoofing.

### 3. Pattern Matching
Sophisticated regex pattern matching allows AntiSpoof to identify specific client types or block certain patterns, even when clients try to disguise themselves.

### 4. Bedrock Authentication
For Geyser/Floodgate setups, AntiSpoof verifies Bedrock players either through the Floodgate API or by checking username prefixes, preventing Java players from pretending to be Bedrock users.

### 5. Dynamic Checks
After initial registration, AntiSpoof continues to monitor channel registrations, allowing it to detect clients that attempt to add suspicious channels later in the session.

---

## 🔧 Troubleshooting

### Common Issues

#### Players Being Falsely Flagged
1. **Issue**: Legitimate players are being flagged as spoofers
   - **Solution**: Check your whitelist/blacklist settings. You may have blocked legitimate client brands. Enable debug mode to see what's triggering the flags.

#### No Alerts Being Sent
1. **Issue**: Players are spoofing but no alerts are appearing
   - **Solution**: Make sure staff have the `antispoof.alerts` permission and verify the plugin is properly enabled.

#### Discord Webhook Not Working
1. **Issue**: Alerts aren't being sent to Discord
   - **Solution**: Check your webhook URL, ensure it's correctly formatted, and verify that the `discord.enabled` setting is set to `true`.

#### Performance Concerns
1. **Issue**: Server lag after installing AntiSpoof
   - **Solution**: The plugin is very lightweight, but try increasing the `delay-in-seconds` value to spread out checks or disable the `debug` mode.

### Debug Mode

Enable debug mode in the config.yml file to get detailed information about detected brands and channels:

```yaml
debug: true
```

This will log all client brands and channel registrations to your console, helping you identify what's triggering flags and adjust your configuration accordingly.

---

## ❓ Frequently Asked Questions

### General Questions

**Q: Which version should I use - Full or Lite?**  
A: Use the Full version for simplicity. Use the Lite version if you already have other plugins that use PacketEvents to avoid library duplication.

**Q: How does AntiSpoof handle Bedrock players?**  
A: It uses Floodgate API when available and falls back to username prefix checking. You can set the mode to "EXEMPT" or "IGNORE" in the config.

**Q: What's considered a vanilla client?**  
A: In Minecraft terms, a vanilla client is the unmodified game client from Mojang, which reports "vanilla" as its brand and has zero registered plugin channels.

**Q: Can AntiSpoof stop all cheaters?**  
A: No, but it can stop up to 95% of them depending on your setup. Sophisticated spoofing is rare and requires custom clients.

**Q: Does this work with ViaVersion?**  
A: Yes! AntiSpoof is fully compatible with ViaVersion and can even use ViaVersion's information to enhance its detection capabilities.

**Q: Will this block all modified clients?**  
A: This depends on your configuration. You can set it to block all non-vanilla clients, or you can whitelist specific client brands that you want to allow (like Lunar Client or Badlion).

**Q: How does this compare to traditional anti-cheat plugins?**  
A: AntiSpoof focuses specifically on client brand and channel detection, which is a different approach from movement/combat hack detection. It's best used alongside traditional anti-cheat plugins for complete protection.

**Q: What does the `/antispoof runcheck` command do?**  
A: This command re-analyzes existing player data and re-runs the detection checks for a player or all online players. It's useful when you've updated your configuration and want to check players against the new rules without making them rejoin.

### Technical Questions

**Q: Can players bypass this plugin?**  
A: Sophisticated hackers with custom clients can potentially bypass any detection method. However, the vast majority of cheaters don't go to those lengths.

**Q: Does AntiSpoof work with Velocity/BungeeCord/Waterfall?**  
A: AntiSpoof is designed for Spigot/Paper servers. While it works in a proxy environment, it should be installed on the backend servers, not on the proxy itself.

**Q: What are plugin channels?**  
A: Plugin channels are communication channels that mods and plugins use to exchange data between client and server. They're how most mods implement their functionality.

**Q: How do I add custom regex patterns?**  
A: Add your patterns to the `values` list under either `blocked-brands` or `blocked-channels`. For example, to block all Fabric mods, you might add `"(?i).*fabric.*"`.

**Q: What's the performance impact?**  
A: AntiSpoof is extremely lightweight. The checks only run when players join and when channel registration packets are sent, which is infrequent.

---

## 🤝 Support & Development

### Getting Help
- **GitHub Issues**: Report bugs or suggest features on our [Issue Tracker](https://github.com/GigaZelensky/AntiSpoof/issues)
- **Discord**: Message me on Discord for direct support (GigaZelensky)

### Contributing
Contributions are welcome! To contribute:
1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

### Development Guidelines
- Ensure compatibility with Java 21+
- Follow existing code style and architecture
- Add appropriate documentation for new features
- Maintain backward compatibility when possible

---

## 📋 Complete Configuration Example

```yaml
#        ___          __  _ _____                   ____
#       /   |  ____  / /_(_) ___/____  ____  ____  / __/
#      / /| | / __ \/ __/ /\__ \/ __ \/ __ \/ __ \/ /_  
#     / ___ |/ / / / /_/ /___/ / /_/ / /_/ / /_/ / __/  
#    /_/  |_/_/ /_/\__/_//____/ .___/\____/\____/_/     
#                            /_/                        
#                   Made by GigaZelensky

# ──────────────────────────────────────────────────────────
#                  AntiSpoof Configuration
# ──────────────────────────────────────────────────────────
# Welcome to AntiSpoof. This plugin helps server admins detect and manage 
# client-side modifications by analyzing client information sent by players.
#
# ⚠️ Note: While this plugin enhances security, it is not foolproof. 
# Skilled users can (ironically) spoof their client details to bypass detection.
#
# By default, the plugin only verifies whether a player claiming to use
# 'vanilla' has registered plugin channels, something that is impossible
# on a true vanilla client.
# ──────────────────────────────────────────────────────────

# ⏳ Delay (in seconds) before checking for client spoofing.
# Set to 0 for an immediate check upon player login (unrealiable). (Default: 1)
delay-in-seconds: 1

# ️ Debug Mode
# If enabled, logs client channels and brand details in the console when a player logs in.
debug: false

# ──────────────────────────────────────────────────────────
#                  Core Detection Settings
# ──────────────────────────────────────────────────────────

# Vanilla Spoof Detection
# Detects when a player claims to use vanilla but has registered plugin channels
vanillaspoof-check:
  # Whether to check if a player claiming "vanilla" client has plugin channels
  enabled: true
  # Whether to send alerts to Discord for this violation type
  discord-alert: true
  # Custom alert messages for this specific violation
  alert-message: "&8[&cAntiSpoof&8] &e%player% flagged! &cVanilla client with plugin channels"
  console-alert-message: "%player% flagged! Vanilla client with plugin channels"
  # Whether to punish the player if detection is positive
  punish: false
  # Punishment actions to execute
  # Available placeholders: %player%, %reason%, %brand%, %channel%
  punishments:
    - "kick %player% &cVanilla spoof detected: %reason%"
    # - "ban %player% &cVanilla client spoofing detected"

# Super Strict Mode (Not Recommended)
# Blocks players who either:
#    - Do NOT have a "vanilla" client, OR
#    - Have registered plugin channels (indicating mods/plugins)
# ⚠️ This is an extremely strict mode and may block legitimate players
non-vanilla-check:
  # Whether to enable this strict check
  enabled: false
  # Whether to send alerts to Discord for this violation type
  discord-alert: false
  # Custom alert messages for this specific violation
  alert-message: "&8[&cAntiSpoof&8] &e%player% flagged! &cClient modifications detected"
  console-alert-message: "%player% flagged! Client modifications detected"
  # Whether to punish the player if detection is positive
  punish: false
  # Punishment actions to execute
  # Available placeholders: %player%, %reason%, %brand%, %channel%
  punishments:
    - "kick %player% &cNon-vanilla client with channels detected"
    # - "tempban %player% 1h &cUsing a modified client"

# ──────────────────────────────────────────────────────────
#               No Brand Detection Settings
# ──────────────────────────────────────────────────────────
# Some hacked clients avoid detection by not sending a client brand at all
# This check flags players who connect without providing any brand information
no-brand-check:
  # Whether to flag players who don't send a client brand
  enabled: true
  # Whether to send alerts to Discord for this violation type
  discord-alert: true
  # Custom alert messages for this specific violation
  alert-message: "&8[&cAntiSpoof&8] &e%player% flagged! &cNo client brand detected"
  console-alert-message: "%player% flagged! No client brand detected"
  # Whether to punish the player if detection is positive
  punish: false
  # Punishment actions to execute
  # Available placeholders: %player%, %reason%
  punishments:
    - "kick %player% &cNo client brand detected"
    # - "ban %player% &cSuspicious client detected (no brand)"

# ──────────────────────────────────────────────────────────
#                 Channel Detection Settings
# ──────────────────────────────────────────────────────────
blocked-channels:
  # Enable channel-based detection
  enabled: false
  # Whether to send alerts to Discord for blocked channel violations
  discord-alert: false
  
  # ⚪ Whitelist Mode
  # - FALSE: Block listed channels.
  # - SIMPLE: Only allow players with at least one whitelisted channel.
  # - STRICT: Only allow players who match the exact whitelist and have no extra channels.
  whitelist-mode: FALSE
  
  # List of channels to block/whitelist
  values:
    - "^fabric-screen-handler-api-v1:open_screen$"
    # Add more channels to block here
    # - "another:blocked:channel"
    # - "(?i).*litematica.*"
    # - "(?i).*fabric.*"

  # Custom alert messages for this specific violation
  alert-message: "&8[&cAntiSpoof&8] &e%player% flagged! &cUsing blocked channel: &f%channel%"
  console-alert-message: "%player% flagged! Using blocked channel: %channel%"

  # Alert when a player's plugin channel is modified
  modifiedchannels:
    enabled: true
    # Whether to send Discord alerts for modified channels
    discord-alert: false
    alert-message: "&8[&cAntiSpoof&8] &e%player% modified channel: &f%channel%"
    console-alert-message: "%player% modified channel: %channel%"

  # Whether to punish the player if detection is positive
  punish: false
  # Punishment actions to execute
  # Available placeholders: %player%, %reason%, %brand%, %channel%
  punishments:
    - "kick %player% &cBlocked channel detected: %channel%"
    # - "tempban %player% 1d &cUsing blocked mod channels"

# ──────────────────────────────────────────────────────────
#                 Client Brands Configuration
# ──────────────────────────────────────────────────────────
# This section allows for granular control over different client types.
# Each brand can have its own detection patterns, alert messages, 
# punishments, and special exemptions.
client-brands:
  # Master switch for the client brands system
  enabled: true
  
  # Default settings for brands not explicitly configured
  default:
    flag: true
    alert: true
    discord-alert: false
    punish: false
    # Default alert message if not specified for a brand
    alert-message: "&8[&cAntiSpoof&8] &7%player% using unknown client: &e%brand%"
    console-alert-message: "%player% using unknown client: %brand%"
  
  # Brand-specific configurations
  brands:
    # Lunar Client Configuration
    lunar:
      enabled: true
      values:
        - "^lunarclient:v\\d+\\.\\d+\\.\\d+-\\d{4}$"
      # Whether to count the player as flagged by AntiSpoof
      flag: false
      # Whether to send in-game alerts for this brand
      alert: true
      # Whether to send Discord alerts for this brand
      discord-alert: false
      # Custom alert messages for this brand
      alert-message: "&8[&eAntiSpoof&8] &7%player% is using &9Lunar Client &7version: &b%brand%"
      console-alert-message: "%player% is using Lunar Client: %brand%"
      # Whether to punish players using this brand
      punish: false
      # Punishment commands if punish is true
      punishments: []
      # Channels that must be present for this brand to be legitimate
      required-channels:
        - "lunar.*"  # Must have at least one lunar channel
      # Punish players if they do not have the channel(s)? Set to false to simply alert.
      required-channels-punish: false
      required-channels-punishments:
        - "kick %player% &cLunar Client spoofing detected"

    # Badlion Client Configuration
    badlion:
      enabled: true
      values:
        - "^badlion.*"
        - "^BLC.*"
      flag: false
      alert: true
      discord-alert: false
      alert-message: "&8[&eAntiSpoof&8] &7%player% is using &b%brand%"
      console-alert-message: "%player% is using Badlion Client: %brand%"
      punish: false
      punishments: []
      required-channels: []
      required-channels-punish: false
      required-channels-punishments:
        - "kick %player% &cLunar Client spoofing detected"

    # Forge Configuration
    forge:
      enabled: true
      values:
        - "^fml,forge.*"
        - "^forge.*"
      flag: false
      alert: true
      discord-alert: false
      alert-message: "&8[&eAntiSpoof&8] &7%player% is using &b%brand%"
      console-alert-message: "%player% is using Forge: %brand%"
      punish: false
      punishments: []
      required-channels:
        - "(?i).*forge.*"
      required-channels-punish: false
      required-channels-punishments:
        - "kick %player% &cChannel spoofing detected"
      
    # Fabric Configuration
    fabric:
      enabled: true
      values:
        - "^fabric$"
      flag: false
      alert: true
      discord-alert: false
      alert-message: "&8[&eAntiSpoof&8] &7%player% is using &b%brand%"
      console-alert-message: "%player% is using Fabric: %brand%"
      punish: false
      punishments: []
      required-channels:
        - "(?i).*fabric.*" # Matches any channel containing "fabric" (case insensitive)
      required-channels-punish: false
      required-channels-punishments:
        - "kick %player% &cChannel spoofing detected"

    # LabyMod Configuration
    labymod:
      enabled: true
      values:
        - "^labymod.*"
      flag: false
      alert: true
      discord-alert: false
      alert-message: "&8[&eAntiSpoof&8] &7%player% is using &b%brand%"
      console-alert-message: "%player% is using %brand%"
      punish: false
      punishments: []
      required-channels: []
      required-channels-punish: false
      required-channels-punishments:
        - "kick %player% &cChannels spoofing detected"

    # Hacked Clients Configuration
    hacked:
      enabled: true
      values:
        - "(?i).*wurst.*"
        - "(?i).*impact.*"
        - "(?i).*aristois.*"
        - "(?i).*future.*"
        - "(?i).*meteor.*"
        - "(?i).*inertia.*"
        - "(?i).*sigma.*"
        - "(?i).*liquidbounce.*"
      flag: true
      alert: true
      discord-alert: true
      alert-message: "&8[&cAntiSpoof&8] &e%player% is using &c&lknown hacked client: &f%brand%"
      console-alert-message: "ALERT! %player% is using known hacked client: %brand%"
      punish: true
      punishments:
        - "kick %player% &cHacked client detected: %brand%"
        # - "ban %player% &cUse of hacked client detected"

    # Vanilla Configuration
    vanilla:
      enabled: true
      values:
        - "^vanilla$"
      flag: false # Only flags if the player is caught spoofing
      alert: false  # Don't alert for vanilla clients by default
      discord-alert: false
      alert-message: "&8[&cAntiSpoof&8] &7%player% is using &d%brand%"
      console-alert-message: "%player% is using %brand%"
      punish: false
      punishments: []
      # Special settings for vanilla
      # "strict-check" flags if the client has ANY plugin channels (Must be enabled to detect VanillaSpoof)
      # You can add this "strict-check" to any client brand and only then will it be processed by the earlier "vanillaspoof-check"
      strict-check: true  # Enable strict checking for vanilla (must have NO channels)

    vanilla-variation: # When a client shows "Vanilla" or "vAnilla2" but not "vanilla"
      enabled: true
      values:
        - "^(?!vanilla$).*?(?i)vanilla.*"
      flag: true
      alert: true
      discord-alert: true
      alert-message: "&8[&cAntiSpoof&8] &e%player% using fake Vanilla: &c%brand%"
      console-alert-message: "%player% is using fake Vanilla: %brand%"
      punish: false
      punishments: []
      strict-check: true

    blankbrand: # When a client sends a blank brand channel
      enabled: true
      values:
        - "^$"   # regex for empty/blank brand
      flag: true
      alert: true
      discord-alert: true
      alert-message: "&8[&eAntiSpoof&8] &7%player% &eis using a blank brand"
      console-alert-message: "%player% is using a blank brand"
      punish: false
      punishments: []

# ──────────────────────────────────────────────────────────
#                Bedrock Handling Settings
# ──────────────────────────────────────────────────────────
bedrock-handling:
  # Choose how to handle Bedrock players.
  # Options:
  #   - "IGNORE": Completely ignore these players; process them like regular players.
  #   - "EXEMPT": Process them but don't punish them for failing checks.
  #
  # Either way, Bedrock players won't get the anti-spoof treatment.
  # "EXEMPT" mode is highly recommended as "IGNORE" can easily falsely punish Bedrock players.
  mode: "EXEMPT"

  # Geyser Spoofing Detection
  # Detects players claiming a client brand including a variation of "geyser" without being verified
  # as Bedrock players by the Floodgate API.
  geyser-spoof:
    # Whether to enable geyser spoofing detection
    enabled: true
    # Whether to send alerts to Discord for Geyser spoofing violations
    discord-alert: true
    # Custom alert messages for this specific violation
    alert-message: "&8[&cAntiSpoof&8] &e%player% flagged! &cGeyser client spoofing"
    console-alert-message: "%player% flagged! Geyser client spoofing with brand: %brand%"

    # Whether to punish the player if detection is positive
    punish: false
    # Punishment actions to execute
    # Available placeholders: %player%, %reason%, %brand%
    punishments:
      - "kick %player% &cGeyser client spoofing detected"
      # - "ban %player% &cGeyser client spoofing"

  # Check Player Prefix:
  # This option checks whether a player is identified as a Bedrock player by verifying their prefix.
  # When enabled, the system will verify if the player's username or identifier starts with the specified prefix.
  # Default prefix is ".", and if a player's client brand includes "geyser" in any form without matching
  # the expected prefix, they will be flagged.
  prefix-check:
    enabled: true
    # The prefix used to identify Bedrock players.
    prefix: "."

# ──────────────────────────────────────────────────────────
#                 Discord Webhook Settings
# ──────────────────────────────────────────────────────────
discord:
  enabled: false
  webhook: ""
  embed-title: "**AntiSpoof Alert**"
  embed-color: "#2AB7CA"
  violation-content:
    - "**Player**: %player%"
    - "**Violations**:%violations%"
    - "**Client Version**: %viaversion_version%" # Requires Viaversion and PlaceholderAPI
    - "**Brand**: %brand%"
    - "**Channels**:"
    - "%channel%" # Vertical channel list

# Global settings for all alerts (used as fallback)
# These options control whether to send join messages for players to Discord
# even when they don't trigger any violations
global-alerts:
  # Whether to send alerts to Discord when players join with a brand
  join-brand-alerts: false
  # Whether to send alerts to Discord when players register initial channels
  initial-channels-alerts: false

# ──────────────────────────────────────────────────────────
#                  Update Checker Settings
# ──────────────────────────────────────────────────────────
# Checks for updates from GitHub when the server starts
update-checker:
  # Whether to check for updates on startup
  enabled: true
  # Whether to notify admins when they join
  notify-on-join: true

# ──────────────────────────────────────────────────────────
#                Legacy Punishment Settings
# ──────────────────────────────────────────────────────────
# Legacy global punishment system (for backward compatibility)
# These punishments will be used if a specific check has 'punish: true'
# but doesn't have its own punishments defined
# Available placeholders: %player%, %reason%, %brand%, %channel%
punishments:
  - "kick %player% &cSuspicious client detected!"
  # - "ban %player% &cClient spoofing detected"

# ──────────────────────────────────────────────────────────
#                 Legacy Alert Messages
# ──────────────────────────────────────────────────────────
# Legacy global alert system (for backward compatibility)
# These messages will be used if a specific check is enabled
# but doesn't have its own alerts defined
# Available placeholders: %player%, %reason%, %brand%, %channel%
# Defines the message sent to players with the `antispoof.alerts` permission
# when a spoofing attempt is detected.
messages:
  # Message shown to players with antispoof.alerts permission
  alert: "&8[&cAntiSpoof&8] &e%player% flagged! &c%reason%"
  # Message logged to console (no color codes needed)
  console-alert: "%player% flagged! %reason%"
  # Message for multiple violations
  multiple-flags: "&8[&cAntiSpoof&8] &e%player% has multiple violations: &c%reasons%"
  # Message for console when multiple violations
  console-multiple-flags: "%player% has multiple violations: %reasons%"
```

---

## 📄 License

AntiSpoof is licensed under the GNU General Public License v3.0 - see the LICENSE file for details.

```
Copyright (C) 2025 GigaZelensky

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.
```

---

<div align="center">
  <p>Made with ❤️ by GigaZelensky</p>
  <p>⭐ Star us on GitHub if you find this plugin useful! ⭐</p>
</div>
