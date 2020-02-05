package Budget_Manager.stage5;

/**
 * In this Project, we'll use the Strategy Design Pattern because it will be
 * easier to add new features for the next steps, without having to change completely the logic.
 *
 * Description - Stage 5:
 * Do you know how much money you spend on food? On entertainment?
 * It's quite interesting to know since the main purpose of this
 * application is to analyze your expenses. Let's implement this feature!
 *
 * First, add the Analyze item to the menu.
 * This way you will request an analysis of your purchases.
 *
 * Once this item is called you need to offer a way to sort the purchases.
 *
 * There are three of them:
 * Sort All – sort the entire shopping list and display it so that the most expensive purchases are at the top of the list.
 * Sort By Type – show which category eats the most money.
 * Sort Certain Type – same as Sort All, but for a specific category.
 *
 * Example :::
 * Choose your action:
 * 1) Add income
 * 2) Add purchase
 * 3) Show list of purchases
 * 4) Balance
 * 5) Save
 * 6) Load
 * 7) Analyze (Sort)
 * 0) Exit
 * >7
 *
 * How do you want to sort?
 * 1) Sort all purchases
 * 2) Sort by type
 * 3) Sort certain type
 * 4) Back
 * >1
 *
 * Purchase list is empty!
 *
 * How do you want to sort?
 * 1) Sort all purchases
 * 2) Sort by type
 * 3) Sort certain type
 * 4) Back
 * >4
 *
 * Choose your action:
 * 1) Add income
 * 2) Add purchase
 * 3) Show list of purchases
 * 4) Balance
 * 5) Save
 * 6) Load
 * 7) Analyze (Sort)
 * 0) Exit
 * >6
 *
 * Purchases were loaded!
 *
 * Choose your action:
 * 1) Add income
 * 2) Add purchase
 * 3) Show list of purchases
 * 4) Balance
 * 5) Save
 * 6) Load
 * 7) Analyze (Sort)
 * 0) Exit
 * >7
 *
 * How do you want to sort?
 * 1) Sort all purchases
 * 2) Sort by type
 * 3) Sort certain type
 * 4) Back
 * >1
 *
 * All:
 * Almond 250g $35.43
 * Skate rental $30.00
 * FIJI Natural Artesian Water $25.98
 * Wrangler Men's Stretch Cargo Pant $19.97
 * Sensodyne Pronamel Toothpaste $19.74
 * Men's Dual Defense Crew Socks 12 Pairs $13.00
 * LEGO DUPLO Town Farm Animals $10.10
 * Chick-fil-A $10 Gift Card $10.00
 * Cinema $8.73
 * Gildan LT $8.61
 * Hershey's milk chocolate bars $8.54
 * Keystone Ground Beef $6.28
 * Red Fuji Apple $5.99
 * Eggs $3.99
 * Milk $3.50
 * Debt $3.50
 * Great Value Broccoli Florets $1.00
 * Total: $214.36
 *
 * How do you want to sort?
 * 1) Sort all purchases
 * 2) Sort by type
 * 3) Sort certain type
 * 4) Back
 * >2
 *
 * Types:
 * Food - $90.71
 * Entertainment - $48.83
 * Clothes - $41.58
 * Other - $33.24
 * Total sum: $214.36
 *
 * How do you want to sort?
 * 1) Sort all purchases
 * 2) Sort by type
 * 3) Sort certain type
 * 4) Back
 * >3
 *
 * Choose the type of purchase
 * 1) Food
 * 2) Clothes
 * 3) Entertainment
 * 4) Other
 * >1
 *
 * Food:
 * Almond 250g $35.43
 * FIJI Natural Artesian Water $25.98
 * Hershey's milk chocolate bars $8.54
 * Keystone Ground Bee $6.28
 * Red Fuji Apple $5.99
 * Eggs $3.99
 * Milk $3.50
 * Great Value Broccoli Florets $1.00
 * Total sum: $90.71
 *
 * How do you want to sort?
 * 1) Sort all purchases
 * 2) Sort by type
 * 3) Sort certain type
 * 4) Back
 * >4
 *
 * Choose your action:
 * 1) Add income
 * 2) Add purchase
 * 3) Show list of purchases
 * 4) Balance
 * 5) Save
 * 6) Load
 * 7) Analyze (Sort)
 * 0) Exit
 * >0
 *
 * Bye!
 */

public interface BudgetManager {
    void computeSelection();
}

class BudgetManagerContext {
    private BudgetManager budgetManager;

    void setBudgetManager (BudgetManager budgetManager){
        this.budgetManager = budgetManager;
    }

    void computeSelection(){
        this.budgetManager.computeSelection();
    }
}

class Main {
    public static void main(String[] args) {
        BudgetManagerContext myBudgetManager = new BudgetManagerContext();
        // set the method that will be used for the budget management (This step is mandatory)...
        myBudgetManager.setBudgetManager(new ComputeUserAccount());
        myBudgetManager.computeSelection();
    }
}