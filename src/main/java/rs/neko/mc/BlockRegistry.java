/*
 * Copyright (c) 2022 mc.neko.rs contributors <https://mc.neko.rs>
 *
 * Licensed with GNU Lesser General Public License v3.0
 */

package rs.neko.mc;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public interface BlockRegistry extends ItemRegistry {
  default Item asItem() {
    return asBlock().asItem();
  }
  public Block asBlock();
}