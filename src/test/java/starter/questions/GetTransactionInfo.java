package starter.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import starter.ui.addtransaction.AddTransactionPage;

public class GetTransactionInfo {

    public static Question<String> getDescription(){
        return Question.about("transaction description").answeredBy(
                actor -> BrowseTheWeb.as(actor).textOf(AddTransactionPage.TRANSACTIONS_TABLE_XPATH)
        );
    }
}
