package test

import io.micronaut.http.annotation.Get

open class TestBaseService<T: TestBaseObject>
constructor() {
    lateinit var obj: T

    @Get(uri = "testMethodOnlyInBase")
    fun testMethodOnlyInBase(): T {
        return obj
    }

    @Get(uri = "testMethodToBeOverridden")
    open fun testMethodToBeOverridden(): T {
        return obj
    }
    /*override fun listOwnAt(auth: Authentication,
                           @PathVariable("timestamp") timestamp: Long?,
                           @PathVariable("filter") filter: String?,
                           @QueryValue("fieldFilter") fieldFilter: Array<String>?,
                           @QueryValue("includeRevision") includeRevision: Boolean?) : Single<List<UserEntity>> = super.listOwnAt(auth, timestamp, filter, fieldFilter, includeRevision)*/
}
