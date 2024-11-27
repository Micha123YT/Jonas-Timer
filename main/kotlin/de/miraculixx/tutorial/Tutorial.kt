package de.miraculixx.tutorial

import de.miraculixx.kpaper.main.KPaper
import de.miraculixx.tutorial.commands.FirstCommand
import de.miraculixx.tutorial.commands.TimerCommand
import dev.jorel.commandapi.CommandAPI
import dev.jorel.commandapi.CommandAPIBukkitConfig
import net.kyori.adventure.text.Component

class Tutorial : KPaper() {


    override fun load() {
        CommandAPI.onLoad(CommandAPIBukkitConfig(this).silentLogs(true))
        server.consoleSender.sendMessage(Component.text("Hey, ich wurde geladen!"))

        FirstCommand()
        TimerCommand()
    }

    override fun startup() {
        CommandAPI.onEnable()
        DamageEvent
        Timer
    }

    override fun shutdown() {
        CommandAPI.onDisable()
        server.consoleSender.sendMessage(Component.text("Ich wurde deaktiviert :("))
    }
}