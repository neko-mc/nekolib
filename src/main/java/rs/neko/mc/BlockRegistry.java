/*
 * Copyright (c) 2022 mc.neko.rs contributors <https://mc.neko.rs>
 *
 * Licensed with GNU Lesser General Public License v3.0
 */

package rs.neko.mc;

import net.minecraft.block.Block;

public interface BlockRegistry extends ItemRegistry {
  public Block asBlock();
}