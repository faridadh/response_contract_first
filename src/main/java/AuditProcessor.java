import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.spp.api.schema.integration.etlprocessexecutionresults.v2.PostExecutionResults;
import org.spp.api.schema.market.common.v1.MessageConfirmation;
import org.spp.api.schema.market.common.v1.MessageConfirmationEnum;


public class AuditProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println(exchange.getIn().getBody(PostExecutionResults.class).getStatus());
	}

}
