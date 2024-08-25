# Defining Relation between WhatsappGroup, Message and Member

## Requirement

You are given 3 class in `models` package - `WhatsappGroup`, `Message` and `Member`

Your task is to `define relations` between all these classes  and make sure `tables are created` for these models and `mapping tables` wherever applicable.

Fields have been already added in each class. `You need not to add any new field` . You just need to anotate those fields with relevant Cardinalities like @ManyToOne, @OneToOne etc...

In case, mapping table is needed between any 2 classes, Then Naming Convention for that mapping table and foreign keys should be like this as explained in below example -

Let's say we have 2 classes `user` and `role` and mapping table need to be created for their relation, so name of mapping table will be like `users_roles` and name of foreign keys be `user_id` , `role_id`. 

`Connect 2 or more words with _ and only mapping table name has words in plural, not other tables`

`** Above given is just example for your reference, please don't create classes with name user, role **`

We have testcases defined which will check for which all tables are created with what names and what columns, so please follow naming convention rules seriously.

## Hints

 - Nothing is needed from your side in pom.xml or application.properties
 - No new file need to be created. 
 - No new field need to be added, No field need to be removed or modified.
 - If you will try to run testcases without defining relations, all Testcases will fail.