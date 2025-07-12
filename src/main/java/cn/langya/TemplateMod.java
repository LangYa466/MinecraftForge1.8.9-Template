package cn.langya;

import net.minecraftforge.fml.common.Mod;
import org.lwjgl.opengl.Display;

@Mod(modid = TemplateMod.ModID)
public class TemplateMod {
    public static final String ModID = "Template";
    public TemplateMod() {
        // test
        Display.setTitle(ModID);
    }
}
