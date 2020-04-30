package application3;

import org.springframework.stereotype.Component;

@Component("rockMusic")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Over and over";
    }
}
