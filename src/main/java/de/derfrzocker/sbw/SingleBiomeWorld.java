/*
 * MIT License
 *
 * Copyright (c) 2021 Marvin (DerFrZocker)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package de.derfrzocker.sbw;

import org.bukkit.block.Biome;
import org.bukkit.generator.BiomeProvider;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SingleBiomeWorld extends JavaPlugin {

    private final static Biome DEFAULT_BIOME = Biome.PLAINS;

    @Nullable
    @Override
    public BiomeProvider getDefaultBiomeProvider(@NotNull String worldName, @Nullable String id) {
        Biome biome;

        if (id == null) {
            getLogger().info("Biome id is null, using default biome " + DEFAULT_BIOME);
            getLogger().info("Do specific a specific biome use: Single-Biome-World:<biome-name>");
            getLogger().info("A list of available biomes can be found here: https://hub.spigotmc.org/javadocs/spigot/org/bukkit/block/Biome.html");
            biome = DEFAULT_BIOME;
        }

        try {
            biome = Biome.valueOf(id.toUpperCase());
            getLogger().info("Using BiomeProvider with single world " + biome);
        } catch (IllegalArgumentException e) {
            getLogger().info("Biome id is not valid, using default biome " + DEFAULT_BIOME);
            getLogger().info("A list of available biomes can be found here: https://hub.spigotmc.org/javadocs/spigot/org/bukkit/block/Biome.html");
            biome = DEFAULT_BIOME;
        }

        return new SingleBiomeProvider(biome);
    }
}
