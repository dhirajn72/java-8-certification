/*
 * All Rights Reserved @Dhiraj
 */

package interview;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * @author Dhiraj
 * @date 28/03/19
 */
public class Test2 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList(new String[]{"apple","ball","cat",null,"dog",null,"elephant"});
        //list.forEach(x-> System.out.println(x.length()));
        list.stream().filter(Objects::nonNull).forEach(x->System.out.println(x.length()));
        //Optional.ofNullable(list).get().stream().forEach(x->System.out.println(x.length()));

    }
}
