# Create, List and Cancel PaymentIntent on Stripe

## Requirements

In PaymentController, you need to implement 3 APIs

- An API with path `/paymentIntent` to create Payment Intent accepting body in form of PaymentIntentRequestDto and returning Id of created PaymentIntent.
- An API with path `/paymentIntent` to list all Payment Intents, which will return response in form of `List<PaymentIntent>` , please check `PaymentIntent` already present in dtos.
- An API with path `/paymentIntent/{id}` to cancel Payment Intent with given id and returning `true` Boolean result if PaymentIntent has been cancelled successfully. Note - It's cancellation and not deletion.

In PaymentService, you need to  complete all 3 methods.

In StripePaymentGateway, please implement all 3 Method. You can take help from [Link](https://docs.stripe.com/api/payment_intents)

You don't need to do changes in `dtos`. Just refer it for your understanding. Fields are already present in each class.

## Hints
- Nothing is needed from your side in pom.xml or application.properties. Dependency is already added and properties are already set.
- No new file need to be created.
- If you will try to run testcases without providing solution, all Testcases will fail.