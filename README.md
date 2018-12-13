# Spring Data MongoDB 2.1.3 - Auditing and @Id field behavior

The purpose of this repository is to demonstrate an inconsistency
between the `CRUDRepository`'s `save` and `saveAll` methods date
auditing and to show a strange behavior related to the `@Id` field
population.

### Auditing
When a model is stored using the `save` method, the returned instance
and the collection's document have the field annotated with
`@LastModifiedDate` updated. However, if the model is stored using the
`saveAll` method, the returned instance has the field annotated with
`@LastModifiedDate` updated, while the document maintains the field's
default value.

### @Id field behavior
Whenever the `@Id` field is a val, and the model has more than fifteen
attributes (not counting the `@Id` field), the `CRUDRepository` `save`
and `saveAll` methods' returned instance doesn't have the `@Id` field
populated. Despite the collection's document having that field populated,
there is an inconsistency between the returned instance and the database
entry.
