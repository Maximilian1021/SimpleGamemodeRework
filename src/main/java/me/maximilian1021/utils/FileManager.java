package me.maximilian1021.utils;

import org.bukkit.configuration.file.YamlConfiguration;
import java.io.File;
import java.io.IOException;

public class FileManager {
    public static void createLanguageFile() {
        File file = new File("plugins/SimplePlugins", "SimpleGamemodeLang.yml");
        YamlConfiguration lang = YamlConfiguration.loadConfiguration(file);
        if (!file.exists()) {
            lang.set("Language", "German");

            lang.set("German.Prefix","§f[§b[GM§f]");
            lang.set("German.NoPerm", "§c Du hast nicht genügend Rechte dafür!");
            lang.set("German.NoPlayer", "§c Du musst ein Spieler sein um den Command auszuführen");
            lang.set("German.NotOn", "§c Dieser Speieler ist nicht online!");
            lang.set("German.CHGCreative", "§a Dein Gamemode wurde auf §bCreative §agesetzt!");
            lang.set("German.CHGSurvival", "§a Dein Gamemode wurde auf §bSurvival §agesetzt!");
            lang.set("German.CHGAdventure", "§a Dein Gamemode wurde auf §bAdventure §agesetzt!");
            lang.set("German.CHGSpectate", "§a Dein Gamemode wurde auf §bSpectator §agesetzt!");

            lang.set("English.Prefix", "§f[§bGM§f]");
            lang.set("English.NoPerm", "§c You don't have the permission to do this!");
            lang.set("English.NoPlayer", "§c You have to be a player to use this command!");
            lang.set("English.NotOn", "§c The selected Player isn´t online!");
            lang.set("English.CHGCreative", "§a Your Gamemode has been updated to §bCreative");
            lang.set("English.CHGSurvival", "§a Your Gamemode has been updated to §bSurvival");
            lang.set("English.CHGAdventure", "§a Your Gamemode has been updated to §bAdventure");
            lang.set("English.CHGSpectate", "§a Your Gamemode has been updated to §bSpectator");

            lang.set("Nederlands.Prefix","§f[§b[GM§f]");
            lang.set("Nederlands.NoPerm","§c Je hebt geen toestemming om dit te doen");
            lang.set("Nederlands.NoPlayer","§c Je moet een speler zijn om dit commando te gebruiken");
            lang.set("Nederlands.NotOn", "§c De geselecteerde speler is niet online!");
            lang.set("Nederlands.CHGCreative","§a Uw gamemode is geüpdatet tot §bcreatieve");
            lang.set("Nederlands.CHGSurvival","§a Uw gamemode is geüpdatet tot §boverleving");
            lang.set("Nederlands.CHGAdventure","§a Uw gamemode is geüpdatet tot §bavontuur");
            lang.set("Nederlands.CHGSpectate", "§a Uw gamemode is geüpdatet tot §btoeschouwer");
        }
        try {
            lang.save(file);
        } catch (IOException e) {
            System.out.println("Fehler in der Configuration");
            e.printStackTrace();
        }
    }

    public static File getLangFile() {
        return new File("plugins/SimplePlugins", "SimpleGamemodeLang.yml");
    }
}
