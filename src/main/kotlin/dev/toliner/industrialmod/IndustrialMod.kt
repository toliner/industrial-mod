package dev.toliner.industrialmod

import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.toliner.korgelin.api.KotlinMod
import net.toliner.korgelin.container.KotlinModLoadingContext
import java.util.logging.LogManager
import javax.annotation.Nonnull


@KotlinMod(IndustrialMod.MODID)
object IndustrialMod {
    private val logger = LogManager.getLogManager()!!

    const val MODID: String = "industrialmod"    // rename "mystechrious"
    const val MODNAME: String = "Industrial Mod" // rename "Mystechrious"

    init {
        KotlinModLoadingContext.get().eventBus.apply {

        }
    }

    val itemGroup: ItemGroup = object : ItemGroup(MODID) {
        @Nonnull
        override fun createIcon(): ItemStack { return ItemStack(Items.DIAMOND) }
    }
}