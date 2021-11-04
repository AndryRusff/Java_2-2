public class BonusMilesService {
    public long calculate(int cost) {
        int oneBonusMile = 20;
        int miles = cost / oneBonusMile;
        return miles;
}
}
