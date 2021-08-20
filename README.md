# Single-Biome-World

**Requires 1.17.1 Spigot Build 3218 or higher**

With this plugin you can create single biome worlds.

## Installation

1. Maker sure you are running 1.17.1 Spigot Build 3218 or higher
2. Drop the plugin into your plugin folder
3. Open bukkit.yml and add the following to the end
```
worlds:
  <world-name>:
    biome-provider: Single-Biome-World:<biome-name>
```
4. Replace `<world-name>` with the name of your world
5. Replace `<biome-name>` with the name of the biome you can find the names [here](https://hub.spigotmc.org/javadocs/spigot/org/bukkit/block/Biome.html)
6. Save the file and start your server

You can use it for multiple worlds by simple adding a new entry for each world.

**As an example this while generated only desert in your overworld:**
```
worlds:
  world:
    biome-provider: Single-Biome-World:DESERT
```
![Imgur](https://i.imgur.com/PoavRyE.png?1)