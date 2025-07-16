package com.himataku.nmo.generator;

import com.himataku.nmo.Main;
import com.himataku.nmo.item.ALLItem;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.Map;


public class AllModels extends ItemModelProvider {
    public AllModels(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, Main.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // 個別登録アイテム
        basicItem(ALLItem.NMO_ICON.get());
        basicItem(ALLItem.HAMMER.get());

        // Map 登録アイテム
        generateMapItems(ALLItem.RAW_ITEMS);
        generateMapItems(ALLItem.INGOT_ITEMS);
        generateMapItems(ALLItem.NUGGET_ITEMS);
        generateMapItems(ALLItem.SHEET_ITEMS);
        generateMapItems(ALLItem.ROD_ITEMS);
        generateMapItems(ALLItem.WIRE_ITEMS);
        generateMapItems(ALLItem.COIL_ITEMS);
        generateMapItems(ALLItem.COGWHEEL_ITEMS);
        generateMapItems(ALLItem.GEAR_ITEMS);
        generateMapItems(ALLItem.TINY_ITEMS);
        generateMapItems(ALLItem.BALL_ITEMS);
        generateMapItems(ALLItem.SHAFT_ITEMS);
    }

    private void generateMapItems(Map<String, ? extends net.neoforged.neoforge.registries.DeferredItem<Item>> map) {
        for (var entry : map.values()) {
            basicItem(entry.get());
        }
    }

}
