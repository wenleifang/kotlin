// TODO: muted automatically, investigate should it be ran for JS_IR or not
// IGNORE_BACKEND: JS_IR

// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
// WITH_RUNTIME



fun box(): String {
    val list1 = ArrayList<Int>()
    val range1 = (1 + 2)..(10 - 1)
    for (i in range1) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<Int>(3, 4, 5, 6, 7, 8, 9)) {
        return "Wrong elements for (1 + 2)..(10 - 1): $list1"
    }

    val list2 = ArrayList<Int>()
    val range2 = (1.toByte() + 2.toByte()).toByte()..(10.toByte() - 1.toByte()).toByte()
    for (i in range2) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<Int>(3, 4, 5, 6, 7, 8, 9)) {
        return "Wrong elements for (1.toByte() + 2.toByte()).toByte()..(10.toByte() - 1.toByte()).toByte(): $list2"
    }

    val list3 = ArrayList<Int>()
    val range3 = (1.toShort() + 2.toShort()).toShort()..(10.toShort() - 1.toShort()).toShort()
    for (i in range3) {
        list3.add(i)
        if (list3.size > 23) break
    }
    if (list3 != listOf<Int>(3, 4, 5, 6, 7, 8, 9)) {
        return "Wrong elements for (1.toShort() + 2.toShort()).toShort()..(10.toShort() - 1.toShort()).toShort(): $list3"
    }

    val list4 = ArrayList<Long>()
    val range4 = (1L + 2L)..(10L - 1L)
    for (i in range4) {
        list4.add(i)
        if (list4.size > 23) break
    }
    if (list4 != listOf<Long>(3, 4, 5, 6, 7, 8, 9)) {
        return "Wrong elements for (1L + 2L)..(10L - 1L): $list4"
    }

    val list5 = ArrayList<Char>()
    val range5 = ("ace"[1])..("age"[1])
    for (i in range5) {
        list5.add(i)
        if (list5.size > 23) break
    }
    if (list5 != listOf<Char>('c', 'd', 'e', 'f', 'g')) {
        return "Wrong elements for (\"ace\"[1])..(\"age\"[1]): $list5"
    }

    val list6 = ArrayList<UInt>()
    val range6 = (1u + 2u)..(6u - 1u)
    for (i in range6) {
        list6.add(i)
        if (list6.size > 23) break
    }
    if (list6 != listOf<UInt>(3u, 4u, 5u)) {
        return "Wrong elements for (1u + 2u)..(6u - 1u): $list6"
    }

    val list7 = ArrayList<UInt>()
    val range7 = (1u.toUByte() + 2u.toUByte()).toUByte()..(6u.toUByte() - 1u.toUByte()).toUByte()
    for (i in range7) {
        list7.add(i)
        if (list7.size > 23) break
    }
    if (list7 != listOf<UInt>(3u, 4u, 5u)) {
        return "Wrong elements for (1u.toUByte() + 2u.toUByte()).toUByte()..(6u.toUByte() - 1u.toUByte()).toUByte(): $list7"
    }

    val list8 = ArrayList<UInt>()
    val range8 = (1u.toUShort() + 2u.toUShort()).toUShort()..(6u.toUShort() - 1u.toUShort()).toUShort()
    for (i in range8) {
        list8.add(i)
        if (list8.size > 23) break
    }
    if (list8 != listOf<UInt>(3u, 4u, 5u)) {
        return "Wrong elements for (1u.toUShort() + 2u.toUShort()).toUShort()..(6u.toUShort() - 1u.toUShort()).toUShort(): $list8"
    }

    val list9 = ArrayList<ULong>()
    val range9 = (1uL + 2uL)..(6uL - 1uL)
    for (i in range9) {
        list9.add(i)
        if (list9.size > 23) break
    }
    if (list9 != listOf<ULong>(3u, 4u, 5u)) {
        return "Wrong elements for (1uL + 2uL)..(6uL - 1uL): $list9"
    }

    return "OK"
}
