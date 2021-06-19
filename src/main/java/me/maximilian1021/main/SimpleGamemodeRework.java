package me.maximilian1021.main;

import me.maximilian1021.commands.CommandGM;
import me.maximilian1021.utils.FileManager;
import me.maximilian1021.utils.Metrics;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class SimpleGamemodeRework extends JavaPlugin {

    @Override
    public void onEnable() {
        int pluginId = 11747;
        Metrics metrics = new Metrics(this, pluginId);

        Bukkit.getConsoleSender().sendMessage("§b-------------");
        Bukkit.getConsoleSender().sendMessage("§aPlugin-Name:§6 " + getDescription().getName());
        Bukkit.getConsoleSender().sendMessage("§aVersion: §6" + getDescription().getVersion());
        Bukkit.getConsoleSender().sendMessage("§aAuthor: §6" + getDescription().getAuthors());
        Bukkit.getConsoleSender().sendMessage("§aWebsite: §6" + getDescription().getWebsite());
        FileManager.createLanguageFile();

        registerCommands();


        Bukkit.getConsoleSender().sendMessage("§b-------------");



    }

    private void registerCommands() {
        getCommand("gm").setExecutor(new CommandGM());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
