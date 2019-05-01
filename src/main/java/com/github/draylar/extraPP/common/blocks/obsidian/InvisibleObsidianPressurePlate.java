package com.github.draylar.extraPP.common.blocks.obsidian;

import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;

public class InvisibleObsidianPressurePlate extends ObsidianPressurePlate
{
    public InvisibleObsidianPressurePlate(Type pressurePlateBlock$Type_1, Settings block$Settings_1)
    {
        super(pressurePlateBlock$Type_1, block$Settings_1);
    }

    @Override
    public BlockRenderType getRenderType(BlockState blockState_1)
    {
        return BlockRenderType.INVISIBLE;
    }
}
