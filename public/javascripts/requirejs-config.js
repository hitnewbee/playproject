
require.config({
    waitSeconds:0,
    paths:{
        "vue":"lib/vue",
        "jquery":"lib/jquery-2.2.0.min",
        "bootstrap":"lib/bootstrap.min",
        "vue-resource":"lib/vue-resource",
        "pjax":"lib/jquery.pjax"
    },

    shim:{
        "bootstrap":{
            deps:['jquery']
        },
        "vue-resource":{
            deps:["vue"]
        },
        "pjax":{
            deps:["jquery"]
        },
    }
});

require([
    'vue',
    'jquery',
    'bootstrap',
    'vue-resource',
    'pjax'
])
