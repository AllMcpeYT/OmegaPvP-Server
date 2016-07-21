package cn.nukkit.item;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
public class ItemHelmetDiamond extends ItemArmor {

    public ItemHelmetDiamond() {
        this(0, 1);
    }

    public ItemHelmetDiamond(Integer meta) {
        this(meta, 1);
    }

    public ItemHelmetDiamond(Integer meta, int count) {
        super(DIAMOND_HELMET, meta, count, TextFormat.AQUA + "Diamond Helmet");
    }

    @Override
    public int getTier() {
        return ItemArmor.TIER_DIAMOND;
    }

    @Override
    public boolean isHelmet() {
        return true;
    }
}
