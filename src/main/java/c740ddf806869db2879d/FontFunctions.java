package com.moon.scripting.api.functions;

import com.moon.scripting.api.enums.CustomFontType;
import com.moon.scripting.documentation.annotation.Description;
import com.moon.scripting.documentation.annotation.FunctionContainer;
import com.moon.scripting.documentation.annotation.Parameter;

@FunctionContainer(
   value = "font",
   path = "functions/font"
)
@Description("Contains several functions to receive height and width boundaries of text")
public interface FontFunctions {
   @Description("Returns the width for the given text when rendered with the given font and size")
   float width(
      @Parameter("type") @Description("The custom font type") CustomFontType var1,
      @Parameter("size") @Description("The text size") float var2,
      @Parameter("text") @Description("The text") String var3
   );

   @Description("Returns the height for the given text when rendered with the given font and size")
   float height(
      @Parameter("type") @Description("The custom font type") CustomFontType var1,
      @Parameter("size") @Description("The text size") float var2,
      @Parameter("text") @Description("The text") String var3
   );

   @Description("Returns the height of the minecraft font")
   float minecraft_height();

   @Description("Returns the width for the given text when rendered with minecraft font")
   float minecraft_width(@Parameter("text") @Description("The text") String var1);
}
