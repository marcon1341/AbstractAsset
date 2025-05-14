import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> myAsset = new ArrayList<>();
        //adding house
        myAsset.add(new House("My House", "2025-04-04", 600000,
                "400 Dexter ave",2, 3000,5000));
        myAsset.add(new House("Vacation House", "2020-10-10", 1000000, "121 Lake view",1,2000,1500));

        //adding vehicle
        myAsset.add(new Vehicle("My Car","2024-02-10", 45000,
                "Ford F-150", 2024, 10000));
        myAsset.add(new Vehicle("Mom Car", "2018-09-05", 20000,
                "Toyota Camry", 2018, 95000));
        myAsset.add(new Cash("Emergency Cash","2025-0425", 10000));

        //loop through for formating
        for(Asset asset : myAsset){
            String label;
            if(asset instanceof House){
                House h = (House) asset;
                label = "House at " + h.getAddress();
            }
            else if(asset instanceof Vehicle) {
                Vehicle v = (Vehicle) asset;
                label = "Vehicle: " + v.getYear() + " " + v.getMakeModel();
            }
            else if(asset instanceof Cash){
                Cash c =(Cash) asset;
                label = "Cash: "+ c.getDescription();
            }else{
                label = asset.getDescription();
            }
            System.out.printf("""
                    %s
                    Date Acquired: %s
                    Original cost: $%.2f
                    Current Value: $%.2f\n
                    """,label,asset.getDateAcquired(),
                    asset.getOriginalCost(),
                    asset.getValue());
        }
    }
}