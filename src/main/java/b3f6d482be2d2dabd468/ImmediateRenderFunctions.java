package com.moon.scripting.api.functions.render;

import com.moon.scripting.api.enums.CustomFontType;
import com.moon.scripting.documentation.annotation.Description;
import com.moon.scripting.documentation.annotation.FunctionContainer;
import com.moon.scripting.documentation.annotation.Parameter;

@FunctionContainer(
   value = "render/immediate",
   path = "functions/render/immediate"
)
@Description("Contains non-recommended rendering functions for immediate rendering<br><br>## USAGE NOT RECOMMENDED ##<br><bold>Please refer to `render.batched` for proper rendering unless you want to use minecraft font!<bold>")
public interface ImmediateRenderFunctions {
   void text(
      @Parameter("font_type") @Description("The type of font to render the text with") CustomFontType var1,
      @Parameter("text") @Description("The text to be rendered") String var2,
      @Parameter("size") @Description("The font size to use") float var3,
      @Parameter("x") @Description("The x position") float var4,
      @Parameter("y") @Description("The y position") float var5,
      @Parameter("color") @Description("The color") int var6,
      @Parameter("shadow") @Description("Whether to apply a drop-shadow or not") boolean var7
   );

   @Description("Renders a rectangle at the given position with the given boundaries and color")
   void rect(
      @Parameter("x") @Description("The x position") float var1,
      @Parameter("y") @Description("The y position") float var2,
      @Parameter("width") @Description("The width") float var3,
      @Parameter("height") @Description("The height") float var4,
      @Parameter("color") @Description("The color") int var5
   );

   @Description("Renders an outlined rounded rectangle at the given position with the given boundaries, radius, thickness and color")
   void outline_rounded_rect(
      @Parameter("x") @Description("The x position") float var1,
      @Parameter("y") @Description("The y position") float var2,
      @Parameter("width") @Description("The width") float var3,
      @Parameter("height") @Description("The height") float var4,
      @Parameter("radius") @Description("The corner radius") float var5,
      @Parameter("thickness") @Description("The thickness of the outline") float var6,
      @Parameter("color") @Description("The color") int var7
   );

   @Description("Renders a rounded rectangle at the given position with the given boundaries, radius and color")
   void rounded_rect(
      @Parameter("x") @Description("The x position") float var1,
      @Parameter("y") @Description("The y position") float var2,
      @Parameter("width") @Description("The width") float var3,
      @Parameter("height") @Description("The height") float var4,
      @Parameter("radius") @Description("The corner radius") float var5,
      @Parameter("color") @Description("The color") int var6
   );

   @Description("Renders a text with the minecraft font at the given position")
   void minecraft_text(
      @Parameter("text") @Description("The text to be rendered") String var1,
      @Parameter("x") @Description("The x position") float var2,
      @Parameter("y") @Description("The y position") float var3,
      @Parameter("color") @Description("The color") int var4,
      @Parameter("shadow") @Description("Whether to apply a drop-shadow or not") boolean var5
   );

   @Description("Renders a triangle at the given position with the given color")
   void triangle(
      @Parameter("top_x") @Description("The top x of the triangle") float var1,
      @Parameter("top_y") @Description("The top y of the triangle") float var2,
      @Parameter("left_x") @Description("The left x of the triangle") float var3,
      @Parameter("left_y") @Description("The left y of the triangle") float var4,
      @Parameter("right_x") @Description("The right x of the triangle") float var5,
      @Parameter("right_y") @Description("The right y of the triangle") float var6,
      @Parameter("color") @Description("The color") int var7
   );

   @Description("Renders a gradient rectangle at the given position with the given boundaries and colors")
   void gradient_rect(
      @Parameter("x") @Description("The x position") float var1,
      @Parameter("y") @Description("The y position") float var2,
      @Parameter("width") @Description("The width") float var3,
      @Parameter("height") @Description("The height") float var4,
      @Parameter("from") @Description("The from color") int var5,
      @Parameter("to") @Description("The to color") int var6,
      @Parameter("vertical") @Description("Whether the gradient should be vertical or horizontal") boolean var7
   );
}
