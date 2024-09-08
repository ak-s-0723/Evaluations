# Create a Subscription Link using Razorpay

## Requirements

You need to integrate Razorpay `Create a Subscription Link` API

You need to add an API with path `/subscription` in SubscriptionController which will take request in form of CreateSubscriptionRequest and return Subscription.

You need to add Implementation in SubscriptionService method `Subscription createSubscription(CreateSubscriptionRequest subscriptionRequest)`.

You also need to implement `Subscription createSubscriptionLink(RazorpaySubscriptionRequest subscriptionInput)` method in RazorpayPaymentGatewayClient taking help from Razorpay Official Documentation and RazorpayClient bean present in RazorpayConfig.

You need not to do any changes in `dtos` and `config`. Just refer them for better understanding.

## Hints

 - Nothing is needed from your side in pom.xml or application.properties. Dependency is already added and razorpayId and razorpaySecret are already set in application.properties.
 - No new file need to be created.
 - If you will try to run testcases without providing solution, all Testcases will fail.
 - You can refer to [link](https://razorpay.com/docs/api/payments/subscriptions/create-subscription-link/) for help.
 - You might need to write object mappers in SubscriptionService for which read documentation thoroughly.