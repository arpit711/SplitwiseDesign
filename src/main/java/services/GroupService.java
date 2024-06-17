import javax.swing.*;
import java.util.List;

public class GroupService {

    private final ExpenseService expenseService;

    public GroupService(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    public PaymentGraph getGroupPaymentGraph(final String groupId, final String userId) throws IllegalAccessException {
        if (!group.getUsers().contains(userId)) {
            throw new IllegalAccessException();
        }
        List<Expense> groupExpenses = expenseService.getGroupExpenses();
        Expense resultExpense = sumExpenses(groupExpenses);
        return expenseService.getPaymentGraph(resultExpense);
    }

    public Expense getBalances(final String groupId) {

    }



}
