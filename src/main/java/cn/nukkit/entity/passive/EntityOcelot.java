package cn.nukkit.entity.passive;

import cn.nukkit.item.Item;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class EntityOcelot extends EntityAnimal {

    public static final int NETWORK_ID = 22;

    public EntityOcelot(FullChunk chunk, CompoundTag nbt) {
        super(chunk, nbt);
    }

    @Override
    public float getWidth() {
        return 0.6f;
    }

    @Override
    public float getLength() {
        return 0.6f;
    }

    @Override
    public float getHeight() {
        if (isBaby()) {
            return 0.8f;
        }
        return 0.8f;
    }

    @Override
    public float getEyeHeight() {
        if (isBaby()) {
            return 0.8f * getHeight();
        }
        return 0.8f * getHeight();
    }

    @Override
    public String getName() {
        return this.getNameTag();
    }

    @Override
    public Item[] getDrops() {
        return new Item[]{Item.get(Item.GOLD_INGOT), Item.get(Item.DIAMOND)};
    }

    @Override
    public int getNetworkId() {
        return NETWORK_ID;
    }

    @Override
    public void initEntity() {
        super.initEntity();
        setMaxHealth(8);
    }
}
