package com.project.horus_task;

import java.util.List;
import java.util.Optional;

public class Wall implements Structure {
    private final List<Block> blocks;

    public Wall(CompositeBlock compositeBlock) {
        this.blocks = compositeBlock.getBlocks();
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        return blocks.stream().filter(block -> block.getColor().equalsIgnoreCase(color)).findAny();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return blocks.stream().filter(block -> block.getMaterial().equalsIgnoreCase(material)).toList();
    }

    @Override
    public int count() {
        return blocks.size();
    }
}
