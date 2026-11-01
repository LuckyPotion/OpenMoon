package moom;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

class OB extends Authenticator {
   final String a;
   final String b;

   OB(String var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   @Override
   protected PasswordAuthentication getPasswordAuthentication() {
      return new PasswordAuthentication(this.a, this.b.toCharArray());
   }
}
