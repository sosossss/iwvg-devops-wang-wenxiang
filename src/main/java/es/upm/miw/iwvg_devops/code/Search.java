package es.upm.miw.iwvg_devops.code;

import java.util.stream.Stream;

public class Search {

    public double findFirstDecimalFractionByUserName(String name){
        return new UsersDatabase().findAll()
                .filter(user -> user.getName().equals(name))
                .flatMap(user -> user.getFractions().stream())
                .map(Fraction::decimal)
                .findFirst()
                .orElseThrow();
    }

    public Stream<String> findUserIdByAllProperFraction(){
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream().anyMatch(Fraction::isProper))
                .map(User::getId);

    }
}
