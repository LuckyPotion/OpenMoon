package com.moon.events.priority;

import java.util.*;
public class PrioritySet<T> implements java.util.Set<T> {

private final java.util.Map<com.moon.events.priority.Priority, java.util.Set<T>> prioritizedSets;

public PrioritySet() {
super();
    this.prioritizedSets = new java.util.EnumMap(com.moon.events.priority.Priority.class);
}


public boolean add(T p0) {
return ((java.util.Set)(((java.util.Set)(((java.util.Map)(this.prioritizedSets)).computeIfAbsent(((java.lang.Object)(com.moon.events.priority.Priority.NORMAL)), ((java.util.function.Function)(__sourceIntrinsic_902450852d0d_originalDynamicSite366_2()))))))).add(((java.lang.Object)(p0)));
}


public boolean remove(java.lang.Object p0) {
int life2_1;
    java.util.Iterator life3_6;
    java.util.Set life4_13;
    lexical_join_21: {
    life2_1 = 0;
    life3_6 = ((java.util.Collection)(((java.util.Map)(this.prioritizedSets)).values())).iterator();
    lexical_cycle_7: while (true) {
    if (!(((java.util.Iterator)(life3_6)).hasNext())) {
        break lexical_join_21;
    }
    life4_13 = ((java.util.Set)(((java.util.Iterator)(life3_6)).next()));
    life2_1 = (life2_1 | ((((java.util.Set)(life4_13)).remove(((java.lang.Object)(p0)))) ? 1 : 0));
    continue lexical_cycle_7;
    }
    }
    return ((life2_1) != 0);
}


public void clear() {
((java.util.Map)(this.prioritizedSets)).clear();
    return;
}


public boolean isEmpty() {
return ((((((com.moon.events.priority.PrioritySet)(this)).size() == 0) ? 1 : 0)) != 0);
}


public int size() {
return ((java.util.stream.IntStream)(((java.util.stream.Stream)(((java.util.Collection)(((java.util.Map)(this.prioritizedSets)).values())).stream())).mapToInt(((java.util.function.ToIntFunction)(__sourceIntrinsic_26195f39075f_originalDynamicSite367_3()))))).sum();
}


public <U> U[] toArray(U[] p0) {
java.lang.Object[] life2_7;
    int life3_9;
    java.util.Iterator life4_12;
    java.lang.Object life5_18;
    life2_7 = ((java.lang.Object[])(java.lang.reflect.Array.newInstance(((java.lang.Class)(((java.lang.Class)(((java.lang.Object)(p0)).getClass())).getComponentType())), ((int)(((com.moon.events.priority.PrioritySet)(this)).size())))));
    life3_9 = 0;
    life4_12 = ((com.moon.events.priority.PrioritySet)(this)).iterator();
    loop_region_13: while (((java.util.Iterator)(life4_12)).hasNext()) {
        life5_18 = ((java.util.Iterator)(life4_12)).next();
        (life2_7)[(life3_9++)] = life5_18;
    }
    return ((U[])(life2_7));
}


public java.lang.Object[] toArray() {
return ((java.util.stream.Stream)(((java.util.stream.Stream)(((java.util.Set)(((java.util.Map)(this.prioritizedSets)).entrySet())).stream())).flatMap(((java.util.function.Function)(__sourceIntrinsic_8e8c4ce19ec8_originalDynamicSite368_3()))))).toArray();
}


public java.util.Iterator<T> iterator() {
return ((java.util.stream.Stream)(((java.util.stream.Stream)(((java.util.Set)(((java.util.Map)(this.prioritizedSets)).entrySet())).stream())).flatMap(((java.util.function.Function)(__sourceIntrinsic_c05f04ef118d_originalDynamicSite369_3()))))).iterator();
}


public boolean contains(java.lang.Object p0) {
for (Set<T> set : this.prioritizedSets.values()) {

        if (set.contains(p0)) {

            return true;

        }

    }

    return false;
}


public boolean addAll(java.util.Collection<? extends T> p0) {
int life2_1;
    java.util.Iterator life3_4;
    java.lang.Object life4_10;
    lexical_join_18: {
    life2_1 = 0;
    life3_4 = ((java.util.Collection)(p0)).iterator();
    lexical_cycle_5: while (true) {
    if (!(((java.util.Iterator)(life3_4)).hasNext())) {
        break lexical_join_18;
    }
    life4_10 = ((java.util.Iterator)(life3_4)).next();
    life2_1 = (life2_1 | ((((com.moon.events.priority.PrioritySet)(this)).add(((java.lang.Object)(life4_10)))) ? 1 : 0));
    continue lexical_cycle_5;
    }
    }
    return ((life2_1) != 0);
}


public boolean removeAll(java.util.Collection<?> p0) {
int life2_1;
    java.util.Iterator life3_4;
    java.lang.Object life4_10;
    lexical_join_18: {
    life2_1 = 0;
    life3_4 = ((java.util.Collection)(p0)).iterator();
    lexical_cycle_5: while (true) {
    if (!(((java.util.Iterator)(life3_4)).hasNext())) {
        break lexical_join_18;
    }
    life4_10 = ((java.util.Iterator)(life3_4)).next();
    life2_1 = (life2_1 | ((((com.moon.events.priority.PrioritySet)(this)).remove(((java.lang.Object)(life4_10)))) ? 1 : 0));
    continue lexical_cycle_5;
    }
    }
    return ((life2_1) != 0);
}


public boolean retainAll(java.util.Collection<?> p0) {
int life2_1;
    java.util.Iterator life3_6;
    java.util.Set life4_13;
    lexical_join_21: {
    life2_1 = 0;
    life3_6 = ((java.util.Collection)(((java.util.Map)(this.prioritizedSets)).values())).iterator();
    lexical_cycle_7: while (true) {
    if (!(((java.util.Iterator)(life3_6)).hasNext())) {
        break lexical_join_21;
    }
    life4_13 = ((java.util.Set)(((java.util.Iterator)(life3_6)).next()));
    life2_1 = (life2_1 | ((((java.util.Set)(life4_13)).retainAll(((java.util.Collection)(p0)))) ? 1 : 0));
    continue lexical_cycle_7;
    }
    }
    return ((life2_1) != 0);
}


public boolean containsAll(java.util.Collection<?> p0) {
for (Object item : p0) {

        if (!this.contains(item)) {

            return false;

        }

    }

    return true;
}


public boolean containsAllPrioritized(java.util.Collection<?> p0) {
for (Object item : p0) {

        if (!this.containsPrioritized(item)) {

            return false;

        }

    }

    return true;
}


public boolean containsPrioritized(java.lang.Object p0) {
com.moon.events.priority.Prioritization life2_5;
    com.moon.events.priority.Priority life3_8;
    if ((((p0 instanceof com.moon.events.priority.Prioritization) ? 1 : 0) != 0)) {
        life2_5 = ((com.moon.events.priority.Prioritization)(p0));
        life3_8 = ((com.moon.events.priority.Prioritization)(life2_5)).priority();
        if (((java.util.Map)(this.prioritizedSets)).containsKey(((java.lang.Object)(life3_8)))) {
        return ((java.util.Set)(((java.util.Set)(((java.util.Map)(this.prioritizedSets)).get(((java.lang.Object)(life3_8))))))).contains(((java.lang.Object)(((com.moon.events.priority.Prioritization)(life2_5)).item())));
    }
    }
    return false;
}


public boolean removeAllPrioritized(java.util.Collection<? extends com.moon.events.priority.Prioritization<T>> p0) {
int life2_1;
    java.util.Iterator life3_4;
    com.moon.events.priority.Prioritization life4_11;
    lexical_join_19: {
    life2_1 = 0;
    life3_4 = ((java.util.Collection)(p0)).iterator();
    lexical_cycle_5: while (true) {
    if (!(((java.util.Iterator)(life3_4)).hasNext())) {
        break lexical_join_19;
    }
    life4_11 = ((com.moon.events.priority.Prioritization)(((java.util.Iterator)(life3_4)).next()));
    life2_1 = (life2_1 | ((((com.moon.events.priority.PrioritySet)(this)).removePrioritized(((java.lang.Object)(life4_11)))) ? 1 : 0));
    continue lexical_cycle_5;
    }
    }
    return ((life2_1) != 0);
}


private static java.util.Set lambda$addPrioritized$3(com.moon.events.priority.Priority p0) {
return new java.util.HashSet();
}


public boolean addPrioritized(com.moon.events.priority.Prioritization<T> p0) {
return ((java.util.Set)(((java.util.Set)(((java.util.Map)(this.prioritizedSets)).computeIfAbsent(((java.lang.Object)(((com.moon.events.priority.Prioritization)(p0)).priority())), ((java.util.function.Function)(__sourceIntrinsic_6e43792154dd_originalDynamicSite370_2()))))))).add(((java.lang.Object)(((com.moon.events.priority.Prioritization)(p0)).item())));
}


private static java.util.stream.Stream lambda$toArray$1(java.util.Map.Entry p0) {
return ((java.util.Set)(((java.util.Set)(((java.util.Map.Entry)(p0)).getValue())))).stream();
}


private static java.util.Set lambda$add$2(com.moon.events.priority.Priority p0) {
return new java.util.HashSet();
}


private static java.util.stream.Stream lambda$iterator$0(java.util.Map.Entry p0) {
return ((java.util.Set)(((java.util.Set)(((java.util.Map.Entry)(p0)).getValue())))).stream();
}


public boolean removePrioritized(java.lang.Object p0) {
com.moon.events.priority.Prioritization life2_5;
    com.moon.events.priority.Priority life3_8;
    if ((((p0 instanceof com.moon.events.priority.Prioritization) ? 1 : 0) != 0)) {
        life2_5 = ((com.moon.events.priority.Prioritization)(p0));
        life3_8 = ((com.moon.events.priority.Prioritization)(life2_5)).priority();
        if (((java.util.Map)(this.prioritizedSets)).containsKey(((java.lang.Object)(life3_8)))) {
        return ((java.util.Set)(((java.util.Set)(((java.util.Map)(this.prioritizedSets)).get(((java.lang.Object)(life3_8))))))).remove(((java.lang.Object)(((com.moon.events.priority.Prioritization)(life2_5)).item())));
    }
    }
    return false;
}


public boolean addAllPrioritized(java.util.Collection<? extends com.moon.events.priority.Prioritization<T>> p0) {
int life2_1;
    java.util.Iterator life3_4;
    com.moon.events.priority.Prioritization life4_11;
    lexical_join_19: {
    life2_1 = 0;
    life3_4 = ((java.util.Collection)(p0)).iterator();
    lexical_cycle_5: while (true) {
    if (!(((java.util.Iterator)(life3_4)).hasNext())) {
        break lexical_join_19;
    }
    life4_11 = ((com.moon.events.priority.Prioritization)(((java.util.Iterator)(life3_4)).next()));
    life2_1 = (life2_1 | ((((com.moon.events.priority.PrioritySet)(this)).addPrioritized(((com.moon.events.priority.Prioritization)(life4_11)))) ? 1 : 0));
    continue lexical_cycle_5;
    }
    }
    return ((life2_1) != 0);
}


private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_902450852d0d_originalDynamicSite366_2() throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_6e43792154dd_originalDynamicSite370_2() throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_c05f04ef118d_originalDynamicSite369_3() throws E;

private static native <E extends Throwable> java.util.function.ToIntFunction __sourceIntrinsic_26195f39075f_originalDynamicSite367_3() throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_8e8c4ce19ec8_originalDynamicSite368_3() throws E;
}
