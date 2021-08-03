package SummerBeast.relics;

import SummerBeast.SummerBeast;

import static SummerBeast.SummerBeastMod.makeID;

public class TodoItem extends AbstractEasyRelic {
    public static final String ID = makeID("TodoItem");

    public TodoItem() {
        super(ID, RelicTier.STARTER, LandingSound.FLAT, SummerBeast.Enums.PACIFIC_BLUE_COLOR);
    }
}
