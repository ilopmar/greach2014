package greach2014

class StringUtilsExtension {
    static String truncate(String self, Integer length, Boolean overflow = false) {
        self.take(length) + (overflow ? '...' : '')
    }
}
