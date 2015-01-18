import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.spp.api.schema.market.common.v1.MessageConfirmation;
import org.spp.api.schema.market.common.v1.MessageConfirmationEnum;


public class ResultProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		org.spp.api.schema.integration.etlprocessexecutionresults.v2.PostExecutionResultsResponse result = new org.spp.api.schema.integration.etlprocessexecutionresults.v2.PostExecutionResultsResponse();
		MessageConfirmation confirmation = new MessageConfirmation();
		confirmation.setStatus(MessageConfirmationEnum.SUCCESS);
		result.setMessageConfirmation(confirmation);
		exchange.getIn().setBody(
				result
				);
		
	}

}
