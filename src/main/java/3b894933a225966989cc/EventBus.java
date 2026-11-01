package com.moon.events;
import com.moon.events.subscription.Subscribe;
import com.moon.events.priority.Priority;
import com.moon.events.subscription.Subscription;


import java.lang.reflect.*;
public class EventBus<T> {

protected final java.util.Map<java.lang.reflect.Type, com.moon.events.priority.PrioritySet<com.moon.events.subscription.Subscription<T>>> subscriptions;

protected final java.util.Map<java.lang.Object, java.util.Map<java.lang.reflect.Type, java.util.Set<com.moon.events.subscription.Subscription<T>>>> instanceSubscriptionsMap;

public EventBus() {
super();
    this.instanceSubscriptionsMap = new java.util.HashMap();
    this.subscriptions = new java.util.HashMap();
}


public void publish(T p0) {
java.lang.Class life2_2;
    java.util.Iterator life3_14;
    com.moon.events.subscription.Subscription life4_21;
    life2_2 = ((java.lang.Object)(p0)).getClass();
    if (((java.util.Map)(this.subscriptions)).containsKey(((java.lang.Object)(life2_2)))) {
        life3_14 = ((com.moon.events.priority.PrioritySet)(((com.moon.events.priority.PrioritySet)(((java.util.Map)(this.subscriptions)).get(((java.lang.Object)(life2_2))))))).iterator();
        loop_region_15: while (((java.util.Iterator)(life3_14)).hasNext()) {
        life4_21 = ((com.moon.events.subscription.Subscription)(((java.util.Iterator)(life3_14)).next()));
        ((com.moon.events.subscription.Subscription)(life4_21)).receive(((java.lang.Object)(p0)));
    }
    }
    return;
}


public void subscribe(java.lang.Object p0) {
((com.moon.events.EventBus)(this)).changeSubscriptionState(((java.lang.Object)(p0)), ((com.moon.commons.consumer.TriConsumer)(__sourceIntrinsic_ec0baeb9694f_originalDynamicSite364_0(this, p0))));
    return;
}


private void lambda$unsubscribe$4(java.lang.reflect.Type p0, java.util.Set p1) {
((com.moon.events.priority.PrioritySet)(((com.moon.events.priority.PrioritySet)(((java.util.Map)(this.subscriptions)).get(((java.lang.Object)(p0))))))).removeAll(((java.util.Collection)(p1)));
    return;
}


protected void changeSubscriptionState(java.lang.Object p0, com.moon.commons.consumer.TriConsumer<java.lang.reflect.Type, com.moon.events.subscription.Subscription<T>, com.moon.events.priority.Priority> p1) {
Class<?> type = p0.getClass();
for (Method method : type.getDeclaredMethods()) {
if (method.isAnnotationPresent(Subscribe.class)) {
Class<?>[] params = method.getParameterTypes();

if (params.length != 1) {
continue;
}
Priority priority = method.getDeclaredAnnotation(Subscribe.class).priority();
Subscription<T> subscription = this.createSubscriptionFrom(method, p0);

if (subscription != null) {
p1.accept(params[0], subscription, priority);
}
}
}
}


private com.moon.events.subscription.Subscription<T> createSubscriptionFrom(java.lang.reflect.Method p0, java.lang.Object p1) {
int local3 = ((java.lang.reflect.Method)(p0)).getModifiers();
    if ((!java.lang.reflect.Modifier.isPublic(((int)(local3))))) {
        ((java.io.PrintStream)(java.lang.System.err)).println(((java.lang.String)(__sourceIntrinsic_185684f0451a_invokedynamic1000_4(((java.lang.reflect.Method)(p0)).getName()))));
        return null;
    }
    java.lang.Class local4 = (((java.lang.reflect.Method)(p0)).getParameterTypes())[0];
    try {
        java.lang.invoke.MethodHandle local5 = ((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).unreflect(((java.lang.reflect.Method)(p0)));
        java.lang.invoke.CallSite local6 = java.lang.invoke.LambdaMetafactory.metafactory(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())), ((java.lang.String)("receive")), ((java.lang.invoke.MethodType)(java.lang.invoke.MethodType.methodType(((java.lang.Class)(com.moon.events.subscription.Subscription.class)), ((java.lang.Class)(((java.lang.Object)(p1)).getClass()))))), ((java.lang.invoke.MethodType)(java.lang.invoke.MethodType.methodType(((java.lang.Class)(java.lang.Void.TYPE)), ((java.lang.Class)(java.lang.Object.class))))), ((java.lang.invoke.MethodHandle)(local5)), ((java.lang.invoke.MethodType)(java.lang.invoke.MethodType.methodType(((java.lang.Class)(java.lang.Void.TYPE)), ((java.lang.Class)(local4))))));
        return ((com.moon.events.subscription.Subscription<T>)(((java.lang.invoke.MethodHandle)(((java.lang.invoke.CallSite)(local6)).getTarget())).invoke(((java.lang.Object)(p1)))));
    } catch (java.lang.Throwable caught5) {
        ((java.io.PrintStream)(java.lang.System.err)).println(((java.lang.String)("FATAL: Could not construct subscription from method")));
        ((java.lang.Throwable)(caught5)).printStackTrace();
        return null;
    }
}


public void unsubscribe(java.lang.Object p0) {
java.util.Map local2 = ((java.util.Map)(((java.util.Map)(this.instanceSubscriptionsMap)).get(((java.lang.Object)(p0)))));
    if ((local2 != null)) {
        ((java.util.Map)(local2)).forEach(((java.util.function.BiConsumer)(__sourceIntrinsic_8c422daec226_invokedynamic1001_3(this))));
    }
    return;
}


private void lambda$subscribe$3(java.lang.Object p0, java.lang.reflect.Type p1, com.moon.events.subscription.Subscription p2, com.moon.events.priority.Priority p3) {
((com.moon.events.priority.PrioritySet)(((com.moon.events.priority.PrioritySet)(((java.util.Map)(this.subscriptions)).computeIfAbsent(((java.lang.Object)(p1)), ((java.util.function.Function)(__sourceIntrinsic_5ef4b6b9da8f_originalDynamicSite365_1()))))))).addPrioritized(((com.moon.events.priority.Prioritization)(new com.moon.events.priority.Prioritization(p2, p3))));
    ((java.util.Set)(((java.util.Set)(((java.util.Map)(((java.util.Map)(((java.util.Map)(this.instanceSubscriptionsMap)).computeIfAbsent(((java.lang.Object)(p0)), ((java.util.function.Function)(__sourceIntrinsic_5ef4b6b9da8f_originalDynamicSite365_6()))))))).computeIfAbsent(((java.lang.Object)(p1)), ((java.util.function.Function)(__sourceIntrinsic_5ef4b6b9da8f_originalDynamicSite365_9()))))))).add(((java.lang.Object)(p2)));
    return;
}


private static java.util.Set lambda$subscribe$2(java.lang.reflect.Type p0) {
return new java.util.HashSet();
}


private static java.util.Map lambda$subscribe$1(java.lang.Object p0) {
return new java.util.HashMap();
}


private static com.moon.events.priority.PrioritySet lambda$subscribe$0(java.lang.reflect.Type p0) {
return new com.moon.events.priority.PrioritySet();
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_185684f0451a_invokedynamic1000_4(java.lang.String a0) throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_5ef4b6b9da8f_originalDynamicSite365_1() throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_5ef4b6b9da8f_originalDynamicSite365_6() throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_5ef4b6b9da8f_originalDynamicSite365_9() throws E;

private static native <E extends Throwable> com.moon.commons.consumer.TriConsumer __sourceIntrinsic_ec0baeb9694f_originalDynamicSite364_0(com.moon.events.EventBus a0, java.lang.Object a1) throws E;

private static native <E extends Throwable> java.util.function.BiConsumer __sourceIntrinsic_8c422daec226_invokedynamic1001_3(com.moon.events.EventBus a0) throws E;
}
