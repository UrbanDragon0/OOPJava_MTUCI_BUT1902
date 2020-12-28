import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;

import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.util.*;


/* Хеш-алгоритмы легко сделать одним способом, но по существу невозможно
 сделать наоборот. Например, если вы хешируете что-то простое, например,
 password123, это даст вам длинный код, уникальный для этого слова или фразы. В
 идеале, нет способа сделать это в обратном порядке. Вы не можете взять хеш-код и
 вернуться к слову или фразе, с которых вы начали.*/

public class n8
{
    public static String getSha256Hash(String str)throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] text=digest.digest(str.getBytes(StandardCharsets.UTF_8));
        return HexBin.encode(text).toLowerCase();
    }


    public static void main(String[] args)
    {
        System.out.println(getSha256Hash("password123"));
    }
}




