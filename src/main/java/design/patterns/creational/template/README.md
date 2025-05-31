### Scenario: CRUD Operations that has Cache.
### Why need to use template pattern? 
There can be a lot of models that is cacheable. Let's assume that we're using
lazy loading and each of the models have same working flow, i.e. for a read operation:
- Attempt reading from cache
- If found return
- If not found
  - Fetch from source
  - Save to cache
  - Return result

These will be always same! The only thing that will differ is the implementation 
of `Fetch from source`. So what if we make a class that do all other works and 
keep `featchFromSource(Entity entity)` as abstract, anybody who extends and implements
the class will not have to think about caching. Repetitive works are gone!
And that's what we call a template class and it is template pattern!

Implementation
https://github.com/ShartazFeeham/Open_forum/blob/main/review/src/main/java/com/open/forum/review/infrastructure/cache/core/CacheableCrud.java
https://github.com/ShartazFeeham/Open_forum/blob/main/review/src/main/java/com/open/forum/review/infrastructure/cache/core/CrudCacheTemplate.java
