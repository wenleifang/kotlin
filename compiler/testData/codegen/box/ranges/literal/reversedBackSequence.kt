// TODO: muted automatically, investigate should it be ran for JS_IR or not
// IGNORE_BACKEND: JS_IR

// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
// WITH_RUNTIME



fun box(): String {
    val list1 = ArrayList<Int>()
    for (i in (5 downTo 3).reversed()) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<Int>(3, 4, 5)) {
        return "Wrong elements for (5 downTo 3).reversed(): $list1"
    }

    val list2 = ArrayList<Int>()
    for (i in (5.toByte() downTo 3.toByte()).reversed()) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<Int>(3, 4, 5)) {
        return "Wrong elements for (5.toByte() downTo 3.toByte()).reversed(): $list2"
    }

    val list3 = ArrayList<Int>()
    for (i in (5.toShort() downTo 3.toShort()).reversed()) {
        list3.add(i)
        if (list3.size > 23) break
    }
    if (list3 != listOf<Int>(3, 4, 5)) {
        return "Wrong elements for (5.toShort() downTo 3.toShort()).reversed(): $list3"
    }

    val list4 = ArrayList<Long>()
    for (i in (5L downTo 3L).reversed()) {
        list4.add(i)
        if (list4.size > 23) break
    }
    if (list4 != listOf<Long>(3, 4, 5)) {
        return "Wrong elements for (5L downTo 3L).reversed(): $list4"
    }

    val list5 = ArrayList<Char>()
    for (i in ('c' downTo 'a').reversed()) {
        list5.add(i)
        if (list5.size > 23) break
    }
    if (list5 != listOf<Char>('a', 'b', 'c')) {
        return "Wrong elements for ('c' downTo 'a').reversed(): $list5"
    }

    val list6 = ArrayList<UInt>()
    for (i in (5u downTo 3u).reversed()) {
        list6.add(i)
        if (list6.size > 23) break
    }
    if (list6 != listOf<UInt>(3u, 4u, 5u)) {
        return "Wrong elements for (5u downTo 3u).reversed(): $list6"
    }

    val list7 = ArrayList<UInt>()
    for (i in (5u.toUByte() downTo 3u.toUByte()).reversed()) {
        list7.add(i)
        if (list7.size > 23) break
    }
    if (list7 != listOf<UInt>(3u, 4u, 5u)) {
        return "Wrong elements for (5u.toUByte() downTo 3u.toUByte()).reversed(): $list7"
    }

    val list8 = ArrayList<UInt>()
    for (i in (5u.toUShort() downTo 3u.toUShort()).reversed()) {
        list8.add(i)
        if (list8.size > 23) break
    }
    if (list8 != listOf<UInt>(3u, 4u, 5u)) {
        return "Wrong elements for (5u.toUShort() downTo 3u.toUShort()).reversed(): $list8"
    }

    val list9 = ArrayList<ULong>()
    for (i in (5uL downTo 3uL).reversed()) {
        list9.add(i)
        if (list9.size > 23) break
    }
    if (list9 != listOf<ULong>(3u, 4u, 5u)) {
        return "Wrong elements for (5uL downTo 3uL).reversed(): $list9"
    }

    return "OK"
}
