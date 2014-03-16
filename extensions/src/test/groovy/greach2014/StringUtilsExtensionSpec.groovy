package greach2014

import spock.lang.Specification

class StringUtilsExtensionSpec extends Specification {
    void 'test trucate'() {
        expect:
            "Lorem" == "Lorem ipsum".truncate(5)

        and:
            "Lorem..." == "Lorem ipsum".truncate(5, true)
    }
}