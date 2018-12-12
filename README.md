# Spring Data MongoDB 2.1.3 - Auditing

The purpose of this repository is to demonstrate an inconsistency
between the `CRUDRepository`'s `save` and `saveAll` methods date
auditing.

When a model is stored using the `save` method, the returned instance
and the collection's document have the field annotated with
`@LastModifiedDate` updated. However, if the model is stored using the
`saveAll` method, the returned instance has the field annotated with
`@LastModifiedDate` updated, while the document maintains the field's
default value.
