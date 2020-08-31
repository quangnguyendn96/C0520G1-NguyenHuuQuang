
// Copyright 2012 Google Inc. All rights reserved.
(function(w,g){w[g]=w[g]||{};w[g].e=function(s){return eval(s);};})(window,'google_tag_manager');(function(){

var data = {
"resource": {
  "version":"220",
  
  "macros":[{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.targetType"
    },{
      "function":"__e"
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"source"
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"environment"
    },{
      "function":"__u",
      "vtp_component":"HOST",
      "vtp_enableMultiQueryKeys":false,
      "vtp_enableIgnoreEmptyQueryParam":false
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.action"
    },{
      "function":"__u",
      "vtp_component":"PATH",
      "vtp_enableMultiQueryKeys":false,
      "vtp_enableIgnoreEmptyQueryParam":false
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.pageType"
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.data.userid"
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.data.userid"
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"userid"
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){var a;",["escape",["macro",8],8,16],"?a=",["escape",["macro",8],8,16],":",["escape",["macro",9],8,16],"?a=",["escape",["macro",9],8,16],":",["escape",["macro",10],8,16],"\u0026\u0026(a=",["escape",["macro",10],8,16],");if(a)return a=a.toString(),a=sha256(a)})();"]
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"originalLocation"
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){return ",["escape",["macro",12],8,16],"||window.location.protocol+\"\/\/\"+window.location.hostname+window.location.pathname+window.location.search})();"]
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){var e=[\"email\",\"loginKey\"],a=",["escape",["macro",13],8,16],",b=document.createElement(\"a\");b.href=a;if(b.search){a=b.search.replace(\"?\",\"\\x26\");var c;for(c=0;c\u003Ce.length;c++){var d=e[c];d=new RegExp(\"\\x26\"+d+\"\\x3d[^\\x26]*(\\x26|$)\",\"gi\");a=a.replace(d,\"\\x26\")}\"\\x26\"===a[0]?a=a.slice(1):\"\";b.search=a}return b.href})();"]
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){return document.location.pathname+document.location.search})();"]
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){var c=[\"email\",\"loginKey\"],a=",["escape",["macro",15],8,16],";if(a){a=a.replace(\"?\",\"\\x26\");var b;for(b=0;b\u003Cc.length;b++){var d=c[b];d=new RegExp(\"\\x26\"+d+\"\\x3d[^\\x26]*(\\x26|$)\",\"gi\");a=a.replace(d,\"\\x26\")}\"\\x26\"===a[0]?a=a.slice(1):\"\";a=a.replace(\"\\x26\",\"?\")}return c=a})();"]
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"userGroup"
    },{
      "function":"__u",
      "vtp_component":"QUERY",
      "vtp_queryKey":"gclid",
      "vtp_enableMultiQueryKeys":false,
      "vtp_enableIgnoreEmptyQueryParam":false
    },{
      "function":"__remm",
      "vtp_setDefaultValue":false,
      "vtp_input":["macro",4],
      "vtp_fullMatch":false,
      "vtp_replaceAfterMatch":false,
      "vtp_ignoreCase":true,
      "vtp_map":["list",["map","key","shopee.co.id","value","UA-61904553-8"],["map","key","shopee.sg","value","UA-61921742-7"],["map","key","shopee.com.my","value","UA-61915055-6"],["map","key","shopee.tw","value","UA-61915057-6"],["map","key","shopee.co.th","value","UA-61914165-6"],["map","key","shopee.vn","value","UA-61914164-6"],["map","key","shopee.ph","value","UA-61918643-6"],["map","key","shopee.com.br","value","UA-149843394-1"]]
    },{
      "function":"__gas",
      "vtp_useDebugVersion":false,
      "vtp_useHashAutoLink":false,
      "vtp_contentGroup":["list",["map","index","1","group",["macro",7]]],
      "vtp_decorateFormsAutoLink":false,
      "vtp_cookieDomain":"auto",
      "vtp_doubleClick":true,
      "vtp_setTrackerName":true,
      "vtp_fieldsToSet":["list",["map","fieldName","allowLinker","value","true"],["map","fieldName","useAmpClientId","value","true"],["map","fieldName","userId","value",["macro",11]],["map","fieldName","location","value",["macro",14]],["map","fieldName","page","value",["macro",16]]],
      "vtp_trackerName":"",
      "vtp_enableLinkId":true,
      "vtp_dimension":["list",["map","index","3","dimension",["macro",11]],["map","index","2","dimension",["macro",17]],["map","index","4","dimension",["macro",18]]],
      "vtp_enableEcommerce":false,
      "vtp_trackingId":["macro",19],
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":true,
      "vtp_defaultValue":"false",
      "vtp_name":"info.initial"
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"country"
    },{
      "function":"__remm",
      "vtp_setDefaultValue":false,
      "vtp_input":["macro",4],
      "vtp_fullMatch":false,
      "vtp_replaceAfterMatch":false,
      "vtp_ignoreCase":true,
      "vtp_map":["list",["map","key","shopee.tw","value","34651"],["map","key","shopee.vn","value","34657"],["map","key","shopee.co.id","value","34652"],["map","key","shopee.com.my","value","32773"],["map","key","shopee.ph","value","34655"],["map","key","shopee.co.th","value","34654"],["map","key","shopee.sg","value","32772"]]
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":true,
      "vtp_defaultValue":"",
      "vtp_name":"info.impressions.0.targetData.accountInfo.email"
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){return 767\u003E=window.innerWidth?\"m\":980\u003C=window.innerWidth?\"d\":\"t\"})();"]
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.impressions.0.targetData.cart.items"
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){var a=",["escape",["macro",26],8,16],"||[],c=[],b;for(b in a)c.push({id:a[b].itemid,price:parseFloat(a[b].price)\/1E5,quantity:a[b].quantity});return c})();"]
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.impressions"
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){var a=[];a=",["escape",["macro",28],8,16],"||[];return a=a.map(function(a){return a.targetData.item.itemid})})();"]
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.impressions.0.targetData.item.itemid"
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.data.response.checkoutid"
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.data.orders"
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){for(var b=",["escape",["macro",32],8,16],",d=[],a=0;a\u003Cb.length;a++)for(var c=0;c\u003Cb[a].items.length;c++)d.push({id:\"\"+b[a].items[c].itemid,item_price:b[a].items[c].price\/1E5,quantity:b[a].items[c].quantity});return d})();"]
    },{
      "function":"__remm",
      "vtp_setDefaultValue":false,
      "vtp_input":["macro",4],
      "vtp_fullMatch":false,
      "vtp_replaceAfterMatch":false,
      "vtp_ignoreCase":true,
      "vtp_map":["list",["map","key","shopee.sg","value","SGD"],["map","key","shopee.com.my","value","MYR"],["map","key","shopee.co.th","value","THB"],["map","key","shopee.tw","value","TWD"],["map","key","shopee.co.id","value","IDR"],["map","key","shopee.vn","value","VND"],["map","key","shopee.ph","value","PHP"],["map","key","shopee.com.br","value","BRL"]]
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.data.name"
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.data.itemId"
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.data.price"
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.data.quantity"
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){var a=",["escape",["macro",37],8,16],"*",["escape",["macro",38],8,16],"\/1E5;return a})();"]
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.data.catId"
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.data.modelId"
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){var a={ecommerce:{currencyCode:\"",["escape",["macro",34],7],"\",add:{products:[{name:\"",["escape",["macro",35],7],"\",id:\"",["escape",["macro",36],7],"\",price:\"",["escape",["macro",39],7],"\",category:\"",["escape",["macro",40],7],"\",variant:\"",["escape",["macro",41],7],"\",quantity:",["escape",["macro",38],8,16],"}]}}};return a})();"]
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.data.register_channel"
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){for(var b=",["escape",["macro",32],8,16],",c=0,a=0;a\u003Cb.length;a++)c+=b[a].total_without_shipping;return c\/1E5})();"]
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){for(var a=",["escape",["macro",32],8,16],",d=0,e=[],b=0;b\u003Ca.length;b++){for(var c=0;c\u003Ca[b].items.length;c++)e.push({id:a[b].items[c].itemid,price:a[b].items[c].price\/1E5,name:a[b].items[c].name,quantity:a[b].items[c].quantity,category:a[b].items[c].categories[0].catids.join(\".\")});d+=a[b].shipping_fee}a={ecommerce:{purchase:{actionField:{id:\"",["escape",["macro",31],7],"\",revenue:\"",["escape",["macro",44],7],"\",shipping:d\/1E5},products:e}}};str=JSON.stringify(a);return a})();"]
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.data.response.orderids"
    },{
      "function":"__j",
      "vtp_name":"document.title"
    },{
      "function":"__u",
      "vtp_component":"URL",
      "vtp_enableMultiQueryKeys":false,
      "vtp_enableIgnoreEmptyQueryParam":false
    },{
      "function":"__remm",
      "vtp_setDefaultValue":false,
      "vtp_input":["macro",48],
      "vtp_fullMatch":true,
      "vtp_replaceAfterMatch":true,
      "vtp_ignoreCase":true,
      "vtp_map":["list",["map","key","https:\/\/shopee.vn\/m\/99","value","1005975"],["map","key","https:\/\/shopee.co.id\/m\/super-shopping-day-129","value","1005969"],["map","key","https:\/\/shopee.co.th\/m\/99","value","1005972"],["map","key","https:\/\/shopee.com.my\/m\/99","value","1005973"],["map","key","https:\/\/shopee.ph\/m\/99","value","953969"],["map","key","https:\/\/shopee.sg\/m\/99","value","1005974"],["map","key","https:\/\/shopee.tw\/m\/99","value","1005971"]]
    },{
      "function":"__k",
      "vtp_decodeCookie":true,
      "vtp_name":"_med"
    },{
      "function":"__remm",
      "vtp_setDefaultValue":false,
      "vtp_input":["macro",4],
      "vtp_fullMatch":false,
      "vtp_replaceAfterMatch":false,
      "vtp_ignoreCase":true,
      "vtp_map":["list",["map","key","shopee.sg","value","1011l628"],["map","key","shopee.co.th","value","1100l551"],["map","key","shopee.vn","value","1100l682"],["map","key","shopee.ph","value","1100l720"],["map","key","shopee.com.my","value","1100l721"],["map","key","shopee.tw","value","1011l795"],["map","key","shopee.co.id","value","1101l712"],["map","key","shopee.com.br","value","1011l971"]]
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){var b=",["escape",["macro",51],8,16],",e=",["escape",["macro",31],8,16],",f=",["escape",["macro",46],8,16],",g=",["escape",["macro",32],8,16],",c=\"https:\/\/prf.hn\/conversion\/campaign:\"+b+\"\/conversionref:\"+e+\"\/country:\"+",["escape",["macro",22],8,16],"+\"\/currency:\"+",["escape",["macro",34],8,16],"+\"\/\";b=g.filter(function(d){return d.hasOwnProperty(\"items\")});console.log(\"check \"+b);b.forEach(function(d,h){d.items.forEach(function(a){var k=a.itemid,l=a.price\/1E5,m=a.quantity,n=a.shopid;a=a.categories[0].catids[0];c+=\"[category:\"+a+\"\/sku:\"+k+\"\/value:\"+l+\n\"\/quantity:\"+m+\"\/shop_id:\"+n+\"\/order_id:\"+f[h]+\"\/]\"})});console.log(\"::: \"+c);return c})();"]
    },{
      "function":"__gas",
      "vtp_useDebugVersion":false,
      "vtp_useHashAutoLink":false,
      "vtp_contentGroup":["list",["map","index","1","group",["macro",7]]],
      "vtp_decorateFormsAutoLink":false,
      "vtp_cookieDomain":"auto",
      "vtp_useEcommerceDataLayer":true,
      "vtp_doubleClick":true,
      "vtp_setTrackerName":true,
      "vtp_fieldsToSet":["list",["map","fieldName","allowLinker","value","true"],["map","fieldName","useAmpClientId","value","true"],["map","fieldName","userId","value",["macro",11]],["map","fieldName","location","value",["macro",14]],["map","fieldName","page","value",["macro",16]]],
      "vtp_trackerName":"",
      "vtp_enableLinkId":true,
      "vtp_dimension":["list",["map","index","1","dimension",["macro",10]],["map","index","3","dimension",["macro",11]],["map","index","2","dimension",["macro",17]],["map","index","4","dimension",["macro",18]]],
      "vtp_enableEcommerce":true,
      "vtp_trackingId":"UA-125099498-1",
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false,
      "vtp_ecommerceIsEnabled":true
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"pagePostAuthor"
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"pageCategory"
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"pagePostType2"
    },{
      "function":"__remm",
      "vtp_setDefaultValue":false,
      "vtp_input":["macro",4],
      "vtp_fullMatch":false,
      "vtp_replaceAfterMatch":false,
      "vtp_ignoreCase":true,
      "vtp_map":["list",["map","key","shopee.co.id","value","UA-61904553-8"],["map","key","shopee.sg","value","UA-61921742-7"],["map","key","shopee.com.my","value","UA-61915055-6"],["map","key","shopee.tw","value","UA-61915057-6"],["map","key","shopee.co.th","value","UA-61914165-6"],["map","key","shopee.vn","value","UA-61914164-6"],["map","key","shopee.ph","value","UA-61918643-6"],["map","key","shopee.com.br","value","UA-149843394-1"]]
    },{
      "function":"__gas",
      "vtp_useDebugVersion":false,
      "vtp_useHashAutoLink":false,
      "vtp_contentGroup":["list",["map","index","1","group",["macro",54]],["map","index","2","group",["macro",55]],["map","index","3","group",["macro",56]]],
      "vtp_decorateFormsAutoLink":false,
      "vtp_cookieDomain":"auto",
      "vtp_doubleClick":true,
      "vtp_setTrackerName":true,
      "vtp_fieldsToSet":["list",["map","fieldName","allowLinker","value","true"],["map","fieldName","useAmpClientId","value","true"],["map","fieldName","userId","value",["macro",11]],["map","fieldName","location","value",["macro",14]],["map","fieldName","page","value",["macro",16]]],
      "vtp_trackerName":"",
      "vtp_enableLinkId":true,
      "vtp_dimension":["list",["map","index","3","dimension",["macro",11]],["map","index","4","dimension",["macro",18]]],
      "vtp_enableEcommerce":false,
      "vtp_trackingId":["macro",57],
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false
    },{
      "function":"__v",
      "vtp_name":"gtm.triggers",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":true,
      "vtp_defaultValue":""
    },{
      "function":"__v",
      "vtp_name":"gtm.videoUrl",
      "vtp_dataLayerVersion":1
    },{
      "function":"__v",
      "vtp_name":"gtm.videoTitle",
      "vtp_dataLayerVersion":1
    },{
      "function":"__v",
      "vtp_name":"gtm.videoStatus",
      "vtp_dataLayerVersion":1
    },{
      "function":"__v",
      "vtp_name":"gtm.videoPercent",
      "vtp_dataLayerVersion":1
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){var a=",["escape",["macro",62],8,16],";switch(a){case \"start\":return\"Start playing\";case \"pause\":return\"Pause\";case \"buffering\":return\"Buffering\";case \"progress\":return\"Reached \"+",["escape",["macro",63],8,16],"+\"%\";case \"complete\":return\"Reached the end\"}})();"]
    },{
      "function":"__remm",
      "vtp_setDefaultValue":false,
      "vtp_input":["macro",4],
      "vtp_fullMatch":false,
      "vtp_replaceAfterMatch":false,
      "vtp_ignoreCase":true,
      "vtp_map":["list",["map","key","shopee.co.id","value","UA-61904553-8"],["map","key","shopee.sg","value","UA-61921742-7"],["map","key","shopee.com.my","value","UA-61915055-6"],["map","key","shopee.tw","value","UA-61915057-6"],["map","key","shopee.co.th","value","UA-61914165-6"],["map","key","shopee.vn","value","UA-61914164-6"],["map","key","shopee.ph","value","UA-61918643-6"],["map","key","shopee.com","value","UA-132684032-1"],["map","key","shopee.com.br","value","UA-149843394-1"]]
    },{
      "function":"__gas",
      "vtp_cookieDomain":"auto",
      "vtp_doubleClick":true,
      "vtp_setTrackerName":true,
      "vtp_useDebugVersion":false,
      "vtp_fieldsToSet":["list",["map","fieldName","allowLinker","value","true"],["map","fieldName","useAmpClientId","value","true"],["map","fieldName","userId","value",["macro",11]],["map","fieldName","location","value",["macro",14]],["map","fieldName","page","value",["macro",16]]],
      "vtp_trackerName":"",
      "vtp_useHashAutoLink":false,
      "vtp_decorateFormsAutoLink":false,
      "vtp_enableLinkId":true,
      "vtp_dimension":["list",["map","index","3","dimension",["macro",11]],["map","index","2","dimension",["macro",17]],["map","index","4","dimension",["macro",18]]],
      "vtp_enableEcommerce":false,
      "vtp_trackingId":["macro",65],
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false
    },{
      "function":"__v",
      "vtp_name":"gtm.elementUrl",
      "vtp_dataLayerVersion":1
    },{
      "function":"__aev",
      "vtp_varType":"TEXT"
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.data.name"
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.data.itemid"
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.data.price"
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.data.quantity"
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){var a=",["escape",["macro",71],8,16],"*",["escape",["macro",72],8,16],"\/1E5;return a})();"]
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.data.catid_be"
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.data.modelId"
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){var a={ecommerce:{remove:{products:[{name:\"",["escape",["macro",69],7],"\",id:\"",["escape",["macro",70],7],"\",price:",["escape",["macro",73],8,16],",category:\"",["escape",["macro",74],7],"\",variant:\"",["escape",["macro",75],7],"\",quantity:",["escape",["macro",72],8,16],"}]}}};return a})();"]
    },{
      "function":"__v",
      "vtp_name":"gtm.historyChangeSource",
      "vtp_dataLayerVersion":1
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.data.type"
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.operation"
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.data.login_option"
    },{
      "function":"__remm",
      "vtp_setDefaultValue":false,
      "vtp_input":["macro",4],
      "vtp_fullMatch":false,
      "vtp_replaceAfterMatch":false,
      "vtp_ignoreCase":true,
      "vtp_map":["list",["map","key","shopee.co.id","value","2599"]]
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){var g=",["escape",["macro",81],8,16],",h=",["escape",["macro",31],8,16],",a=",["escape",["macro",32],8,16],",k=",["escape",["macro",44],8,16],",l=",["escape",["macro",46],8,16],",d=[],e=[],f=[];(a||[]).forEach(function(a){(Object.values(a.items)||[]).forEach(function(a){})});for(var b=0;b\u003Ca.length;b++)for(var c=0;c\u003Ca[b].items.length;c++)d.push(a[b].items[c].shopid),e.push(a[b].items[c].itemid),f.push(a[b].items[c].categories[0].catids[0]);d=d.join(\"|\");e=e.join(\"|\");f=f.join(\"|\");a=[];a=l.join(\"|\");return g=\"https:\/\/shopback.go2cloud.org\/aff_l?offer_id\\x3d\"+\ng+\"\\x26adv_sub\\x3d\"+h+\"\\x26adv_sub2\\x3d\"+d+\"\\x26adv_sub3\\x3d\"+e+\"\\x26adv_sub4\\x3d\"+a+\"\\x26adv_sub5\\x3d\"+f+\"\\x26amount\\x3d\"+k})();"]
    },{
      "function":"__remm",
      "vtp_setDefaultValue":false,
      "vtp_input":["macro",4],
      "vtp_fullMatch":false,
      "vtp_replaceAfterMatch":false,
      "vtp_ignoreCase":true,
      "vtp_map":["list",["map","key","shopee.co.id","value","UA-61904553-9"],["map","key","shopee.sg","value","UA-61921742-12"],["map","key","shopee.com.my","value","UA-61915055-10"],["map","key","shopee.tw","value","UA-61915057-10"],["map","key","shopee.co.th","value","UA-61914165-10"],["map","key","(giaitri|nhasach).shopee.vn","value","UA-61914164-10"],["map","key","shopee.ph","value","UA-61918643-10"]]
    },{
      "function":"__gas",
      "vtp_cookieDomain":"auto",
      "vtp_doubleClick":true,
      "vtp_setTrackerName":true,
      "vtp_useDebugVersion":false,
      "vtp_fieldsToSet":["list",["map","fieldName","allowLinker","value","true"],["map","fieldName","useAmpClientId","value","true"],["map","fieldName","userId","value",["macro",11]],["map","fieldName","location","value",["macro",14]],["map","fieldName","page","value",["macro",16]]],
      "vtp_trackerName":"",
      "vtp_useHashAutoLink":false,
      "vtp_decorateFormsAutoLink":false,
      "vtp_enableLinkId":true,
      "vtp_dimension":["list",["map","index","3","dimension",["macro",11]],["map","index","2","dimension",["macro",17]],["map","index","4","dimension",["macro",18]]],
      "vtp_enableEcommerce":false,
      "vtp_trackingId":["macro",83],
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false
    },{
      "function":"__r"
    },{
      "function":"__u",
      "vtp_enableMultiQueryKeys":false,
      "vtp_enableIgnoreEmptyQueryParam":false
    },{
      "function":"__u",
      "vtp_component":"QUERY",
      "vtp_queryKey":"keyword",
      "vtp_enableMultiQueryKeys":false,
      "vtp_enableIgnoreEmptyQueryParam":false
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){var a=",["escape",["macro",28],8,16],";return a.map(function(a){return a.targetData.item.itemid})})();"]
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){var e=[\"email\",\"loginKey\"],a=location.pathname+location.search,b=document.createElement(\"a\"),d;b.href=a;if(b.search){a=\"\\x26\"+b.search.replace(\"?\",\"\")+\"\\x26\";for(d=0;d\u003Ce.length;d++){var c=e[d];c=a.indexOf(\"\\x26\"+c+\"\\x3d\");if(-1\u003Cc){var f=a.indexOf(\"\\x26\",c+1);a=a.slice(0,c)+a.slice(f,a.length)}}b.search=a.slice(1,a.length-1)}return b.href.replace(location.origin,\"\")})();"]
    },{
      "function":"__e"
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"ecommerce.purchase.actionField.id"
    },{
      "function":"__remm",
      "vtp_setDefaultValue":false,
      "vtp_input":["macro",4],
      "vtp_fullMatch":false,
      "vtp_replaceAfterMatch":false,
      "vtp_ignoreCase":true,
      "vtp_map":["list",["map","key","shopee.co.id","value","UA-61904553-14"],["map","key","shopee.sg","value","UA-61921742-14"],["map","key","shopee.com.my","value","UA-61915055-12"],["map","key","shopee.tw","value","UA-61915057-13"],["map","key","shopee.co.th","value","UA-61914165-12"],["map","key","shopee.vn","value","UA-61914164-12"],["map","key","shopee.ph","value","UA-61918643-12"]]
    },{
      "function":"__gas",
      "vtp_cookieDomain":"auto",
      "vtp_doubleClick":true,
      "vtp_setTrackerName":true,
      "vtp_useDebugVersion":false,
      "vtp_fieldsToSet":["list",["map","fieldName","allowLinker","value","true"],["map","fieldName","userId","value",["macro",11]],["map","fieldName","location","value",["macro",14]],["map","fieldName","page","value",["macro",16]]],
      "vtp_trackerName":"",
      "vtp_useHashAutoLink":false,
      "vtp_decorateFormsAutoLink":false,
      "vtp_enableLinkId":true,
      "vtp_dimension":["list",["map","index","3","dimension",["macro",11]],["map","index","4","dimension",["macro",18]]],
      "vtp_enableEcommerce":false,
      "vtp_trackingId":["macro",92],
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false
    },{
      "function":"__v",
      "vtp_name":"gtm.elementClasses",
      "vtp_dataLayerVersion":1
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){if(\"pc\"===",["escape",["macro",2],8,16],")return\"pc\";if(\"rweb\"===",["escape",["macro",2],8,16],"||\"rweb_android\"===",["escape",["macro",2],8,16],"||\"mweb\"===",["escape",["macro",2],8,16],")return\"mobile\"})();"]
    },{
      "function":"__cid"
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){return google_tag_manager[",["escape",["macro",96],8,16],"].dataLayer})();"]
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.impressions.0.targetData.item.catid"
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.pageParams.subcategory"
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){return void 0===",["escape",["macro",99],8,16],"?\"cat1\":\"cat2\"})();"]
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.pageParams.categoryId"
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){var a=",["escape",["macro",37],8,16],"\/1E5;return a})();"]
    },{
      "function":"__remm",
      "vtp_setDefaultValue":false,
      "vtp_input":["macro",4],
      "vtp_fullMatch":false,
      "vtp_replaceAfterMatch":false,
      "vtp_ignoreCase":true,
      "vtp_map":["list",["map","key","shopee.co.id","value","100188"],["map","key","shopee.com.my","value","100126"],["map","key","shopee.co.th","value","100245"],["map","key","shopee.sg","value","100376"]]
    },{
      "function":"__remm",
      "vtp_setDefaultValue":false,
      "vtp_input":["macro",4],
      "vtp_fullMatch":false,
      "vtp_replaceAfterMatch":false,
      "vtp_ignoreCase":true,
      "vtp_map":["list",["map","key","shopee.sg","value","139835196351422"],["map","key","shopee.com.my","value","757894527666013"],["map","key","shopee.co.th","value","905703166183408"],["map","key","shopee.tw","value","503280033161781"],["map","key","shopee.co.id","value","466924370133774"],["map","key","shopee.vn","value","1457130904612161"],["map","key","shopee.ph","value","1478059392491608"],["map","key","shopee.com.br","value","703307166810792"]]
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.impressions.0.targetData.item.price"
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){var a=",["escape",["macro",105],8,16],"\/1E5;return a})();"]
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){for(var b=",["escape",["macro",32],8,16],",d=[],a=0;a\u003Cb.length;a++)for(var c=0;c\u003Cb[a].items.length;c++)d.push(b[a].items[c].itemid);return d.join(\",\")})();"]
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){for(var b=",["escape",["macro",32],8,16],",d=[],a=0;a\u003Cb.length;a++)for(var c=0;c\u003Cb[a].items.length;c++)d.push({id:\"\"+b[a].items[c].itemid,item_price:b[a].items[c].price\/1E5,quantity:b[a].items[c].quantity,category:b[a].items[c].categories[0].catids.join(\"\\x3e\")});return d})();"]
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.pageParams.categoryName"
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){var a={cookieName:\"_med\",cookieTime:30,keyToGet:\"utm_medium\",keyToSearch:{gclid:\"cpc\"},shopee_refer:\"^((http(s?):\/\/)(([a-z0-9_]+.)?)(shopee.(sg|com.my|co.th|tw|co.id|vn|ph)\/))\",path:\"\/\",domain:\".\"+location.hostname.replace(\/^www\\.\/i,\"\")};return a})();"]
    },{
      "function":"__f",
      "vtp_component":"URL"
    },{
      "function":"__t"
    },{
      "function":"__remm",
      "vtp_setDefaultValue":false,
      "vtp_input":["macro",4],
      "vtp_fullMatch":false,
      "vtp_replaceAfterMatch":false,
      "vtp_ignoreCase":true,
      "vtp_map":["list",["map","key","shopee.sg","value","11"],["map","key","shopee.com.my","value","8"],["map","key","shopee.co.id","value","14"],["map","key","shopee.vn","value","9"],["map","key","shopee.ph","value","15"],["map","key","shopee.tw","value","13"]]
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.data.price"
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){var a=",["escape",["macro",32],8,16],",d=[];a=a.filter(function(a){return a.hasOwnProperty(\"items\")});for(var b=0;b\u003Ca.length;b++)for(var c=0;c\u003Ca[b].items.length;c++)d.push(a[b].items[c].itemid);return d.join(\"|\")})();"]
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){for(var c=",["escape",["macro",32],8,16],",d=[],e=c.filter(function(a){return a.hasOwnProperty(\"items\")}),a=0;a\u003Ce.length;a++)for(var b=0;b\u003Ce[a].items.length;b++)d.push(c[a].items[b].price\/1E5*c[a].items[b].quantity);return d.join(\"|\")})();"]
    },{
      "function":"__remm",
      "vtp_setDefaultValue":false,
      "vtp_input":["macro",4],
      "vtp_fullMatch":false,
      "vtp_replaceAfterMatch":false,
      "vtp_ignoreCase":true,
      "vtp_map":["list",["map","key","shopee.vn","value","ICay2JfBmbeRc1R5Enp1"],["map","key","shopee.co.id","value","IfdkwXB0UU0fVf5tq0DM"],["map","key","shopee.com.my","value","zlDYA9jJjHq1nyHyCLaU"],["map","key","shopee.ph","value","l7fVkOg4vYLmM3fayfyy"],["map","key","shopee.co.th","value","zXiY0VQ8H0VLkoIzoC80"],["map","key","shopee.sg","value","bQSfrGqH6d5VMoTaldIA"]]
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){var a=",["escape",["macro",26],8,16],"||[],b=[],c;for(c in a)b.push(a[c].itemid);return b.join(\",\")})();"]
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.impressions.0.targetData.item.name"
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){return ",["escape",["macro",22],8,16],"})();"]
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.pageParams.category"
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.pageParams.isOfficialShopTheme"
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.pageParams.keyword"
    },{
      "function":"__remm",
      "vtp_setDefaultValue":false,
      "vtp_input":["macro",4],
      "vtp_fullMatch":false,
      "vtp_replaceAfterMatch":false,
      "vtp_ignoreCase":true,
      "vtp_map":["list",["map","key","shopee.co.id","value","ICM-39-1334"],["map","key","shopee.com.my","value","ICM-11-1270"],["map","key","shopee.co.th","value","ICM-49-1393"]]
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":true,
      "vtp_defaultValue":"",
      "vtp_name":"crto.products"
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){for(var b=",["escape",["macro",125],8,16],",c=[],a=0;a\u003Cb.length\u0026\u00263\u003Ea;a++)\"object\"==typeof b[a]?b[a].hasOwnProperty(\"id\")\u0026\u0026c.push(b[a].id):(\"number\"==typeof b[a]||\"number\"==typeof b[a])\u0026\u0026c.push(b[a]);return c})();"]
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){return\/iPad\/.test(navigator.userAgent)?\"t\":\/Mobile|iP(hone|od)|Android|BlackBerry|IEMobile|Silk\/.test(navigator.userAgent)?\"m\":\"d\"})();"]
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.impressions.0.targetData.item.itemid"
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){var a=",["escape",["macro",26],8,16],"||[],c=[],b;for(b in a)c.push({id:a[b].itemid,price:parseFloat(a[b].price)\/1E5,quantity:a[b].quantity});return c})();"]
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.impressions.0.targetData.cart.totalPrice"
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){var a=",["escape",["macro",130],8,16],"\/1E5;return a})();"]
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){for(var b=[{items:{0:{itemid:15014125,status:1,quantity:2,none_shippable_full_reason:null,price:3E7,donot_add_quantity:!1,shopid:3905134,currency:\"TWD\",item_discount:0,is_flash_sale:!1,mtime:1528495159,free_return_days:null,condition:1,shippable:!0,name:\"\\u9810\\u8cfc iPhoneX \\u5b9a\\u5236 \\u65e5\\u97d3\\u6587\\u85dd\\u6e05\\u65b0\\u5c0f\\u788e\\u82b1 \\u786c\\u6bbc\\u534a\\u5305\/\\u8edf\\u6bbc\\u5168\\u5305 \\u860b\\u679c i8X i7 i6 Plus i5se \\u624b\\u6a5f\\u6bbc\",stock:6,image:\"620beb14b85b2d9a069b10cdd41575be\",\nnone_shippable_reason:null,source:\"null\",modelid:6993834,checkout:!0,model_name:\"i6\/6s \\u8edf\\u6bbc\",addin_time:1529553717,service_by_shopee_flag:0},1:{itemid:15014125,status:1,quantity:5,none_shippable_full_reason:null,price:3E7,donot_add_quantity:!1,shopid:3905134,currency:\"TWD\",item_discount:0,is_flash_sale:!1,mtime:1528495159,free_return_days:null,condition:1,shippable:!0,name:\"\\u9810\\u8cfc iPhoneX \\u5b9a\\u5236 \\u65e5\\u97d3\\u6587\\u85dd\\u6e05\\u65b0\\u5c0f\\u788e\\u82b1 \\u786c\\u6bbc\\u534a\\u5305\/\\u8edf\\u6bbc\\u5168\\u5305 \\u860b\\u679c i8X i7 i6 Plus i5se \\u624b\\u6a5f\\u6bbc\",\nstock:8,image:\"620beb14b85b2d9a069b10cdd41575be\",none_shippable_reason:null,source:\"null\",modelid:6993832,checkout:!0,model_name:\"i8\/i7Plus \\u8edf\\u6bbc\",addin_time:1529553755,service_by_shopee_flag:0}},shop:{is_official_shop:!1,shopid:3905134,shop_name:\"\\u5b8c\\u7f8e\\u5c0f\\u59d0\\u624b\\u6a5f\\u6bbc\\u5c08\\u8ce3\",support_ereceipt:!1,images:\"\",cb_option:!1},shipping_fee:3E6,total_without_shipping:21E7}],d=[],a=0;a\u003Cb.length;a++)for(var c=0;c\u003Cb[a].items.length;c++)d.push(b[a].items[c].itemid);return d})();"]
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){var a=[{items:{0:{itemid:15014125,status:1,quantity:2,none_shippable_full_reason:null,price:3E7,donot_add_quantity:!1,shopid:3905134,currency:\"TWD\",item_discount:0,is_flash_sale:!1,mtime:1528495159,free_return_days:null,condition:1,shippable:!0,name:\"\\u9810\\u8cfc iPhoneX \\u5b9a\\u5236 \\u65e5\\u97d3\\u6587\\u85dd\\u6e05\\u65b0\\u5c0f\\u788e\\u82b1 \\u786c\\u6bbc\\u534a\\u5305\/\\u8edf\\u6bbc\\u5168\\u5305 \\u860b\\u679c i8X i7 i6 Plus i5se \\u624b\\u6a5f\\u6bbc\",stock:6,image:\"620beb14b85b2d9a069b10cdd41575be\",\nnone_shippable_reason:null,source:\"null\",modelid:6993834,checkout:!0,model_name:\"i6\/6s \\u8edf\\u6bbc\",addin_time:1529553717,service_by_shopee_flag:0},1:{itemid:15014125,status:1,quantity:5,none_shippable_full_reason:null,price:3E7,donot_add_quantity:!1,shopid:3905134,currency:\"TWD\",item_discount:0,is_flash_sale:!1,mtime:1528495159,free_return_days:null,condition:1,shippable:!0,name:\"\\u9810\\u8cfc iPhoneX \\u5b9a\\u5236 \\u65e5\\u97d3\\u6587\\u85dd\\u6e05\\u65b0\\u5c0f\\u788e\\u82b1 \\u786c\\u6bbc\\u534a\\u5305\/\\u8edf\\u6bbc\\u5168\\u5305 \\u860b\\u679c i8X i7 i6 Plus i5se \\u624b\\u6a5f\\u6bbc\",\nstock:8,image:\"620beb14b85b2d9a069b10cdd41575be\",none_shippable_reason:null,source:\"null\",modelid:6993832,checkout:!0,model_name:\"i8\/i7Plus \\u8edf\\u6bbc\",addin_time:1529553755,service_by_shopee_flag:0}},shop:{is_official_shop:!1,shopid:3905134,shop_name:\"\\u5b8c\\u7f8e\\u5c0f\\u59d0\\u624b\\u6a5f\\u6bbc\\u5c08\\u8ce3\",support_ereceipt:!1,images:\"\",cb_option:!1},shipping_fee:3E6,total_without_shipping:21E7}];return a.map(function(a){return a.items.map(function(a){return a.itemid}).join(\"|\")}).join(\"|\")})();"]
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){for(var b=[{items:{0:{itemid:15014125,status:1,quantity:2,none_shippable_full_reason:null,price:3E7,donot_add_quantity:!1,shopid:3905134,currency:\"TWD\",item_discount:0,is_flash_sale:!1,mtime:1528495159,free_return_days:null,condition:1,shippable:!0,name:\"\\u9810\\u8cfc iPhoneX \\u5b9a\\u5236 \\u65e5\\u97d3\\u6587\\u85dd\\u6e05\\u65b0\\u5c0f\\u788e\\u82b1 \\u786c\\u6bbc\\u534a\\u5305\/\\u8edf\\u6bbc\\u5168\\u5305 \\u860b\\u679c i8X i7 i6 Plus i5se \\u624b\\u6a5f\\u6bbc\",stock:6,image:\"620beb14b85b2d9a069b10cdd41575be\",\nnone_shippable_reason:null,source:\"null\",modelid:6993834,checkout:!0,model_name:\"i6\/6s \\u8edf\\u6bbc\",addin_time:1529553717,service_by_shopee_flag:0},1:{itemid:15014125,status:1,quantity:5,none_shippable_full_reason:null,price:3E7,donot_add_quantity:!1,shopid:3905134,currency:\"TWD\",item_discount:0,is_flash_sale:!1,mtime:1528495159,free_return_days:null,condition:1,shippable:!0,name:\"\\u9810\\u8cfc iPhoneX \\u5b9a\\u5236 \\u65e5\\u97d3\\u6587\\u85dd\\u6e05\\u65b0\\u5c0f\\u788e\\u82b1 \\u786c\\u6bbc\\u534a\\u5305\/\\u8edf\\u6bbc\\u5168\\u5305 \\u860b\\u679c i8X i7 i6 Plus i5se \\u624b\\u6a5f\\u6bbc\",\nstock:8,image:\"620beb14b85b2d9a069b10cdd41575be\",none_shippable_reason:null,source:\"null\",modelid:6993832,checkout:!0,model_name:\"i8\/i7Plus \\u8edf\\u6bbc\",addin_time:1529553755,service_by_shopee_flag:0}},shop:{is_official_shop:!1,shopid:3905134,shop_name:\"\\u5b8c\\u7f8e\\u5c0f\\u59d0\\u624b\\u6a5f\\u6bbc\\u5c08\\u8ce3\",support_ereceipt:!1,images:\"\",cb_option:!1},shipping_fee:3E6,total_without_shipping:21E7}],d=[],a=0;a\u003Cb.length;a++)for(var c=0;c\u003Cb[a].items.length;c++)d.push({id:\"\"+b[a].items[c].itemid,item_price:b[a].items[c].price\/\n1E5,quantity:b[a].items[c].quantity,category:b[a].items[c].categories[0].catids.join(\"\\x3e\")});return d})();"]
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.data.price"
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){var a=",["escape",["macro",114],8,16],",b=a.shipping_subtotal\/1E5,c=a.tax_payable\/1E5;return a=a.total_payable\/1E5-b-c})();"]
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){var b=",["escape",["macro",51],8,16],",n=",["escape",["macro",31],8,16],",p=",["escape",["macro",46],8,16],",c=",["escape",["macro",32],8,16],";b=\"https:\/\/prf.hn\/conversion\/campaign:\"+b+\"\/conversionref:\"+n+\"\/country:\"+",["escape",["macro",22],8,16],"+\"\/currency:\"+",["escape",["macro",34],8,16],"+\"\/\";var f=[];(c||[]).forEach(function(a){(Object.values(a.items)||[]).forEach(function(a){var b=a.itemid,c=a.price\/1E5,d=a.quantity,e=a.shopid;a=a.categories[0].catids[0];f.push({itemId:b,itemPrice:c,quantity:d,shopId:e,categoryL1:a})})});var d,e,g,h,k,l=[];\n(Object.values(f)||[]).forEach(function(a){d=a.itemId;e=a.itemPrice;g=a.quantity;h=a.categoryL1;k=a.shopId;l.push(\"[category:\"+h+\"\/sku:\"+d+\"\/value:\"+e+\"\/quantity:\"+g+\"\/shop_id:\"+k+\"\/order_id:\"+p+\"\/]\")});var m=\"\";(Object.values(l)||[]).forEach(function(a){m+=a});return c=b+m})();"]
    },{
      "function":"__v",
      "vtp_name":"gtm.scrollThreshold",
      "vtp_dataLayerVersion":1
    },{
      "function":"__smm",
      "vtp_setDefaultValue":false,
      "vtp_input":["macro",138],
      "vtp_map":["list",["map","key","0","value","Baseline"],["map","key","10","value","10%"],["map","key","25","value","25%"],["map","key","50","value","50%"],["map","key","75","value","75%"],["map","key","90","value","90%"],["map","key","100","value","100%"]]
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){var a=document.location.pathname.split(\"\/\");return a[1].toLowerCase()})();"]
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.data"
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.data"
    },{
      "function":"__jsm",
      "vtp_javascript":["template","(function(){return window.location.pathname+window.location.search+window.location.hash})();"]
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.data.shopid"
    },{
      "function":"__v",
      "vtp_dataLayerVersion":2,
      "vtp_setDefaultValue":false,
      "vtp_name":"info.data.response"
    },{
      "function":"__remm",
      "vtp_setDefaultValue":false,
      "vtp_input":["macro",4],
      "vtp_fullMatch":false,
      "vtp_replaceAfterMatch":false,
      "vtp_ignoreCase":true,
      "vtp_map":["list",["map","key","shopee.co.id","value","G-SW6D8G0HXK"],["map","key","shopee.sg","value",""],["map","key","shopee.com.my","value",""],["map","key","shopee.tw","value",""],["map","key","shopee.co.th","value",""],["map","key","shopee.vn","value",""],["map","key","shopee.ph","value",""],["map","key","shopee.com.br","value",""]]
    },{
      "function":"__v",
      "vtp_name":"gtm.element",
      "vtp_dataLayerVersion":1
    },{
      "function":"__v",
      "vtp_name":"gtm.elementId",
      "vtp_dataLayerVersion":1
    },{
      "function":"__v",
      "vtp_name":"gtm.elementTarget",
      "vtp_dataLayerVersion":1
    },{
      "function":"__v",
      "vtp_name":"gtm.newUrlFragment",
      "vtp_dataLayerVersion":1
    },{
      "function":"__v",
      "vtp_name":"gtm.oldUrlFragment",
      "vtp_dataLayerVersion":1
    },{
      "function":"__v",
      "vtp_name":"gtm.newHistoryState",
      "vtp_dataLayerVersion":1
    },{
      "function":"__v",
      "vtp_name":"gtm.oldHistoryState",
      "vtp_dataLayerVersion":1
    }],
  "tags":[{
      "function":"__ua",
      "priority":50,
      "once_per_event":true,
      "vtp_nonInteraction":false,
      "vtp_overrideGaSettings":true,
      "vtp_useEcommerceDataLayer":false,
      "vtp_ecommerceMacroData":["macro",45],
      "vtp_eventCategory":"tracking",
      "vtp_trackType":"TRACK_EVENT",
      "vtp_gaSettings":["macro",20],
      "vtp_eventAction":"purchase",
      "vtp_eventLabel":["macro",46],
      "vtp_enableEcommerce":true,
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false,
      "vtp_enableFirebaseCampaignData":true,
      "vtp_ecommerceIsEnabled":true,
      "vtp_trackTypeIsEvent":true,
      "tag_id":68
    },{
      "function":"__html",
      "priority":2,
      "once_per_event":true,
      "vtp_html":["template","\u003Cscript type=\"text\/gtmscript\"\u003Evar p=",["escape",["macro",110],8,16],";document.cookie=p.cookieName+\"\\x3d; expires\\x3dThu, 01 Jan 1970 00:00:01 GMT; path\\x3d\"+p.path+\";domain\\x3d\"+p.domain;\u003C\/script\u003E\n"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":79
    },{
      "function":"__paused",
      "vtp_originalTagType":"html",
      "tag_id":2
    },{
      "function":"__paused",
      "vtp_originalTagType":"html",
      "tag_id":3
    },{
      "function":"__paused",
      "vtp_originalTagType":"html",
      "tag_id":4
    },{
      "function":"__paused",
      "vtp_originalTagType":"html",
      "tag_id":5
    },{
      "function":"__paused",
      "vtp_originalTagType":"html",
      "tag_id":6
    },{
      "function":"__paused",
      "vtp_originalTagType":"html",
      "tag_id":8
    },{
      "function":"__ua",
      "metadata":["map"],
      "once_per_load":true,
      "vtp_overrideGaSettings":false,
      "vtp_trackType":"TRACK_PAGEVIEW",
      "vtp_gaSettings":["macro",20],
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false,
      "vtp_enableFirebaseCampaignData":true,
      "tag_id":15
    },{
      "function":"__paused",
      "vtp_originalTagType":"html",
      "tag_id":21
    },{
      "function":"__paused",
      "vtp_originalTagType":"html",
      "tag_id":28
    },{
      "function":"__paused",
      "vtp_originalTagType":"html",
      "tag_id":29
    },{
      "function":"__paused",
      "vtp_originalTagType":"html",
      "tag_id":30
    },{
      "function":"__hjtc",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_hotjar_site_id":"868286",
      "tag_id":32
    },{
      "function":"__paused",
      "vtp_originalTagType":"html",
      "tag_id":33
    },{
      "function":"__paused",
      "vtp_originalTagType":"html",
      "tag_id":35
    },{
      "function":"__paused",
      "vtp_originalTagType":"html",
      "tag_id":37
    },{
      "function":"__paused",
      "vtp_originalTagType":"html",
      "tag_id":38
    },{
      "function":"__crto",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_accountId":["macro",23],
      "vtp_hashedEmail":["macro",24],
      "vtp_tagType":"BASKET_TAG",
      "vtp_siteType":["macro",25],
      "vtp_basketArray":["macro",27],
      "tag_id":50
    },{
      "function":"__crto",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_accountId":["macro",23],
      "vtp_hashedEmail":["macro",24],
      "vtp_tagType":"HOME_TAG",
      "vtp_siteType":["macro",25],
      "tag_id":51
    },{
      "function":"__crto",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_accountId":["macro",23],
      "vtp_hashedEmail":["macro",24],
      "vtp_tagType":"LISTING_TAG",
      "vtp_listingID":["macro",29],
      "vtp_siteType":["macro",25],
      "tag_id":52
    },{
      "function":"__crto",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_accountId":["macro",23],
      "vtp_hashedEmail":["macro",24],
      "vtp_productID":["macro",30],
      "vtp_tagType":"PRODUCT_TAG",
      "vtp_siteType":["macro",25],
      "tag_id":53
    },{
      "function":"__crto",
      "metadata":["map"],
      "once_per_load":true,
      "vtp_accountId":["macro",23],
      "vtp_hashedEmail":["macro",24],
      "vtp_tagType":"TRANSACTION_TAG",
      "vtp_siteType":["macro",25],
      "vtp_TransactionID":["macro",31],
      "vtp_TransactionArray":["macro",33],
      "tag_id":54
    },{
      "function":"__gclidw",
      "once_per_event":true,
      "vtp_enableCookieOverrides":false,
      "vtp_enableCrossDomainFeature":true,
      "vtp_enableCookieUpdateFeature":false,
      "vtp_enableCookieFlagsFeature":false,
      "vtp_enableUrlPassthroughFeature":false,
      "tag_id":57
    },{
      "function":"__hjtc",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_hotjar_site_id":"955851",
      "tag_id":63
    },{
      "function":"__paused",
      "vtp_originalTagType":"html",
      "tag_id":64
    },{
      "function":"__paused",
      "vtp_originalTagType":"ua",
      "tag_id":65
    },{
      "function":"__ua",
      "once_per_event":true,
      "vtp_nonInteraction":false,
      "vtp_overrideGaSettings":true,
      "vtp_useEcommerceDataLayer":false,
      "vtp_ecommerceMacroData":["macro",42],
      "vtp_eventCategory":"tracking",
      "vtp_trackType":"TRACK_EVENT",
      "vtp_gaSettings":["macro",20],
      "vtp_eventAction":"add_to_cart",
      "vtp_enableEcommerce":true,
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false,
      "vtp_enableFirebaseCampaignData":true,
      "vtp_ecommerceIsEnabled":true,
      "vtp_trackTypeIsEvent":true,
      "tag_id":66
    },{
      "function":"__ua",
      "once_per_event":true,
      "vtp_nonInteraction":false,
      "vtp_overrideGaSettings":true,
      "vtp_eventCategory":"register",
      "vtp_trackType":"TRACK_EVENT",
      "vtp_gaSettings":["macro",20],
      "vtp_eventAction":["macro",43],
      "vtp_eventLabel":["macro",11],
      "vtp_dimension":["list",["map","index","1","dimension",["macro",11]]],
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false,
      "vtp_enableFirebaseCampaignData":true,
      "vtp_trackTypeIsEvent":true,
      "tag_id":67
    },{
      "function":"__paused",
      "vtp_originalTagType":"ua",
      "tag_id":69
    },{
      "function":"__paused",
      "vtp_originalTagType":"html",
      "tag_id":71
    },{
      "function":"__ua",
      "metadata":["map"],
      "unlimited":true,
      "vtp_overrideGaSettings":true,
      "vtp_fieldsToSet":["list",["map","fieldName","title","value",["macro",47]]],
      "vtp_trackType":"TRACK_PAGEVIEW",
      "vtp_gaSettings":["macro",20],
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false,
      "vtp_enableFirebaseCampaignData":true,
      "tag_id":72
    },{
      "function":"__hjtc",
      "once_per_event":true,
      "vtp_hotjar_site_id":["macro",49],
      "tag_id":75
    },{
      "function":"__paused",
      "vtp_originalTagType":"html",
      "tag_id":76
    },{
      "function":"__img",
      "metadata":["map"],
      "teardown_tags":["list",["tag",1,0]],
      "once_per_event":true,
      "vtp_useCacheBuster":false,
      "vtp_url":["escape",["macro",52],14,3],
      "tag_id":77
    },{
      "function":"__ua",
      "once_per_event":true,
      "vtp_nonInteraction":false,
      "vtp_overrideGaSettings":true,
      "vtp_useEcommerceDataLayer":false,
      "vtp_ecommerceMacroData":["macro",42],
      "vtp_eventCategory":"tracking",
      "vtp_trackType":"TRACK_EVENT",
      "vtp_gaSettings":["macro",53],
      "vtp_eventAction":"add_to_cart",
      "vtp_enableEcommerce":true,
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false,
      "vtp_enableFirebaseCampaignData":true,
      "vtp_ecommerceIsEnabled":true,
      "vtp_trackTypeIsEvent":true,
      "tag_id":81
    },{
      "function":"__paused",
      "vtp_originalTagType":"ua",
      "tag_id":82
    },{
      "function":"__ua",
      "metadata":["map"],
      "unlimited":true,
      "vtp_overrideGaSettings":true,
      "vtp_fieldsToSet":["list",["map","fieldName","title","value",["macro",47]]],
      "vtp_trackType":"TRACK_PAGEVIEW",
      "vtp_gaSettings":["macro",53],
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false,
      "vtp_enableFirebaseCampaignData":true,
      "tag_id":83
    },{
      "function":"__ua",
      "metadata":["map"],
      "once_per_load":true,
      "vtp_overrideGaSettings":false,
      "vtp_trackType":"TRACK_PAGEVIEW",
      "vtp_gaSettings":["macro",53],
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false,
      "vtp_enableFirebaseCampaignData":true,
      "tag_id":84
    },{
      "function":"__ua",
      "once_per_event":true,
      "vtp_nonInteraction":false,
      "vtp_overrideGaSettings":true,
      "vtp_useEcommerceDataLayer":false,
      "vtp_ecommerceMacroData":["macro",45],
      "vtp_eventCategory":"tracking",
      "vtp_trackType":"TRACK_EVENT",
      "vtp_gaSettings":["macro",53],
      "vtp_eventAction":"purchase",
      "vtp_eventLabel":["macro",46],
      "vtp_enableEcommerce":true,
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false,
      "vtp_enableFirebaseCampaignData":true,
      "vtp_ecommerceIsEnabled":true,
      "vtp_trackTypeIsEvent":true,
      "tag_id":85
    },{
      "function":"__paused",
      "vtp_originalTagType":"ua",
      "tag_id":86
    },{
      "function":"__paused",
      "vtp_originalTagType":"ua",
      "tag_id":87
    },{
      "function":"__paused",
      "vtp_originalTagType":"html",
      "tag_id":88
    },{
      "function":"__paused",
      "vtp_originalTagType":"html",
      "tag_id":89
    },{
      "function":"__paused",
      "vtp_originalTagType":"html",
      "tag_id":90
    },{
      "function":"__paused",
      "vtp_originalTagType":"html",
      "tag_id":91
    },{
      "function":"__paused",
      "vtp_originalTagType":"html",
      "tag_id":92
    },{
      "function":"__ua",
      "once_per_load":true,
      "vtp_overrideGaSettings":false,
      "vtp_trackType":"TRACK_PAGEVIEW",
      "vtp_gaSettings":["macro",58],
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false,
      "vtp_enableFirebaseCampaignData":true,
      "tag_id":93
    },{
      "function":"__ua",
      "once_per_event":true,
      "vtp_nonInteraction":false,
      "vtp_overrideGaSettings":false,
      "vtp_eventCategory":"video-playing",
      "vtp_trackType":"TRACK_EVENT",
      "vtp_gaSettings":["macro",58],
      "vtp_eventAction":["template",["macro",60]," - ",["macro",61]],
      "vtp_eventLabel":["macro",64],
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false,
      "vtp_enableFirebaseCampaignData":true,
      "vtp_trackTypeIsEvent":true,
      "tag_id":94
    },{
      "function":"__paused",
      "vtp_originalTagType":"ua",
      "tag_id":95
    },{
      "function":"__ua",
      "metadata":["map"],
      "once_per_load":true,
      "vtp_overrideGaSettings":false,
      "vtp_trackType":"TRACK_PAGEVIEW",
      "vtp_gaSettings":["macro",66],
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false,
      "vtp_enableFirebaseCampaignData":true,
      "tag_id":96
    },{
      "function":"__paused",
      "vtp_originalTagType":"html",
      "tag_id":97
    },{
      "function":"__ua",
      "once_per_event":true,
      "vtp_nonInteraction":false,
      "vtp_overrideGaSettings":false,
      "vtp_eventCategory":"blog-link-clicked",
      "vtp_trackType":"TRACK_EVENT",
      "vtp_gaSettings":["macro",58],
      "vtp_eventAction":["macro",67],
      "vtp_eventLabel":["macro",68],
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false,
      "vtp_enableFirebaseCampaignData":true,
      "vtp_trackTypeIsEvent":true,
      "tag_id":99
    },{
      "function":"__ua",
      "once_per_event":true,
      "vtp_nonInteraction":false,
      "vtp_overrideGaSettings":true,
      "vtp_useEcommerceDataLayer":false,
      "vtp_ecommerceMacroData":["macro",76],
      "vtp_eventCategory":"tracking",
      "vtp_trackType":"TRACK_EVENT",
      "vtp_gaSettings":["macro",20],
      "vtp_eventAction":"remove_from_cart",
      "vtp_enableEcommerce":true,
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false,
      "vtp_enableFirebaseCampaignData":true,
      "vtp_ecommerceIsEnabled":true,
      "vtp_trackTypeIsEvent":true,
      "tag_id":100
    },{
      "function":"__paused",
      "vtp_originalTagType":"ua",
      "tag_id":103
    },{
      "function":"__ua",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_overrideGaSettings":true,
      "vtp_trackType":"TRACK_PAGEVIEW",
      "vtp_gaSettings":["macro",66],
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false,
      "vtp_enableFirebaseCampaignData":true,
      "tag_id":106
    },{
      "function":"__ua",
      "once_per_event":true,
      "vtp_nonInteraction":false,
      "vtp_overrideGaSettings":true,
      "vtp_eventCategory":"login",
      "vtp_trackType":"TRACK_EVENT",
      "vtp_gaSettings":["macro",20],
      "vtp_eventAction":["macro",78],
      "vtp_eventLabel":["macro",11],
      "vtp_dimension":["list",["map","index","1","dimension",["macro",11]]],
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false,
      "vtp_enableFirebaseCampaignData":true,
      "vtp_trackTypeIsEvent":true,
      "tag_id":107
    },{
      "function":"__ua",
      "once_per_event":true,
      "vtp_nonInteraction":false,
      "vtp_overrideGaSettings":true,
      "vtp_eventCategory":"login",
      "vtp_trackType":"TRACK_EVENT",
      "vtp_gaSettings":["macro",20],
      "vtp_eventAction":["macro",80],
      "vtp_eventLabel":["macro",11],
      "vtp_dimension":["list",["map","index","1","dimension",["macro",11]]],
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false,
      "vtp_enableFirebaseCampaignData":true,
      "vtp_trackTypeIsEvent":true,
      "tag_id":108
    },{
      "function":"__img",
      "metadata":["map"],
      "teardown_tags":["list",["tag",1,0]],
      "once_per_event":true,
      "vtp_useCacheBuster":false,
      "vtp_url":["escape",["macro",82],14,3],
      "tag_id":118
    },{
      "function":"__ua",
      "metadata":["map"],
      "once_per_load":true,
      "vtp_overrideGaSettings":false,
      "vtp_trackType":"TRACK_PAGEVIEW",
      "vtp_gaSettings":["macro",84],
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false,
      "vtp_enableFirebaseCampaignData":true,
      "tag_id":120
    },{
      "function":"__flc",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u31","value",["macro",11]],["map","key","u33","value",["macro",78]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"id-w-lm",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9469210",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":121
    },{
      "function":"__flc",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u30","value",["macro",43]],["map","key","u31","value",["macro",11]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"id-w-ss",
      "vtp_ordinalType":"UNIQUE",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9469210",
      "vtp_ordinalUnique":"1",
      "vtp_number":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":123
    },{
      "function":"__flc",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u31","value",["macro",11]],["map","key","u32","value",["macro",80]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"id-w-ld",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9469210",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":124
    },{
      "function":"__flc",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u49","value",["macro",87]],["map","key","u50","value",["macro",88]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"id-w-sit",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9469210",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":125
    },{
      "function":"__flc",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u28","value",["macro",89]],["map","key","u29","value",["macro",47]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"id-w-pg",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9469210",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":126
    },{
      "function":"__flc",
      "metadata":["map"],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"id-w-pv",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9469210",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":127
    },{
      "function":"__fls",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u40","value",["macro",69]],["map","key","u41","value",["macro",70]],["map","key","u42","value",["macro",73]],["map","key","u43","value",["macro",74]],["map","key","u44","value",["macro",75]],["map","key","u45","value",["macro",72]]],
      "vtp_revenue":["macro",73],
      "vtp_enableConversionLinker":true,
      "vtp_countingMethod":"TRANSACTIONS",
      "vtp_orderId":["macro",70],
      "vtp_enableProductReporting":false,
      "vtp_groupTag":"sconv",
      "vtp_useImageTag":false,
      "vtp_activityTag":"id-w-rc",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9469210",
      "vtp_countingMethodIsTransactions":true,
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":128
    },{
      "function":"__fls",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u34","value",["macro",35]],["map","key","u35","value",["macro",36]],["map","key","u36","value",["macro",39]],["map","key","u37","value",["macro",40]],["map","key","u38","value",["macro",41]],["map","key","u39","value",["macro",38]]],
      "vtp_revenue":["macro",39],
      "vtp_enableConversionLinker":true,
      "vtp_countingMethod":"TRANSACTIONS",
      "vtp_orderId":["macro",36],
      "vtp_enableProductReporting":false,
      "vtp_groupTag":"sconv",
      "vtp_useImageTag":false,
      "vtp_activityTag":"id-w-ac",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9469210",
      "vtp_countingMethodIsTransactions":true,
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":129
    },{
      "function":"__fls",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u46","value",["macro",46]],["map","key","u47","value",["macro",31]],["map","key","u48","value",["macro",44]]],
      "vtp_revenue":["macro",44],
      "vtp_enableConversionLinker":true,
      "vtp_countingMethod":"TRANSACTIONS",
      "vtp_orderId":["macro",46],
      "vtp_enableProductReporting":false,
      "vtp_groupTag":"fconv",
      "vtp_useImageTag":false,
      "vtp_activityTag":"id-w-po",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9469210",
      "vtp_countingMethodIsTransactions":true,
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":130
    },{
      "function":"__flc",
      "metadata":["map"],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"my-w-pv",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9526848",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":131
    },{
      "function":"__flc",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_customVariable":["list",["map","key","u31","value",["macro",11]],["map","key","u32","value",["macro",80]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"my-w-ld",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9526848",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":134
    },{
      "function":"__fls",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_customVariable":["list",["map","key","u34","value",["macro",35]],["map","key","u35","value",["macro",36]],["map","key","u36","value",["macro",39]],["map","key","u37","value",["macro",40]],["map","key","u38","value",["macro",41]],["map","key","u39","value",["macro",38]]],
      "vtp_revenue":["macro",39],
      "vtp_enableConversionLinker":true,
      "vtp_countingMethod":"TRANSACTIONS",
      "vtp_orderId":["macro",36],
      "vtp_enableProductReporting":false,
      "vtp_groupTag":"sconv",
      "vtp_useImageTag":false,
      "vtp_activityTag":"my-w-ac",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9526848",
      "vtp_countingMethodIsTransactions":true,
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":135
    },{
      "function":"__flc",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_customVariable":["list",["map","key","u31","value",["macro",11]],["map","key","u33","value",["macro",78]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"my-w-lm",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9526848",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":136
    },{
      "function":"__flc",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u49","value",["macro",87]],["map","key","u50","value",["macro",88]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"my-w-sit",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9526848",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":137
    },{
      "function":"__flc",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u30","value",["macro",43]],["map","key","u31","value",["macro",11]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"my-w-ss",
      "vtp_ordinalType":"UNIQUE",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9526848",
      "vtp_ordinalUnique":"1",
      "vtp_number":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":138
    },{
      "function":"__fls",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u46","value",["macro",46]],["map","key","u47","value",["macro",31]],["map","key","u48","value",["macro",44]]],
      "vtp_revenue":["macro",44],
      "vtp_enableConversionLinker":true,
      "vtp_countingMethod":"TRANSACTIONS",
      "vtp_orderId":["macro",46],
      "vtp_enableProductReporting":false,
      "vtp_groupTag":"fconv",
      "vtp_useImageTag":false,
      "vtp_activityTag":"my-w-po",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9526848",
      "vtp_countingMethodIsTransactions":true,
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":139
    },{
      "function":"__flc",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_customVariable":["list",["map","key","u28","value",["macro",89]],["map","key","u29","value",["macro",47]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"my-w-pg",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9526848",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":140
    },{
      "function":"__fls",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u40","value",["macro",69]],["map","key","u41","value",["macro",70]],["map","key","u42","value",["macro",73]],["map","key","u43","value",["macro",74]],["map","key","u44","value",["macro",75]],["map","key","u45","value",["macro",72]]],
      "vtp_revenue":["macro",73],
      "vtp_enableConversionLinker":true,
      "vtp_countingMethod":"TRANSACTIONS",
      "vtp_orderId":["macro",70],
      "vtp_enableProductReporting":false,
      "vtp_groupTag":"sconv",
      "vtp_useImageTag":false,
      "vtp_activityTag":"my-w-rc",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9526848",
      "vtp_countingMethodIsTransactions":true,
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":141
    },{
      "function":"__flc",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_customVariable":["list",["map","key","u28","value",["macro",89]],["map","key","u29","value",["macro",47]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"ph-w-pg",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9554009",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":142
    },{
      "function":"__flc",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u30","value",["macro",43]],["map","key","u31","value",["macro",11]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"ph-w-ss",
      "vtp_ordinalType":"UNIQUE",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9554009",
      "vtp_ordinalUnique":"1",
      "vtp_number":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":143
    },{
      "function":"__flc",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_customVariable":["list",["map","key","u31","value",["macro",11]],["map","key","u32","value",["macro",80]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"ph-w-ld",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9554009",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":144
    },{
      "function":"__flc",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_customVariable":["list",["map","key","u31","value",["macro",11]],["map","key","u33","value",["macro",78]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"ph-w-lm",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9554009",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":145
    },{
      "function":"__fls",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u46","value",["macro",46]],["map","key","u47","value",["macro",31]],["map","key","u48","value",["macro",44]]],
      "vtp_revenue":["macro",44],
      "vtp_enableConversionLinker":true,
      "vtp_countingMethod":"TRANSACTIONS",
      "vtp_orderId":["macro",46],
      "vtp_enableProductReporting":false,
      "vtp_groupTag":"fconv",
      "vtp_useImageTag":false,
      "vtp_activityTag":"ph-w-po",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9554009",
      "vtp_countingMethodIsTransactions":true,
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":146
    },{
      "function":"__flc",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u49","value",["macro",87]],["map","key","u50","value",["macro",88]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"sg-w-sit",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9554009",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":147
    },{
      "function":"__flc",
      "metadata":["map"],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"ph-w-pv",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9554009",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":148
    },{
      "function":"__fls",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_customVariable":["list",["map","key","u34","value",["macro",35]],["map","key","u35","value",["macro",36]],["map","key","u36","value",["macro",39]],["map","key","u37","value",["macro",40]],["map","key","u38","value",["macro",41]],["map","key","u39","value",["macro",38]]],
      "vtp_revenue":["macro",39],
      "vtp_enableConversionLinker":true,
      "vtp_countingMethod":"TRANSACTIONS",
      "vtp_orderId":["macro",36],
      "vtp_enableProductReporting":false,
      "vtp_groupTag":"sconv",
      "vtp_useImageTag":false,
      "vtp_activityTag":"ph-w-ac",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9554009",
      "vtp_countingMethodIsTransactions":true,
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":149
    },{
      "function":"__fls",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u40","value",["macro",69]],["map","key","u41","value",["macro",70]],["map","key","u42","value",["macro",73]],["map","key","u43","value",["macro",74]],["map","key","u44","value",["macro",75]],["map","key","u45","value",["macro",72]]],
      "vtp_revenue":["macro",73],
      "vtp_enableConversionLinker":true,
      "vtp_countingMethod":"TRANSACTIONS",
      "vtp_orderId":["macro",70],
      "vtp_enableProductReporting":false,
      "vtp_groupTag":"sconv",
      "vtp_useImageTag":false,
      "vtp_activityTag":"ph-w-rc",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9554009",
      "vtp_countingMethodIsTransactions":true,
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":150
    },{
      "function":"__fls",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_customVariable":["list",["map","key","u34","value",["macro",35]],["map","key","u35","value",["macro",36]],["map","key","u36","value",["macro",39]],["map","key","u37","value",["macro",40]],["map","key","u38","value",["macro",41]],["map","key","u39","value",["macro",38]]],
      "vtp_revenue":["macro",39],
      "vtp_enableConversionLinker":true,
      "vtp_countingMethod":"TRANSACTIONS",
      "vtp_orderId":["macro",36],
      "vtp_enableProductReporting":false,
      "vtp_groupTag":"sconv",
      "vtp_useImageTag":false,
      "vtp_activityTag":"sg-w-ac",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9555544",
      "vtp_countingMethodIsTransactions":true,
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":151
    },{
      "function":"__flc",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u49","value",["macro",87]],["map","key","u50","value",["macro",88]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"sg-w-sit",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9555544",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":152
    },{
      "function":"__fls",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u40","value",["macro",69]],["map","key","u41","value",["macro",70]],["map","key","u42","value",["macro",73]],["map","key","u43","value",["macro",74]],["map","key","u44","value",["macro",75]],["map","key","u45","value",["macro",72]]],
      "vtp_revenue":["macro",73],
      "vtp_enableConversionLinker":true,
      "vtp_countingMethod":"TRANSACTIONS",
      "vtp_orderId":["macro",70],
      "vtp_enableProductReporting":false,
      "vtp_groupTag":"sconv",
      "vtp_useImageTag":false,
      "vtp_activityTag":"sg-w-rc",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9555544",
      "vtp_countingMethodIsTransactions":true,
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":153
    },{
      "function":"__flc",
      "metadata":["map"],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"sg-w-pv",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9555544",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":154
    },{
      "function":"__flc",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u30","value",["macro",43]],["map","key","u31","value",["macro",11]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"sg-w-ss",
      "vtp_ordinalType":"UNIQUE",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9555544",
      "vtp_ordinalUnique":"1",
      "vtp_number":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":155
    },{
      "function":"__flc",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_customVariable":["list",["map","key","u31","value",["macro",11]],["map","key","u32","value",["macro",80]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"sg-w-ld",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9555544",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":156
    },{
      "function":"__flc",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u31","value",["macro",11]],["map","key","u33","value",["macro",78]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"sg-w-lm",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9555544",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":157
    },{
      "function":"__fls",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u46","value",["macro",46]],["map","key","u47","value",["macro",31]],["map","key","u48","value",["macro",44]]],
      "vtp_revenue":["macro",44],
      "vtp_enableConversionLinker":true,
      "vtp_countingMethod":"TRANSACTIONS",
      "vtp_orderId":["macro",46],
      "vtp_enableProductReporting":false,
      "vtp_groupTag":"fconv",
      "vtp_useImageTag":false,
      "vtp_activityTag":"sg-w-po",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9555544",
      "vtp_countingMethodIsTransactions":true,
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":158
    },{
      "function":"__flc",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_customVariable":["list",["map","key","u28","value",["macro",89]],["map","key","u29","value",["macro",47]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"sg-w-pg",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9555544",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":159
    },{
      "function":"__flc",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u31","value",["macro",11]],["map","key","u33","value",["macro",78]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"th-w-lm",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9527148",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":160
    },{
      "function":"__fls",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u46","value",["macro",46]],["map","key","u47","value",["macro",31]],["map","key","u48","value",["macro",44]]],
      "vtp_revenue":["macro",44],
      "vtp_enableConversionLinker":true,
      "vtp_countingMethod":"TRANSACTIONS",
      "vtp_orderId":["macro",46],
      "vtp_enableProductReporting":false,
      "vtp_groupTag":"fconv",
      "vtp_useImageTag":false,
      "vtp_activityTag":"th-w-po",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9527148",
      "vtp_countingMethodIsTransactions":true,
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":161
    },{
      "function":"__flc",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u30","value",["macro",43]],["map","key","u31","value",["macro",11]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"th-w-ss",
      "vtp_ordinalType":"UNIQUE",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9527148",
      "vtp_ordinalUnique":"1",
      "vtp_number":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":163
    },{
      "function":"__fls",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u40","value",["macro",69]],["map","key","u41","value",["macro",70]],["map","key","u42","value",["macro",73]],["map","key","u43","value",["macro",74]],["map","key","u44","value",["macro",75]],["map","key","u45","value",["macro",72]]],
      "vtp_revenue":["macro",73],
      "vtp_enableConversionLinker":true,
      "vtp_countingMethod":"TRANSACTIONS",
      "vtp_orderId":["macro",70],
      "vtp_enableProductReporting":false,
      "vtp_groupTag":"sconv",
      "vtp_useImageTag":false,
      "vtp_activityTag":"th-w-rc",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9527148",
      "vtp_countingMethodIsTransactions":true,
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":164
    },{
      "function":"__flc",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u49","value",["macro",87]],["map","key","u50","value",["macro",88]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"th-w-sit",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9527148",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":165
    },{
      "function":"__flc",
      "metadata":["map"],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"th-w-pv",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9527148",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":166
    },{
      "function":"__fls",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_customVariable":["list",["map","key","u34","value",["macro",35]],["map","key","u35","value",["macro",36]],["map","key","u36","value",["macro",39]],["map","key","u37","value",["macro",40]],["map","key","u38","value",["macro",41]],["map","key","u39","value",["macro",38]]],
      "vtp_revenue":["macro",39],
      "vtp_enableConversionLinker":true,
      "vtp_countingMethod":"TRANSACTIONS",
      "vtp_orderId":["macro",36],
      "vtp_enableProductReporting":false,
      "vtp_groupTag":"sconv",
      "vtp_useImageTag":false,
      "vtp_activityTag":"th-w-ac",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9527148",
      "vtp_countingMethodIsTransactions":true,
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":167
    },{
      "function":"__flc",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u28","value",["macro",89]],["map","key","u29","value",["macro",47]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"th-w-pg",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9527148",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":168
    },{
      "function":"__flc",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_customVariable":["list",["map","key","u31","value",["macro",11]],["map","key","u32","value",["macro",80]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"th-w-ld",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9527148",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":169
    },{
      "function":"__flc",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u31","value",["macro",11]],["map","key","u33","value",["macro",78]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"vn-w-lm",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9526557",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":170
    },{
      "function":"__fls",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u46","value",["macro",46]],["map","key","u47","value",["macro",31]],["map","key","u48","value",["macro",44]]],
      "vtp_revenue":["macro",44],
      "vtp_enableConversionLinker":true,
      "vtp_countingMethod":"TRANSACTIONS",
      "vtp_orderId":["macro",46],
      "vtp_enableProductReporting":false,
      "vtp_groupTag":"fconv",
      "vtp_useImageTag":false,
      "vtp_activityTag":"vn-w-po",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9526557",
      "vtp_countingMethodIsTransactions":true,
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":171
    },{
      "function":"__flc",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u49","value",["macro",87]],["map","key","u50","value",["macro",88]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"vn-w-sit",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9526557",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":172
    },{
      "function":"__flc",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u30","value",["macro",43]],["map","key","u31","value",["macro",11]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"vn-w-ss",
      "vtp_ordinalType":"UNIQUE",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9526557",
      "vtp_ordinalUnique":"1",
      "vtp_number":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":173
    },{
      "function":"__flc",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u28","value",["macro",89]],["map","key","u29","value",["macro",47]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"vn-w-pg",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9526557",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":174
    },{
      "function":"__fls",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_customVariable":["list",["map","key","u34","value",["macro",35]],["map","key","u35","value",["macro",36]],["map","key","u36","value",["macro",39]],["map","key","u37","value",["macro",40]],["map","key","u38","value",["macro",41]],["map","key","u39","value",["macro",38]]],
      "vtp_revenue":["macro",39],
      "vtp_enableConversionLinker":true,
      "vtp_countingMethod":"TRANSACTIONS",
      "vtp_orderId":["macro",36],
      "vtp_enableProductReporting":false,
      "vtp_groupTag":"sconv",
      "vtp_useImageTag":false,
      "vtp_activityTag":"vn-w-ac",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9526557",
      "vtp_countingMethodIsTransactions":true,
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":175
    },{
      "function":"__flc",
      "metadata":["map"],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"vn-w-pv",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9526557",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":176
    },{
      "function":"__flc",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_customVariable":["list",["map","key","u31","value",["macro",11]],["map","key","u32","value",["macro",80]]],
      "vtp_enableConversionLinker":true,
      "vtp_groupTag":"eng",
      "vtp_useImageTag":false,
      "vtp_activityTag":"vn-w-ld",
      "vtp_ordinalType":"STANDARD",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9526557",
      "vtp_ordinalStandard":["macro",85],
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":177
    },{
      "function":"__fls",
      "metadata":["map"],
      "vtp_customVariable":["list",["map","key","u40","value",["macro",69]],["map","key","u41","value",["macro",70]],["map","key","u42","value",["macro",73]],["map","key","u43","value",["macro",74]],["map","key","u44","value",["macro",75]],["map","key","u45","value",["macro",72]]],
      "vtp_revenue":["macro",73],
      "vtp_enableConversionLinker":true,
      "vtp_countingMethod":"TRANSACTIONS",
      "vtp_orderId":["macro",70],
      "vtp_enableProductReporting":false,
      "vtp_groupTag":"sconv",
      "vtp_useImageTag":false,
      "vtp_activityTag":"vn-w-rc",
      "vtp_conversionCookiePrefix":"_gcl",
      "vtp_advertiserId":"9526557",
      "vtp_countingMethodIsTransactions":true,
      "vtp_url":["macro",86],
      "vtp_enableGoogleAttributionOptions":false,
      "vtp_showConversionLinkingControls":true,
      "tag_id":178
    },{
      "function":"__gaawc",
      "metadata":["map"],
      "setup_tags":["list",["tag",186,0]],
      "once_per_load":true,
      "vtp_fieldsToSet":["list",["map","name","allowLinker","value","true"],["map","name","useAmpClientId","value","true"],["map","name","userId","value",["macro",11]],["map","name","location","value",["macro",14]]],
      "vtp_sendPageView":true,
      "vtp_measurementId":"G-KK6LLGGZNQ",
      "vtp_enableUserProperties":true,
      "tag_id":179
    },{
      "function":"__gaawc",
      "metadata":["map"],
      "setup_tags":["list",["tag",186,0]],
      "unlimited":true,
      "vtp_fieldsToSet":["list",["map","name","allowLinker","value","true"],["map","name","useAmpClientId","value","true"],["map","name","userId","value",["macro",11]],["map","name","location","value",["macro",14]],["map","name","page","value",["macro",16]]],
      "vtp_sendPageView":true,
      "vtp_measurementId":"G-KK6LLGGZNQ",
      "vtp_enableUserProperties":true,
      "tag_id":180
    },{
      "function":"__ua",
      "metadata":["map"],
      "unlimited":true,
      "vtp_overrideGaSettings":true,
      "vtp_fieldsToSet":["list",["map","fieldName","title","value",["macro",47]]],
      "vtp_trackType":"TRACK_PAGEVIEW",
      "vtp_gaSettings":["macro",84],
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false,
      "vtp_enableFirebaseCampaignData":true,
      "tag_id":184
    },{
      "function":"__ua",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_nonInteraction":false,
      "vtp_overrideGaSettings":true,
      "vtp_useEcommerceDataLayer":true,
      "vtp_eventCategory":"tracking",
      "vtp_trackType":"TRACK_EVENT",
      "vtp_gaSettings":["macro",53],
      "vtp_eventAction":"purchase",
      "vtp_eventLabel":["macro",91],
      "vtp_enableEcommerce":true,
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false,
      "vtp_enableFirebaseCampaignData":true,
      "vtp_ecommerceIsEnabled":true,
      "vtp_trackTypeIsEvent":true,
      "tag_id":185
    },{
      "function":"__paused",
      "vtp_originalTagType":"cvt_7691473_357",
      "tag_id":186
    },{
      "function":"__paused",
      "vtp_originalTagType":"cvt_7691473_357",
      "tag_id":187
    },{
      "function":"__paused",
      "vtp_originalTagType":"cvt_7691473_357",
      "tag_id":188
    },{
      "function":"__paused",
      "vtp_originalTagType":"cvt_7691473_357",
      "tag_id":189
    },{
      "function":"__paused",
      "vtp_originalTagType":"cvt_7691473_357",
      "tag_id":190
    },{
      "function":"__paused",
      "vtp_originalTagType":"cvt_7691473_357",
      "tag_id":191
    },{
      "function":"__paused",
      "vtp_originalTagType":"cvt_7691473_357",
      "tag_id":192
    },{
      "function":"__paused",
      "vtp_originalTagType":"cvt_7691473_357",
      "tag_id":193
    },{
      "function":"__ua",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_nonInteraction":false,
      "vtp_overrideGaSettings":true,
      "vtp_useEcommerceDataLayer":true,
      "vtp_eventCategory":"tracking",
      "vtp_trackType":"TRACK_EVENT",
      "vtp_gaSettings":["macro",20],
      "vtp_eventAction":"purchase",
      "vtp_eventLabel":["macro",91],
      "vtp_enableEcommerce":true,
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false,
      "vtp_enableFirebaseCampaignData":true,
      "vtp_ecommerceIsEnabled":true,
      "vtp_trackTypeIsEvent":true,
      "tag_id":194
    },{
      "function":"__ua",
      "metadata":["map"],
      "unlimited":true,
      "vtp_overrideGaSettings":true,
      "vtp_fieldsToSet":["list",["map","fieldName","title","value",["macro",47]]],
      "vtp_trackType":"TRACK_PAGEVIEW",
      "vtp_gaSettings":["macro",93],
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false,
      "vtp_enableFirebaseCampaignData":true,
      "tag_id":195
    },{
      "function":"__ua",
      "metadata":["map"],
      "once_per_load":true,
      "vtp_overrideGaSettings":false,
      "vtp_trackType":"TRACK_PAGEVIEW",
      "vtp_gaSettings":["macro",93],
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false,
      "vtp_enableFirebaseCampaignData":true,
      "tag_id":196
    },{
      "function":"__ua",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_nonInteraction":false,
      "vtp_overrideGaSettings":false,
      "vtp_eventCategory":"myads-link-clicked",
      "vtp_trackType":"TRACK_EVENT",
      "vtp_gaSettings":["macro",93],
      "vtp_eventAction":["macro",48],
      "vtp_eventLabel":["macro",68],
      "vtp_enableRecaptchaOption":false,
      "vtp_enableTransportUrl":true,
      "vtp_enableUaRlsa":false,
      "vtp_enableUseInternalVersion":false,
      "vtp_enableFirebaseCampaignData":true,
      "vtp_trackTypeIsEvent":true,
      "tag_id":197
    },{
      "function":"__gaawc",
      "metadata":["map"],
      "setup_tags":["list",["tag",186,0]],
      "unlimited":true,
      "vtp_fieldsToSet":["list",["map","name","allowLinker","value","true"],["map","name","useAmpClientId","value","true"],["map","name","userId","value",["macro",11]],["map","name","location","value",["macro",14]],["map","name","page","value",["macro",16]]],
      "vtp_sendPageView":true,
      "vtp_measurementId":"G-SW6D8G0HXK",
      "vtp_enableUserProperties":true,
      "tag_id":392
    },{
      "function":"__gaawc",
      "metadata":["map"],
      "setup_tags":["list",["tag",186,0]],
      "once_per_load":true,
      "vtp_fieldsToSet":["list",["map","name","allowLinker","value","true"],["map","name","useAmpClientId","value","true"],["map","name","userId","value",["macro",11]],["map","name","location","value",["macro",14]]],
      "vtp_sendPageView":true,
      "vtp_measurementId":"G-SW6D8G0HXK",
      "vtp_enableUserProperties":true,
      "tag_id":393
    },{
      "function":"__hl",
      "tag_id":397
    },{
      "function":"__tl",
      "vtp_eventName":"pageState",
      "vtp_interval":"3000",
      "vtp_uniqueTriggerId":"7691473_172",
      "tag_id":398
    },{
      "function":"__ytl",
      "vtp_progressThresholdsPercent":"10, 25, 50, 75, 90",
      "vtp_captureComplete":true,
      "vtp_captureStart":true,
      "vtp_fixMissingApi":true,
      "vtp_radioButtonGroup1":"PERCENTAGE",
      "vtp_capturePause":true,
      "vtp_captureProgress":true,
      "vtp_uniqueTriggerId":"7691473_229",
      "vtp_enableTriggerStartOption":true,
      "tag_id":399
    },{
      "function":"__lcl",
      "vtp_waitForTags":false,
      "vtp_checkValidation":false,
      "vtp_waitForTagsTimeout":"2000",
      "vtp_uniqueTriggerId":"7691473_263",
      "tag_id":400
    },{
      "function":"__lcl",
      "vtp_waitForTags":false,
      "vtp_checkValidation":false,
      "vtp_waitForTagsTimeout":"2000",
      "vtp_uniqueTriggerId":"7691473_264",
      "tag_id":401
    },{
      "function":"__hl",
      "tag_id":402
    },{
      "function":"__hl",
      "tag_id":403
    },{
      "function":"__tl",
      "vtp_eventName":"gtm.timer",
      "vtp_interval":"5000",
      "vtp_uniqueTriggerId":"7691473_360",
      "tag_id":404
    },{
      "function":"__hl",
      "tag_id":405
    },{
      "function":"__hl",
      "tag_id":406
    },{
      "function":"__hl",
      "tag_id":407
    },{
      "function":"__cl",
      "tag_id":408
    },{
      "function":"__hl",
      "tag_id":409
    },{
      "function":"__hl",
      "tag_id":410
    },{
      "function":"__hl",
      "tag_id":411
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_html":["template","\u003Cscript type=\"text\/gtmscript\"\u003Evar pid=\"mobile\"===",["escape",["macro",95],8,16],"?\"item_m\":\"item\",data=",["escape",["macro",97],8,16],";(window._bwtm=window._bwtm||[]).push({ch:",["escape",["macro",98],8,16],",iid:",["escape",["macro",30],8,16],",uid:",["escape",["macro",10],8,16],",pid:pid,mid:422});\u003C\/script\u003E"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":1
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_html":"\u003Cscript async data-gtmsrc=\"\/\/rec.scupio.com\/recweb\/js\/rec.js\" type=\"text\/gtmscript\"\u003E\u003C\/script\u003E",
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":7
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_html":["template","\u003Cscript type=\"text\/gtmscript\"\u003Evar pid=\"mobile\"===",["escape",["macro",95],8,16],"?\"home_m\":\"home\";(window._bwtm=window._bwtm||[]).push({mid:422,pid:pid,uid:",["escape",["macro",10],8,16],"});\u003C\/script\u003E"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":9
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_html":["template","\u003Cscript type=\"text\/gtmscript\"\u003E\"cat2\"===",["escape",["macro",100],8,16],"?(pid=\"mobile\"===",["escape",["macro",95],8,16],"?\"cat2_m\":\"cat2\",ch=",["escape",["macro",99],8,16],"):(pid=\"mobile\"===",["escape",["macro",95],8,16],"?\"cat1_m\":\"cat1\",ch=",["escape",["macro",101],8,16],");(window._bwtm=window._bwtm||[]).push({mid:422,pid:pid,ch:ch,uid:",["escape",["macro",10],8,16],"});\u003C\/script\u003E"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":10
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_html":["template","\u003Cscript type=\"text\/gtmscript\"\u003Evar pid=\"mobile\"===",["escape",["macro",95],8,16],"?\"cart_m\":\"cart\";(window._bwtm=window._bwtm||[]).push({mid:422,pid:pid,carts:[{itemid:",["escape",["macro",36],8,16],",price:",["escape",["macro",102],8,16],",count:",["escape",["macro",38],8,16],"}],uid:",["escape",["macro",10],8,16],"});\u003C\/script\u003E\n\u003Cscript async data-gtmsrc=\"\/\/rec.scupio.com\/recweb\/js\/rec.js\" type=\"text\/gtmscript\"\u003E\u003C\/script\u003E"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":11
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_html":["template","\u003Cscript type=\"text\/gtmscript\"\u003Efor(var pid=\"mobile\"===",["escape",["macro",95],8,16],"?\"buy_m\":\"buy\",orders=",["escape",["macro",32],8,16],",orderItems=[],i=0;i\u003Corders.length;i++)for(var j=0;j\u003Corders[i].items.length;j++)orderItems.push({itemid:orders[i].items[j].itemid,price:orders[i].items[j].price\/1E5,count:orders[i].items[j].quantity});(window._bwtm=window._bwtm||[]).push({mid:422,pid:pid,bitem:orderItems,uid:",["escape",["macro",10],8,16],",order:",["escape",["macro",31],8,16],"});\u003C\/script\u003E\n\u003Cscript async data-gtmsrc=\"\/\/rec.scupio.com\/recweb\/js\/rec.js\" type=\"text\/gtmscript\"\u003E\u003C\/script\u003E"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":12
    },{
      "function":"__html",
      "once_per_event":true,
      "vtp_html":["template","\u003Cscript type=\"text\/gtmscript\"\u003Efor(var orderItems=",["escape",["macro",32],8,16],",totalPrice=0,i=0;i\u003CorderItems.length;i++)ga(\"gtm.ec:addProduct\",{id:orderItems[i].itemid,quantity:orderItems[i].quantity}),totalPrice+=orderItems[i].price\/1E5;ga(\"gtm.ec:setAction\",\"purchase\",{id:",["escape",["macro",31],8,16],"+\"\",revenue:totalPrice});ga(\"gtm.send\",\"event\",\"tracking\",\"purchase\");\u003C\/script\u003E"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":13
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_html":["template","\u003Cscript type=\"text\/gtmscript\"\u003Evar pid=\"ios\"===",["escape",["macro",95],8,16],"||\"android\"===",["escape",["macro",95],8,16],"?\"search_m\":\"search\";(window._bwtm=window._bwtm||[]).push({mid:422,pid:pid,kw:",["escape",["macro",87],8,16],",uid:",["escape",["macro",10],8,16],"});\u003C\/script\u003E\n"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":14
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_html":["template","\u003Cscript language=\"javascript\" type=\"text\/gtmscript\"\u003Efor(var cookieName=\"icm-ssid\",iaTransactionId=getCookie(cookieName),iaOfferID=",["escape",["macro",103],8,16],",iaCheckoutId=",["escape",["macro",31],8,16],",orders=",["escape",["macro",32],8,16],",orderItems=[],i=0;i\u003Corders.length;i++)for(var j=0;j\u003Corders[i].items.length;j++)orderItems.push(orders[i].items[j]);var iaItemId,iaItemPrice,iaQuantity,iaModelId,iaShopId,iaSubTotal=0;\nfor(i=0;i\u003CorderItems.length;i++){iaItemId=orderItems[i].itemid;iaItemPrice=orderItems[i].price\/1E5;iaQuantity=orderItems[i].quantity;iaModelId=orderItems[i].modelid;iaShopId=orderItems[i].shopid;iaSubTotal=iaItemPrice*iaQuantity;var iaConvesionPixelUrl=\"https:\/\/invol.co\/aff_l?offer_id\\x3d\"+iaOfferID+\"\\x26adv_sub\\x3d\"+iaCheckoutId+\"\\x26adv_sub2\\x3d\"+iaItemId+\"\\x26adv_sub3\\x3d\"+iaModelId+\"\\x26adv_sub4\\x3d\"+iaShopId+\"\\x26amount\\x3d\"+iaSubTotal;\"\"!==iaTransactionId\u0026\u0026(iaConvesionPixelUrl+=\"\\x26transaction_id\\x3d\"+\niaTransactionId);var iaImgPixel=new Image(1,1);iaImgPixel.src=iaConvesionPixelUrl}function getCookie(b){b+=\"\\x3d\";for(var d=document.cookie.split(\";\"),c=0;c\u003Cd.length;c++){for(var a=d[c];\" \"==a.charAt(0);)a=a.substring(1);if(0==a.indexOf(b))return a.substring(b.length,a.length)}return\"\"};\u003C\/script\u003E"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":34
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_html":"\u003Cscript type=\"text\/gtmscript\"\u003E\u003C\/script\u003E\n\u003Cscript type=\"text\/gtmscript\" data-gtmsrc=\"https:\/\/static.masoffer.net\/php\/tracking_js.php?type=general\" async\u003E\u003C\/script\u003E\n\t",
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":36
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_html":["template","\n\u003Cscript type=\"text\/gtmscript\"\u003E!function(b,e,f,g,a,c,d){b.fbq||(a=b.fbq=function(){a.callMethod?a.callMethod.apply(a,arguments):a.queue.push(arguments)},b._fbq||(b._fbq=a),a.push=a,a.loaded=!0,a.version=\"2.0\",a.queue=[],c=e.createElement(f),c.async=!0,c.src=g,d=e.getElementsByTagName(f)[0],d.parentNode.insertBefore(c,d))}(window,document,\"script\",\"\/\/connect.facebook.net\/en_US\/fbevents.js\");fbq(\"init\",",["escape",["macro",104],8,16],");fbq(\"track\",\"PageView\");\u003C\/script\u003E\n\u003Cnoscript\u003E\u003Cimg height=\"1\" width=\"1\" style=\"display:none\" src=\"https:\/\/www.facebook.com\/tr?id=",["escape",["macro",104],12],"\u0026amp;ev=PageView\u0026amp;noscript=1\"\u003E\u003C\/noscript\u003E\n"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":39
    },{
      "function":"__html",
      "setup_tags":["list",["tag",157,1]],
      "once_per_event":true,
      "vtp_html":["template","\u003Cscript type=\"text\/gtmscript\"\u003Efbq(\"track\",\"Search\",{search_string:\"",["escape",["macro",87],7],"\",content_ids:\"",["escape",["macro",88],7],"\",content_type:\"product\",content_category:\"Internal Site Search\"});\u003C\/script\u003E"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":40
    },{
      "function":"__html",
      "setup_tags":["list",["tag",157,1]],
      "once_per_event":true,
      "vtp_html":["template","\u003Cscript type=\"text\/gtmscript\"\u003Efbq(\"track\",\"ViewContent\",{value:",["escape",["macro",106],8,16],",currency:\"",["escape",["macro",34],7],"\",content_ids:\"",["escape",["macro",30],7],"\",content_type:\"product\"});\u003C\/script\u003E"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":41
    },{
      "function":"__html",
      "setup_tags":["list",["tag",157,1]],
      "once_per_event":true,
      "vtp_html":["template","\u003Cscript type=\"text\/gtmscript\"\u003Efbq(\"track\",\"AddToCart\",{value:",["escape",["macro",39],8,16],",currency:\"",["escape",["macro",34],7],"\",content_ids:\"",["escape",["macro",36],7],"\",content_type:\"product\",contents:[{id:\"",["escape",["macro",36],7],"\",quantity:",["escape",["macro",38],8,16],",item_price:",["escape",["macro",102],8,16],"}]});\u003C\/script\u003E\n"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":42
    },{
      "function":"__html",
      "metadata":["map"],
      "setup_tags":["list",["tag",157,1]],
      "once_per_event":true,
      "vtp_html":["template","\u003Cscript type=\"text\/gtmscript\"\u003Efbq(\"track\",\"Purchase\",{value:1*",["escape",["macro",44],8,16],",currency:\"",["escape",["macro",34],7],"\",content_ids:\"",["escape",["macro",107],7],"\",content_type:\"product\",contents:",["escape",["macro",108],8,16],"});\u003C\/script\u003E"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":43
    },{
      "function":"__html",
      "setup_tags":["list",["tag",157,1]],
      "once_per_event":true,
      "vtp_html":["template","\u003Cscript type=\"text\/gtmscript\"\u003Efbq(\"trackCustom\",\"ViewCategory\",{content_name:\"",["escape",["macro",109],7],"\",content_category:\"",["escape",["macro",101],7],"\",content_ids:\"",["escape",["macro",29],7],"\",content_type:\"product\"});\u003C\/script\u003E"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":44
    },{
      "function":"__html",
      "setup_tags":["list",["tag",157,1]],
      "once_per_event":true,
      "vtp_html":"\u003Cscript type=\"text\/gtmscript\"\u003Efbq(\"track\",\"CompleteRegistration\");\u003C\/script\u003E\n",
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":58
    },{
      "function":"__html",
      "setup_tags":["list",["tag",157,1]],
      "once_per_event":true,
      "vtp_html":"\u003Cscript type=\"text\/gtmscript\"\u003Efbq(\"track\",\"AddPaymentInfo\");\u003C\/script\u003E\n",
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":59
    },{
      "function":"__html",
      "setup_tags":["list",["tag",157,1]],
      "once_per_event":true,
      "vtp_html":"\u003Cscript type=\"text\/gtmscript\"\u003Efbq(\"track\",\"InitiateCheckout\");\u003C\/script\u003E\n",
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":60
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_html":["template","\u003Cscript type=\"text\/gtmscript\"\u003E(window._bwtm=window._bwtm||[]).push({mid:422,uid:",["escape",["macro",10],8,16],"});\u003C\/script\u003E\n"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":70
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_html":["template","\u003Cscript type=\"text\/gtmscript\"\u003Etry{var AT={cookie_duration:30,aff_utm_source:\"accesstrade\",aff_source_param:\"utm_source\",aff_utm_sources:[\"accesstrade\"],aff_source_params:[\"utm_source\",\"aff_source\"],aff_sid_param:\"aff_sid\",aff_sid_params:[\"aff_sid\",\"aff_sub\"],check_scope:function(){var a=this.get_utm_source()||this.get_param(this.aff_source_param);return a==this.aff_utm_source?!0:!1},track:function(){var a=this.get_param(this.aff_sid_param),b=this.get_param(this.aff_source_param);b==this.aff_utm_source?(this.set_cookie(\"_aff_network\",\nthis.aff_utm_source,this.cookie_duration),a\u0026\u0026this.set_cookie(\"_aff_sid\",a,this.cookie_duration)):void 0!==b\u0026\u0026null!==b\u0026\u0026\"\"!==b.trim()\u0026\u0026this.set_cookie(\"_aff_network\",b,0)},tracks:function(){var a=0,b=\"\",c=\"\";for(d in this.aff_source_params){b=this.aff_source_params[d];var e=this.get_param(b);b=e;if(-1!=this.aff_utm_sources.indexOf(e)){a=1;break}}for(var g in this.aff_sid_params){var d=this.aff_sid_params[g];d=this.get_param(d);if(\"\"!==d){c=d;break}}a\u0026\u0026\"\"!==b?(this.set_cookie(\"_aff_network\",b,this.cookie_duration),\nc\u0026\u0026this.set_cookie(\"_aff_sid\",c,this.cookie_duration)):(!a||void 0!==b\u0026\u0026null!==b\u0026\u0026\"\"!==b.trim())\u0026\u0026this.set_cookie(\"_aff_network\",\"\",0)},track_shopee_order:function(){var a=",["escape",["macro",32],8,16],",b=",["escape",["macro",31],8,16],",c=\"\",e=AT.get_utm_source(),g=AT.get_session_id();if(void 0!==a\u0026\u00260\u003Ca.length\u0026\u0026(\"shopid\"in a[0]||\"catid\"in a[0]))for(var d=0;d\u003Ca.length;d++){var k=a[d].itemid,l=a[d].quantity,m=a[d].price\/1E5,h=a[d].shopid,n=a[d].catid,p=a[d].modelid;c+=\"\\x26product[]\\x3d$id:\"+k+\"$quantity:\"+l+\"$price:\"+\nm+\"$category_id:\"+n+\"$e__shop_id:\"+h+\"$e__model_id:\"+p}else{var q=Object.keys(shoporders);for(d=0;d\u003Cq.length;d++){h=q[d];a=shoporders[h].items;for(var f=0;f\u003Ca.length;f++)k=a[f].itemid,l=a[f].quantity,m=a[f].price\/1E5,n=a[f].catid,p=a[f].modelid,c+=\"\\x26product[]\\x3d$id:\"+k+\"$quantity:\"+l+\"$price:\"+m+\"$category_id:\"+n+\"$e__shop_id:\"+h+\"$e__model_id:\"+p}}navigator.sendBeacon?(b=\"https:\/\/track.accesstrade.vn\/track\/collector?transaction_id\\x3d\"+b+\"\\x26tracking_id\\x3d\"+g+\"\\x26aff_source\\x3d\"+e+\"\\x26campaign_id\\x3d329\\x26result_id\\x3d30\"+\nc,navigator.sendBeacon(b)):(a=document.createElement(\"img\"),a.width=1,a.height=1,a.border=0,a.src=\"https:\/\/track.accesstrade.vn\/track\/collector?transaction_id\\x3d\"+b+\"\\x26tracking_id\\x3d\"+g+\"\\x26aff_source\\x3d\"+e+\"\\x26campaign_id\\x3d329\\x26result_id\\x3d30\"+c,document.body.appendChild(a));AT.set_cookie(\"_aff_network\",e,0)},get_param:function(a,b){b||(b=location.href);a=a.replace(\/[\\[]\/,\"\\\\[\").replace(\/[\\]]\/,\"\\\\]\");var c=\"[\\\\?\\x26]\"+a+\"\\x3d([^\\x26#]*)\";c=new RegExp(c);c=c.exec(b);return null==c?null:\nc[1]},set_cookie:function(a,b,c){var e=new Date;e.setTime(e.getTime()+864E5*c);c=\"expires\\x3d\"+e.toUTCString();cookie_domain=this.cookie_domain||window.location.hostname;document.cookie=a+\"\\x3d\"+b+\"; \"+c+\";domain\\x3d\"+cookie_domain+\"; path\\x3d\/\"},get_cookie:function(a){a+=\"\\x3d\";for(var b=document.cookie.split(\";\"),c=0;c\u003Cb.length;c++){for(var e=b[c];\" \"==e.charAt(0);)e=e.substring(1);if(0==e.indexOf(a))return e.substring(a.length,e.length)}},get_session_id:function(){return this.get_cookie(\"_aff_sid\")||\n\"\"},get_utm_source:function(){return this.get_cookie(\"_aff_network\")||\"\"}};AT.tracks()}catch(a){console.warn(a)};\u003C\/script\u003E\n"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":73
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_html":["template","\u003Cscript type=\"text\/gtmscript\"\u003Etry{var AT={cookie_duration:30,aff_utm_source:\"accesstrade\",aff_source_param:\"utm_source\",aff_utm_sources:[\"accesstrade\"],aff_source_params:[\"utm_source\",\"aff_source\"],aff_sid_param:\"aff_sid\",aff_sid_params:[\"aff_sid\",\"aff_sub\"],check_scope:function(){var a=this.get_utm_source()||this.get_param(this.aff_source_param);return a==this.aff_utm_source?!0:!1},track:function(){var a=this.get_param(this.aff_sid_param),b=this.get_param(this.aff_source_param);b==this.aff_utm_source?(this.set_cookie(\"_aff_network\",\nthis.aff_utm_source,this.cookie_duration),a\u0026\u0026this.set_cookie(\"_aff_sid\",a,this.cookie_duration)):void 0!==b\u0026\u0026null!==b\u0026\u0026\"\"!==b.trim()\u0026\u0026this.set_cookie(\"_aff_network\",b,0)},tracks:function(){var a=0,b=\"\",c=\"\";for(d in this.aff_source_params){b=this.aff_source_params[d];var e=this.get_param(b);b=e;if(-1!=this.aff_utm_sources.indexOf(e)){a=1;break}}for(var g in this.aff_sid_params){var d=this.aff_sid_params[g];d=this.get_param(d);if(\"\"!==d){c=d;break}}a\u0026\u0026\"\"!==b?(this.set_cookie(\"_aff_network\",b,this.cookie_duration),\nc\u0026\u0026this.set_cookie(\"_aff_sid\",c,this.cookie_duration)):(!a||void 0!==b\u0026\u0026null!==b\u0026\u0026\"\"!==b.trim())\u0026\u0026this.set_cookie(\"_aff_network\",\"\",0)},track_shopee_order:function(){var a=",["escape",["macro",32],8,16],",b=",["escape",["macro",31],8,16],",c=\"\",e=AT.get_utm_source(),g=AT.get_session_id();if(void 0!==a\u0026\u00260\u003Ca.length\u0026\u0026(\"shopid\"in a[0]||\"catid\"in a[0]))for(var d=0;d\u003Ca.length;d++){var k=a[d].itemid,l=a[d].quantity,m=a[d].price\/1E5,h=a[d].shopid,n=a[d].catid,p=a[d].modelid;c+=\"\\x26product[]\\x3d$id:\"+k+\"$quantity:\"+l+\"$price:\"+\nm+\"$category_id:\"+n+\"$e__shop_id:\"+h+\"$e__model_id:\"+p}else{var q=Object.keys(shoporders);for(d=0;d\u003Cq.length;d++){h=q[d];a=shoporders[h].items;for(var f=0;f\u003Ca.length;f++)k=a[f].itemid,l=a[f].quantity,m=a[f].price\/1E5,n=a[f].catid,p=a[f].modelid,c+=\"\\x26product[]\\x3d$id:\"+k+\"$quantity:\"+l+\"$price:\"+m+\"$category_id:\"+n+\"$e__shop_id:\"+h+\"$e__model_id:\"+p}}navigator.sendBeacon?(b=\"https:\/\/track.accesstrade.vn\/track\/collector?transaction_id\\x3d\"+b+\"\\x26tracking_id\\x3d\"+g+\"\\x26aff_source\\x3d\"+e+\"\\x26campaign_id\\x3d329\\x26result_id\\x3d30\"+\nc,navigator.sendBeacon(b),console.log(\"[AT] Postback tracking url: \"+b)):(a=document.createElement(\"img\"),a.width=1,a.height=1,a.border=0,a.src=\"https:\/\/track.accesstrade.vn\/track\/collector?transaction_id\\x3d\"+b+\"\\x26tracking_id\\x3d\"+g+\"\\x26aff_source\\x3d\"+e+\"\\x26campaign_id\\x3d329\\x26result_id\\x3d30\"+c,document.body.appendChild(a),console.log(\"[AT] Pixel tracking url: \"+a.src));AT.set_cookie(\"_aff_network\",e,0)},get_param:function(a,b){b||(b=location.href);a=a.replace(\/[\\[]\/,\"\\\\[\").replace(\/[\\]]\/,\n\"\\\\]\");var c=\"[\\\\?\\x26]\"+a+\"\\x3d([^\\x26#]*)\";c=new RegExp(c);c=c.exec(b);return null==c?null:c[1]},set_cookie:function(a,b,c){var e=new Date;e.setTime(e.getTime()+864E5*c);c=\"expires\\x3d\"+e.toUTCString();cookie_domain=this.cookie_domain||window.location.hostname;document.cookie=a+\"\\x3d\"+b+\"; \"+c+\";domain\\x3d\"+cookie_domain+\"; path\\x3d\/\"},get_cookie:function(a){a+=\"\\x3d\";for(var b=document.cookie.split(\";\"),c=0;c\u003Cb.length;c++){for(var e=b[c];\" \"==e.charAt(0);)e=e.substring(1);if(0==e.indexOf(a))return e.substring(a.length,\ne.length)}},get_session_id:function(){return this.get_cookie(\"_aff_sid\")||\"\"},get_utm_source:function(){return this.get_cookie(\"_aff_network\")||\"\"}};AT.tracks();AT.track_shopee_order()}catch(a){console.warn(a)};\u003C\/script\u003E\n"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":74
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_html":["template","\u003Cscript type=\"text\/gtmscript\"\u003Efunction track_keyToGet(){try{var a=get_key(p.keyToGet);null!==a?setCookie(p.cookieName,a):track_keyToSearch()}catch(b){console.warn(\"[medium_cookie_create][track_keyToGet]\",b)}}function track_keyToSearch(){try{var a=Object.entries(p.keyToSearch),b=!0;for(i=0;i\u003Ca.length;i++){var c=a[i],d=get_key(c[0]);if(null!==d){setCookie(p.cookieName,c[1]);b=!1;break}}b\u0026\u0026get_refer()}catch(e){console.warn(\"[medium_cookie_create][track_keyToSearch]\",e)}}\nfunction get_refer(){try{refer\u0026\u0026!shopee_refer_check.test(refer)\u0026\u0026setCookie(p.cookieName,\"refer\")}catch(a){console.warn(\"[medium_cookie_create][get_refer]\",a)}}function get_key(a){try{var b=window.location.href;a=\"[\\\\?\\x26]\"+a+\"\\x3d([^\\x26#]*)\";a=new RegExp(a);a=a.exec(b);return null==a?null:a[1]}catch(c){return console.warn(\"[medium_cookie_create][get_key]\",c),null}}\nfunction setCookie(a,b){try{var c=new Date;c.setTime(c.getTime()+864E5*p.cookieTime);var d=\";expires\\x3d\"+c.toUTCString();document.cookie=a+\"\\x3d\"+b+d+\";path\\x3d\"+p.path+\";domain\\x3d\"+p.domain}catch(e){return console.warn(\"[medium_cookie_create][setCookie]\",e),null}}try{var p=",["escape",["macro",110],8,16],",refer=",["escape",["macro",111],8,16],",shopee_refer_check=new RegExp(p.shopee_refer,\"i\");track_keyToGet()}catch(a){console.warn(\"[medium_cookie_create]\",a)};\u003C\/script\u003E\n"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":78
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_html":"\u003Cscript type=\"text\/gtmscript\"\u003Etry{var timestamp=(new Date).getTime();(function(a){var b=a.createElement(\"script\");b.src=\"https:\/\/click.accesstra.de\/js\/nct\/lp.js?cb\\x3d\"+timestamp;b.async=!0;a=a.getElementsByTagName(\"script\")[0];a.parentNode.insertBefore(b,a)})(document)}catch(a){console.warn(a)};\u003C\/script\u003E",
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":101
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_html":["template","\u003Cscript type=\"text\/gtmscript\"\u003Evar orders=",["escape",["macro",32],8,16],",itemInfo=[],orderInfo=[];(orders||[]).forEach(function(b){(Object.values(b.items)||[]).forEach(function(a){var b=a.itemid,c=a.price\/1E5,d=a.quantity;a=a.categories[0].catids[0];itemInfo.push({id:b,category_id:a,price:c,quantity:d})})});var __atw=__atw||[];__atw.push({mcn:\"d64a340bcb633f536d56e51874281454\",param:{result_id:\"30\",identifier:\"",["escape",["macro",31],7],"\",products:itemInfo}});var timestamp=(new Date).getTime();\n(function(b){var a=b.createElement(\"script\");a.src=\"https:\/\/cv.accesstra.de\/js\/nct\/cv_global.js?cb\\x3d\"+timestamp;a.async=!0;b=b.getElementsByTagName(\"script\")[0];b.parentNode.insertBefore(a,b)})(document);\u003C\/script\u003E\n"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":102
    },{
      "function":"__html",
      "once_per_event":true,
      "vtp_html":"\u003Cscript type=\"text\/gtmscript\"\u003E!function(){function k(a,b){b?(l[0]=l[16]=l[1]=l[2]=l[3]=l[4]=l[5]=l[6]=l[7]=l[8]=l[9]=l[10]=l[11]=l[12]=l[13]=l[14]=l[15]=0,this.blocks=l):this.blocks=[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0];a?(this.h0=3238371032,this.h1=914150663,this.h2=812702999,this.h3=4144912697,this.h4=4290775857,this.h5=1750603025,this.h6=1694076839,this.h7=3204075428):(this.h0=1779033703,this.h1=3144134277,this.h2=1013904242,this.h3=2773480762,this.h4=1359893119,this.h5=2600822924,this.h6=528734635,this.h7=1541459225);this.block=\nthis.start=this.bytes=this.hBytes=0;this.finalized=this.hashed=!1;this.first=!0;this.is224=a}function x(a,b,c){var f=typeof a;if(\"string\"===f){var e,m=[],d=a.length,g=0;for(f=0;f\u003Cd;++f)128\u003E(e=a.charCodeAt(f))?m[g++]=e:2048\u003Ee?(m[g++]=192|e\u003E\u003E6,m[g++]=128|63\u0026e):55296\u003Ee||57344\u003C=e?(m[g++]=224|e\u003E\u003E12,m[g++]=128|e\u003E\u003E6\u002663,m[g++]=128|63\u0026e):(e=65536+((1023\u0026e)\u003C\u003C10|1023\u0026a.charCodeAt(++f)),m[g++]=240|e\u003E\u003E18,m[g++]=128|e\u003E\u003E12\u002663,m[g++]=128|e\u003E\u003E6\u002663,m[g++]=128|63\u0026e);a=m}else{if(\"object\"!==f)throw Error(u);if(null===\na)throw Error(u);if(w\u0026\u0026a.constructor===ArrayBuffer)a=new Uint8Array(a);else if(!(Array.isArray(a)||w\u0026\u0026ArrayBuffer.isView(a)))throw Error(u);}64\u003Ca.length\u0026\u0026(a=(new k(b,!0)).update(a).array());e=[];m=[];for(f=0;64\u003Ef;++f)d=a[f]||0,e[f]=92^d,m[f]=54^d;k.call(this,b,c);this.update(m);this.oKeyPad=e;this.inner=!0;this.sharedMemory=c}var u=\"input is invalid type\",v=\"object\"==typeof window,p=v?window:{};p.JS_SHA256_NO_WINDOW\u0026\u0026(v=!1);v=!v\u0026\u0026\"object\"==typeof self;var A=!p.JS_SHA256_NO_NODE_JS\u0026\u0026\"object\"==typeof process\u0026\u0026\nprocess.versions\u0026\u0026process.versions.node;A?p=global:v\u0026\u0026(p=self);v=!p.JS_SHA256_NO_COMMON_JS\u0026\u0026\"object\"==typeof module\u0026\u0026module.exports;var F=\"function\"==typeof define\u0026\u0026define.amd,w=!p.JS_SHA256_NO_ARRAY_BUFFER\u0026\u0026\"undefined\"!=typeof ArrayBuffer,c=\"0123456789abcdef\".split(\"\"),G=[-2147483648,8388608,32768,128],n=[24,16,8,0],y=[1116352408,1899447441,3049323471,3921009573,961987163,1508970993,2453635748,2870763221,3624381080,310598401,607225278,1426881987,1925078388,2162078206,2614888103,3248222580,3835390401,\n4022224774,264347078,604807628,770255983,1249150122,1555081692,1996064986,2554220882,2821834349,2952996808,3210313671,3336571891,3584528711,113926993,338241895,666307205,773529912,1294757372,1396182291,1695183700,1986661051,2177026350,2456956037,2730485921,2820302411,3259730800,3345764771,3516065817,3600352804,4094571909,275423344,430227734,506948616,659060556,883997877,958139571,1322822218,1537002063,1747873779,1955562222,2024104815,2227730452,2361852424,2428436474,2756734187,3204031479,3329325298],\nz=[\"hex\",\"array\",\"digest\",\"arrayBuffer\"],l=[];!p.JS_SHA256_NO_NODE_JS\u0026\u0026Array.isArray||(Array.isArray=function(a){return\"[object Array]\"===Object.prototype.toString.call(a)});!w||!p.JS_SHA256_NO_ARRAY_BUFFER_IS_VIEW\u0026\u0026ArrayBuffer.isView||(ArrayBuffer.isView=function(a){return\"object\"==typeof a\u0026\u0026a.buffer\u0026\u0026a.buffer.constructor===ArrayBuffer});var B=function(a,b){return function(m){return(new k(b,!0)).update(m)[a]()}},C=function(a){var b=B(\"hex\",a);A\u0026\u0026(b=H(b,a));b.create=function(){return new k(a)};b.update=\nfunction(a){return b.create().update(a)};for(var m=0;m\u003Cz.length;++m){var c=z[m];b[c]=B(c,a)}return b},H=function(a,b){var c=eval(\"require('crypto')\"),f=eval(\"require('buffer').Buffer\"),e=b?\"sha224\":\"sha256\",h=function(b){if(\"string\"==typeof b)return c.createHash(e).update(b,\"utf8\").digest(\"hex\");if(null===b||void 0===b)throw Error(u);return b.constructor===ArrayBuffer\u0026\u0026(b=new Uint8Array(b)),Array.isArray(b)||ArrayBuffer.isView(b)||b.constructor===f?c.createHash(e).update(new f(b)).digest(\"hex\"):a(b)};\nreturn h},D=function(a,b){return function(c,f){return(new x(c,b,!0)).update(f)[a]()}},E=function(a){var b=D(\"hex\",a);b.create=function(b){return new x(b,a)};b.update=function(a,c){return b.create(a).update(c)};for(var c=0;c\u003Cz.length;++c){var f=z[c];b[f]=D(f,a)}return b};k.prototype.update=function(a){if(!this.finalized){var b=typeof a;if(\"string\"!==b){if(\"object\"!==b)throw Error(u);if(null===a)throw Error(u);if(w\u0026\u0026a.constructor===ArrayBuffer)a=new Uint8Array(a);else if(!(Array.isArray(a)||w\u0026\u0026ArrayBuffer.isView(a)))throw Error(u);\nvar c=!0}for(var f,e=0,h=a.length,d=this.blocks;e\u003Ch;){if(this.hashed\u0026\u0026(this.hashed=!1,d[0]=this.block,d[16]=d[1]=d[2]=d[3]=d[4]=d[5]=d[6]=d[7]=d[8]=d[9]=d[10]=d[11]=d[12]=d[13]=d[14]=d[15]=0),c)for(b=this.start;e\u003Ch\u0026\u002664\u003Eb;++e)d[b\u003E\u003E2]|=a[e]\u003C\u003Cn[3\u0026b++];else for(b=this.start;e\u003Ch\u0026\u002664\u003Eb;++e)128\u003E(f=a.charCodeAt(e))?d[b\u003E\u003E2]|=f\u003C\u003Cn[3\u0026b++]:2048\u003Ef?(d[b\u003E\u003E2]|=(192|f\u003E\u003E6)\u003C\u003Cn[3\u0026b++],d[b\u003E\u003E2]|=(128|63\u0026f)\u003C\u003Cn[3\u0026b++]):55296\u003Ef||57344\u003C=f?(d[b\u003E\u003E2]|=(224|f\u003E\u003E12)\u003C\u003Cn[3\u0026b++],d[b\u003E\u003E2]|=(128|f\u003E\u003E6\u002663)\u003C\u003Cn[3\u0026b++],d[b\u003E\u003E2]|=(128|63\u0026f)\u003C\u003C\nn[3\u0026b++]):(f=65536+((1023\u0026f)\u003C\u003C10|1023\u0026a.charCodeAt(++e)),d[b\u003E\u003E2]|=(240|f\u003E\u003E18)\u003C\u003Cn[3\u0026b++],d[b\u003E\u003E2]|=(128|f\u003E\u003E12\u002663)\u003C\u003Cn[3\u0026b++],d[b\u003E\u003E2]|=(128|f\u003E\u003E6\u002663)\u003C\u003Cn[3\u0026b++],d[b\u003E\u003E2]|=(128|63\u0026f)\u003C\u003Cn[3\u0026b++]);this.lastByteIndex=b;this.bytes+=b-this.start;64\u003C=b?(this.block=d[16],this.start=b-64,this.hash(),this.hashed=!0):this.start=b}return 4294967295\u003Cthis.bytes\u0026\u0026(this.hBytes+=this.bytes\/4294967296\u003C\u003C0,this.bytes%=4294967296),this}};k.prototype.finalize=function(){if(!this.finalized){this.finalized=!0;var a=this.blocks,\nb=this.lastByteIndex;a[16]=this.block;a[b\u003E\u003E2]|=G[3\u0026b];this.block=a[16];56\u003C=b\u0026\u0026(this.hashed||this.hash(),a[0]=this.block,a[16]=a[1]=a[2]=a[3]=a[4]=a[5]=a[6]=a[7]=a[8]=a[9]=a[10]=a[11]=a[12]=a[13]=a[14]=a[15]=0);a[14]=this.hBytes\u003C\u003C3|this.bytes\u003E\u003E\u003E29;a[15]=this.bytes\u003C\u003C3;this.hash()}};k.prototype.hash=function(){var a,b,c,f,e=this.h0,h=this.h1,d=this.h2,g=this.h3,k=this.h4,l=this.h5,r=this.h6,q=this.h7,n=this.blocks;for(a=16;64\u003Ea;++a){var p=((c=n[a-15])\u003E\u003E\u003E7|c\u003C\u003C25)^(c\u003E\u003E\u003E18|c\u003C\u003C14)^c\u003E\u003E\u003E3;var t=((c=n[a-2])\u003E\u003E\u003E\n17|c\u003C\u003C15)^(c\u003E\u003E\u003E19|c\u003C\u003C13)^c\u003E\u003E\u003E10;n[a]=n[a-16]+p+n[a-7]+t\u003C\u003C0}var u=h\u0026d;for(a=0;64\u003Ea;a+=4)this.first?(this.is224?(f=300032,q=(c=n[0]-1413257819)-150054599\u003C\u003C0,g=c+24177077\u003C\u003C0):(f=704751109,q=(c=n[0]-210244248)-1521486534\u003C\u003C0,g=c+143694565\u003C\u003C0),this.first=!1):(p=(e\u003E\u003E\u003E2|e\u003C\u003C30)^(e\u003E\u003E\u003E13|e\u003C\u003C19)^(e\u003E\u003E\u003E22|e\u003C\u003C10),b=(f=e\u0026h)^e\u0026d^u,q=g+(c=q+((k\u003E\u003E\u003E6|k\u003C\u003C26)^(k\u003E\u003E\u003E11|k\u003C\u003C21)^(k\u003E\u003E\u003E25|k\u003C\u003C7))+(k\u0026l^~k\u0026r)+y[a]+n[a])\u003C\u003C0,g=c+(p+b)\u003C\u003C0),p=(g\u003E\u003E\u003E2|g\u003C\u003C30)^(g\u003E\u003E\u003E13|g\u003C\u003C19)^(g\u003E\u003E\u003E22|g\u003C\u003C10),b=(u=g\u0026e)^g\u0026h^f,r=d+(c=r+((q\u003E\u003E\u003E6|q\u003C\u003C26)^(q\u003E\u003E\u003E11|\nq\u003C\u003C21)^(q\u003E\u003E\u003E25|q\u003C\u003C7))+(q\u0026k^~q\u0026l)+y[a+1]+n[a+1])\u003C\u003C0,p=((d=c+(p+b)\u003C\u003C0)\u003E\u003E\u003E2|d\u003C\u003C30)^(d\u003E\u003E\u003E13|d\u003C\u003C19)^(d\u003E\u003E\u003E22|d\u003C\u003C10),b=(t=d\u0026g)^d\u0026e^u,l=h+(c=l+((r\u003E\u003E\u003E6|r\u003C\u003C26)^(r\u003E\u003E\u003E11|r\u003C\u003C21)^(r\u003E\u003E\u003E25|r\u003C\u003C7))+(r\u0026q^~r\u0026k)+y[a+2]+n[a+2])\u003C\u003C0,p=((h=c+(p+b)\u003C\u003C0)\u003E\u003E\u003E2|h\u003C\u003C30)^(h\u003E\u003E\u003E13|h\u003C\u003C19)^(h\u003E\u003E\u003E22|h\u003C\u003C10),b=(u=h\u0026d)^h\u0026g^t,k=e+(c=k+((l\u003E\u003E\u003E6|l\u003C\u003C26)^(l\u003E\u003E\u003E11|l\u003C\u003C21)^(l\u003E\u003E\u003E25|l\u003C\u003C7))+(l\u0026r^~l\u0026q)+y[a+3]+n[a+3])\u003C\u003C0,e=c+(p+b)\u003C\u003C0;this.h0=this.h0+e\u003C\u003C0;this.h1=this.h1+h\u003C\u003C0;this.h2=this.h2+d\u003C\u003C0;this.h3=this.h3+g\u003C\u003C0;this.h4=this.h4+k\u003C\u003C0;this.h5=this.h5+\nl\u003C\u003C0;this.h6=this.h6+r\u003C\u003C0;this.h7=this.h7+q\u003C\u003C0};k.prototype.hex=function(){this.finalize();var a=this.h0,b=this.h1,m=this.h2,f=this.h3,e=this.h4,h=this.h5,d=this.h6,g=this.h7;a=c[a\u003E\u003E28\u002615]+c[a\u003E\u003E24\u002615]+c[a\u003E\u003E20\u002615]+c[a\u003E\u003E16\u002615]+c[a\u003E\u003E12\u002615]+c[a\u003E\u003E8\u002615]+c[a\u003E\u003E4\u002615]+c[15\u0026a]+c[b\u003E\u003E28\u002615]+c[b\u003E\u003E24\u002615]+c[b\u003E\u003E20\u002615]+c[b\u003E\u003E16\u002615]+c[b\u003E\u003E12\u002615]+c[b\u003E\u003E8\u002615]+c[b\u003E\u003E4\u002615]+c[15\u0026b]+c[m\u003E\u003E28\u002615]+c[m\u003E\u003E24\u002615]+c[m\u003E\u003E20\u002615]+c[m\u003E\u003E16\u002615]+c[m\u003E\u003E12\u002615]+c[m\u003E\u003E8\u002615]+c[m\u003E\u003E4\u002615]+c[15\u0026m]+c[f\u003E\u003E28\u002615]+c[f\u003E\u003E24\u002615]+c[f\u003E\u003E20\u002615]+c[f\u003E\u003E16\u002615]+c[f\u003E\u003E12\u0026\n15]+c[f\u003E\u003E8\u002615]+c[f\u003E\u003E4\u002615]+c[15\u0026f]+c[e\u003E\u003E28\u002615]+c[e\u003E\u003E24\u002615]+c[e\u003E\u003E20\u002615]+c[e\u003E\u003E16\u002615]+c[e\u003E\u003E12\u002615]+c[e\u003E\u003E8\u002615]+c[e\u003E\u003E4\u002615]+c[15\u0026e]+c[h\u003E\u003E28\u002615]+c[h\u003E\u003E24\u002615]+c[h\u003E\u003E20\u002615]+c[h\u003E\u003E16\u002615]+c[h\u003E\u003E12\u002615]+c[h\u003E\u003E8\u002615]+c[h\u003E\u003E4\u002615]+c[15\u0026h]+c[d\u003E\u003E28\u002615]+c[d\u003E\u003E24\u002615]+c[d\u003E\u003E20\u002615]+c[d\u003E\u003E16\u002615]+c[d\u003E\u003E12\u002615]+c[d\u003E\u003E8\u002615]+c[d\u003E\u003E4\u002615]+c[15\u0026d];return this.is224||(a+=c[g\u003E\u003E28\u002615]+c[g\u003E\u003E24\u002615]+c[g\u003E\u003E20\u002615]+c[g\u003E\u003E16\u002615]+c[g\u003E\u003E12\u002615]+c[g\u003E\u003E8\u002615]+c[g\u003E\u003E4\u002615]+c[15\u0026g]),a};k.prototype.toString=k.prototype.hex;k.prototype.digest=function(){this.finalize();\nvar a=this.h0,b=this.h1,c=this.h2,f=this.h3,e=this.h4,h=this.h5,d=this.h6,g=this.h7;a=[a\u003E\u003E24\u0026255,a\u003E\u003E16\u0026255,a\u003E\u003E8\u0026255,255\u0026a,b\u003E\u003E24\u0026255,b\u003E\u003E16\u0026255,b\u003E\u003E8\u0026255,255\u0026b,c\u003E\u003E24\u0026255,c\u003E\u003E16\u0026255,c\u003E\u003E8\u0026255,255\u0026c,f\u003E\u003E24\u0026255,f\u003E\u003E16\u0026255,f\u003E\u003E8\u0026255,255\u0026f,e\u003E\u003E24\u0026255,e\u003E\u003E16\u0026255,e\u003E\u003E8\u0026255,255\u0026e,h\u003E\u003E24\u0026255,h\u003E\u003E16\u0026255,h\u003E\u003E8\u0026255,255\u0026h,d\u003E\u003E24\u0026255,d\u003E\u003E16\u0026255,d\u003E\u003E8\u0026255,255\u0026d];return this.is224||a.push(g\u003E\u003E24\u0026255,g\u003E\u003E16\u0026255,g\u003E\u003E8\u0026255,255\u0026g),a};k.prototype.array=k.prototype.digest;k.prototype.arrayBuffer=function(){this.finalize();var a=new ArrayBuffer(this.is224?\n28:32),b=new DataView(a);return b.setUint32(0,this.h0),b.setUint32(4,this.h1),b.setUint32(8,this.h2),b.setUint32(12,this.h3),b.setUint32(16,this.h4),b.setUint32(20,this.h5),b.setUint32(24,this.h6),this.is224||b.setUint32(28,this.h7),a};x.prototype=new k;x.prototype.finalize=function(){if(k.prototype.finalize.call(this),this.inner){this.inner=!1;var a=this.array();k.call(this,this.is224,this.sharedMemory);this.update(this.oKeyPad);this.update(a);k.prototype.finalize.call(this)}};var t=C();t.sha256=\nt;t.sha224=C(!0);t.sha256.hmac=E();t.sha224.hmac=E(!0);v?module.exports=t:(p.sha256=t.sha256,p.sha224=t.sha224,F\u0026\u0026define(function(){return t}))}();\u003C\/script\u003E",
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":105
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_html":"\u003Cscript data-gtmsrc=\"https:\/\/click.accesstrade.co.id\/js\/nct\/lp.js\" type=\"text\/gtmscript\"\u003E\u003C\/script\u003E\n",
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":109
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_html":["template","\u003Cscript type=\"text\/gtmscript\"\u003Evar orders=",["escape",["macro",32],8,16],",itemInfo=[],orderInfo=[];(orders||[]).forEach(function(b){(Object.values(b.items)||[]).forEach(function(a){var b=a.itemid,c=a.price\/1E5,d=a.quantity;a=a.categories[0].catids[0];itemInfo.push({id:b,category_id:a,price:c,quantity:d})})});var __atw=__atw||[];__atw.push({mcn:\"c3c59e5f8b3e9753913f4d435b53c308\",param:{result_id:\"30\",identifier:\"",["escape",["macro",31],7],"\",products:itemInfo}});\n(function(b){var a=b.createElement(\"script\");a.src=\"https:\/\/cv.accesstrade.co.id\/js\/nct\/cv.js\";a.async=!0;b=b.getElementsByTagName(\"script\")[0];b.parentNode.insertBefore(a,b)})(document);\u003C\/script\u003E"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":110
    },{
      "function":"__html",
      "metadata":["map"],
      "setup_tags":["list",["tag",177,0]],
      "once_per_event":true,
      "vtp_html":["template","\u003Cscript type=\"text\/gtmscript\"\u003Ewindow.pzConvData=window.pzConvData||[];window.pzConvData.push({type:\"purchase\",merchantId:\"7077\",productId:\"",["escape",["macro",115],7],"\",value:\"",["escape",["macro",116],7],"\",data:\"",["escape",["macro",31],7],"\",filter:\"payment method\"});\u003C\/script\u003E\n\u003Cscript data-gtmsrc=\"https:\/\/mstatic.priceza.com\/js\/tracking-3.0.js\" async type=\"text\/gtmscript\"\u003E\u003C\/script\u003E\n"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":181
    },{
      "function":"__html",
      "metadata":["map"],
      "setup_tags":["list",["tag",177,0]],
      "once_per_event":true,
      "vtp_html":"\u003Cscript type=\"text\/gtmscript\"\u003Ewindow.pzConvData=window.pzConvData||[];window.pzConvData.push({type:\"purchase\",merchantId:\"7077\",filter:\"MEMBER-SIGNUP\"});\u003C\/script\u003E\n\u003Cscript data-gtmsrc=\"https:\/\/mstatic.priceza.com\/js\/tracking-3.0.js\" async type=\"text\/gtmscript\"\u003E\u003C\/script\u003E\n",
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":182
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_html":"\u003Cscript data-gtmsrc=\"https:\/\/mstatic.priceza.com\/js\/tracking-3.0.js\" async type=\"text\/gtmscript\"\u003E\u003C\/script\u003E",
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":183
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_html":["template","\u003Ciframe src=\"https:\/\/asia.creativecdn.com\/tags?id=pr_",["escape",["macro",117],12],"_home\u0026amp;id=pr_",["escape",["macro",117],12],"_uid_",["escape",["macro",11],12],"\" width=\"1\" height=\"1\" scrolling=\"no\" frameborder=\"0\" style=\"display: none;\"\u003E\u003C\/iframe\u003E\n"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":381
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_html":["template","\u003Ciframe src=\"https:\/\/asia.creativecdn.com\/tags?id=pr_",["escape",["macro",117],12],"_category2_",["escape",["macro",101],12],"\u0026amp;id=pr_",["escape",["macro",117],12],"_uid_",["escape",["macro",11],12],"\" width=\"1\" height=\"1\" scrolling=\"no\" frameborder=\"0\" style=\"display: none;\"\u003E\u003C\/iframe\u003E"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":382
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_html":["template","\u003Ciframe src=\"https:\/\/asia.creativecdn.com\/tags?id=pr_",["escape",["macro",117],12],"_offer_",["escape",["macro",30],12],"\u0026amp;id=pr_",["escape",["macro",117],12],"_uid_",["escape",["macro",11],12],"\" width=\"1\" height=\"1\" scrolling=\"no\" frameborder=\"0\" style=\"display: none;\"\u003E\u003C\/iframe\u003E"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":383
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_html":["template","\u003Ciframe src=\"https:\/\/asia.creativecdn.com\/tags?id=pr_",["escape",["macro",117],12],"_listing_",["escape",["macro",88],12],"\u0026amp;id=pr_",["escape",["macro",117],12],"_uid_",["escape",["macro",11],12],"\" width=\"1\" height=\"1\" scrolling=\"no\" frameborder=\"0\" style=\"display: none;\"\u003E\u003C\/iframe\u003E"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":384
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_html":["template","\u003Ciframe src=\"https:\/\/asia.creativecdn.com\/tags?id=pr_",["escape",["macro",117],12],"_basketstatus_",["escape",["macro",118],12],"\u0026amp;id=pr_",["escape",["macro",117],12],"_uid_",["escape",["macro",11],12],"\" width=\"1\" height=\"1\" scrolling=\"no\" frameborder=\"0\" style=\"display: none;\"\u003E\u003C\/iframe\u003E"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":385
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_html":["template","\u003Ciframe src=\"https:\/\/asia.creativecdn.com\/tags?id=pr_",["escape",["macro",117],12],"_startorder\u0026amp;id=pr_",["escape",["macro",117],12],"_uid_",["escape",["macro",11],12],"\" width=\"1\" height=\"1\" scrolling=\"no\" frameborder=\"0\" style=\"display: none;\"\u003E\u003C\/iframe\u003E"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":386
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_html":["template","\u003Ciframe src=\"https:\/\/asia.creativecdn.com\/tags?id=pr_",["escape",["macro",117],12],"\u0026amp;ncm=1\u0026amp;id=pr_",["escape",["macro",117],12],"_uid_",["escape",["macro",11],12],"\" width=\"1\" height=\"1\" scrolling=\"no\" frameborder=\"0\" style=\"display: none;\"\u003E\u003C\/iframe\u003E"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":387
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_event":true,
      "vtp_html":["template","\u003Ciframe src=\"https:\/\/asia.creativecdn.com\/tags?id=pr_",["escape",["macro",117],12],"_orderstatus2_",["escape",["macro",44],12],"_",["escape",["macro",31],12],"_",["escape",["macro",107],12],"\u0026amp;cd=default\u0026amp;id=pr_",["escape",["macro",117],12],"_uid_",["escape",["macro",11],12],"\" width=\"1\" height=\"1\" scrolling=\"no\" frameborder=\"0\" style=\"display: none;\"\u003E\u003C\/iframe\u003E"],
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":388
    },{
      "function":"__html",
      "metadata":["map"],
      "once_per_load":true,
      "vtp_html":"\u003Cscript type=\"text\/gtmscript\"\u003Ewindow.dataLayer=window.dataLayer||[];window.dataLayer.push({originalLocation:document.location.protocol+\"\/\/\"+document.location.hostname+document.location.pathname+document.location.search});\u003C\/script\u003E",
      "vtp_supportDocumentWrite":false,
      "vtp_enableIframeMode":false,
      "vtp_enableEditJsMacroBehavior":false,
      "tag_id":396
    }],
  "predicates":[{
      "function":"_eq",
      "arg0":["macro",0],
      "arg1":"ProductPage.Self"
    },{
      "function":"_eq",
      "arg0":["macro",1],
      "arg1":"impression"
    },{
      "function":"_eq",
      "arg0":["macro",2],
      "arg1":"pc"
    },{
      "function":"_re",
      "arg0":["macro",1],
      "arg1":".*"
    },{
      "function":"_eq",
      "arg0":["macro",3],
      "arg1":"test"
    },{
      "function":"_re",
      "arg0":["macro",4],
      "arg1":"test.shopee.(sg|com.my|co.th|tw|co.id|vn|ph)",
      "ignore_case":true
    },{
      "function":"_eq",
      "arg0":["macro",3],
      "arg1":"uat"
    },{
      "function":"_re",
      "arg0":["macro",4],
      "arg1":"uat.shopee.(sg|com.my|co.th|tw|co.id|vn|ph)",
      "ignore_case":true
    },{
      "function":"_re",
      "arg0":["macro",4],
      "arg1":"(uat|test|live-test|staging).shopee.(sg|com.my|co.th|tw|co.id|vn|ph|com|com.br)",
      "ignore_case":true
    },{
      "function":"_eq",
      "arg0":["macro",1],
      "arg1":"gtm.js"
    },{
      "function":"_re",
      "arg0":["macro",4],
      "arg1":"(uat|test).shopee.(sg|com.my|co.th|tw|co.id|vn|ph)",
      "ignore_case":true
    },{
      "function":"_eq",
      "arg0":["macro",1],
      "arg1":"gtm.historyChange"
    },{
      "function":"_eq",
      "arg0":["macro",1],
      "arg1":"gtm.load"
    },{
      "function":"_re",
      "arg0":["macro",0],
      "arg1":"ItemCard",
      "ignore_case":true
    },{
      "function":"_cn",
      "arg0":["macro",0],
      "arg1":"ItemCard"
    },{
      "function":"_eq",
      "arg0":["macro",1],
      "arg1":"click"
    },{
      "function":"_cn",
      "arg0":["macro",5],
      "arg1":"addToCart"
    },{
      "function":"_eq",
      "arg0":["macro",1],
      "arg1":"action"
    },{
      "function":"_cn",
      "arg0":["macro",2],
      "arg1":"mweb"
    },{
      "function":"_cn",
      "arg0":["macro",6],
      "arg1":"\/produk-digital\/"
    },{
      "function":"_re",
      "arg0":["macro",4],
      "arg1":"lite.shopee.(sg|com.my|co.th|tw|co.id|vn|ph|com|com.br)",
      "ignore_case":true
    },{
      "function":"_eq",
      "arg0":["macro",7],
      "arg1":"HomePage"
    },{
      "function":"_eq",
      "arg0":["macro",21],
      "arg1":"true"
    },{
      "function":"_eq",
      "arg0":["macro",1],
      "arg1":"pageState"
    },{
      "function":"_cn",
      "arg0":["macro",7],
      "arg1":"CategoryPage"
    },{
      "function":"_eq",
      "arg0":["macro",5],
      "arg1":"buyNow"
    },{
      "function":"_eq",
      "arg0":["macro",0],
      "arg1":"ShopPage.Self"
    },{
      "function":"_cn",
      "arg0":["macro",7],
      "arg1":"OfficialShopLandingPage"
    },{
      "function":"_eq",
      "arg0":["macro",7],
      "arg1":"CollectionPage"
    },{
      "function":"_cn",
      "arg0":["macro",7],
      "arg1":"FlashSale"
    },{
      "function":"_eq",
      "arg0":["macro",7],
      "arg1":"PageMicroSite"
    },{
      "function":"_cn",
      "arg0":["macro",0],
      "arg1":"MallPage.Self"
    },{
      "function":"_re",
      "arg0":["macro",6],
      "arg1":"\/search",
      "ignore_case":true
    },{
      "function":"_re",
      "arg0":["macro",1],
      "arg1":"gtm.historyChange"
    },{
      "function":"_eq",
      "arg0":["macro",22],
      "arg1":"tw"
    },{
      "function":"_eq",
      "arg0":["macro",22],
      "arg1":"sg"
    },{
      "function":"_eq",
      "arg0":["macro",22],
      "arg1":"ph"
    },{
      "function":"_eq",
      "arg0":["macro",22],
      "arg1":"vn"
    },{
      "function":"_eq",
      "arg0":["macro",1],
      "arg1":"gtm.dom"
    },{
      "function":"_eq",
      "arg0":["macro",5],
      "arg1":"placeOrder"
    },{
      "function":"_eq",
      "arg0":["macro",22],
      "arg1":"my"
    },{
      "function":"_eq",
      "arg0":["macro",22],
      "arg1":"id"
    },{
      "function":"_eq",
      "arg0":["macro",22],
      "arg1":"th"
    },{
      "function":"_eq",
      "arg0":["macro",22],
      "arg1":"br"
    },{
      "function":"_re",
      "arg0":["macro",7],
      "arg1":"Search(Result|)Page"
    },{
      "function":"_eq",
      "arg0":["macro",7],
      "arg1":"CartPage"
    },{
      "function":"_eq",
      "arg0":["macro",7],
      "arg1":"CheckoutPage"
    },{
      "function":"_eq",
      "arg0":["macro",5],
      "arg1":"action_sign_up_success"
    },{
      "function":"_re",
      "arg0":["macro",4],
      "arg1":"shopee.(sg|com.my|co.th|tw|co.id|vn|ph|com.br)",
      "ignore_case":true
    },{
      "function":"_cn",
      "arg0":["macro",6],
      "arg1":"produk-digital"
    },{
      "function":"_re",
      "arg0":["macro",4],
      "arg1":"lite.(uat|test|live-test|staging).shopee.(sg|com.my|co.th|tw|co.id|vn|ph|com|com.br)",
      "ignore_case":true
    },{
      "function":"_re",
      "arg0":["macro",48],
      "arg1":"(http|https):\/\/shopee.(vn|co.th|com.my|ph|sg|tw)\/m\/99",
      "ignore_case":true
    },{
      "function":"_re",
      "arg0":["macro",48],
      "arg1":"(http|https):\/\/shopee.co.id\/m\/super-shopping-day-129",
      "ignore_case":true
    },{
      "function":"_re",
      "arg0":["macro",50],
      "arg1":"(affiliate|affiliates)",
      "ignore_case":true
    },{
      "function":"_eq",
      "arg0":["macro",3],
      "arg1":"live"
    },{
      "function":"_re",
      "arg0":["macro",4],
      "arg1":"^shopee.(sg|com.my|co.th|tw|co.id|vn|ph|com.br)",
      "ignore_case":true
    },{
      "function":"_re",
      "arg0":["macro",4],
      "arg1":"(test|uat|live-test|staging).shopee.(sg|com.my|co.th|tw|co.id|vn|ph|com|com.br)",
      "ignore_case":true
    },{
      "function":"_re",
      "arg0":["macro",4],
      "arg1":"(uat|test|live-test|staging).shopee.(sg|com.my|co.th|tw|co.id|vn|ph|com.br)",
      "ignore_case":true
    },{
      "function":"_re",
      "arg0":["macro",4],
      "arg1":"lite.(uat|test|live-test|staging).shopee.(sg|com.my|co.th|tw|co.id|vn|ph|com.br)",
      "ignore_case":true
    },{
      "function":"_re",
      "arg0":["macro",4],
      "arg1":"(test|uat|live-test|staging).shopee.(sg|com.my|co.th|tw|co.id|vn|ph|com.br)",
      "ignore_case":true
    },{
      "function":"_re",
      "arg0":["macro",6],
      "arg1":"\/web$",
      "ignore_case":true
    },{
      "function":"_re",
      "arg0":["macro",48],
      "arg1":"https:\/\/shopee.(sg|tw|co.id|vn|co.th|ph|com.my|com.br)\/(blog|inspirasi-shopee)($|.*)",
      "ignore_case":true
    },{
      "function":"_eq",
      "arg0":["macro",56],
      "arg1":"single-post"
    },{
      "function":"_eq",
      "arg0":["macro",1],
      "arg1":"gtm.video"
    },{
      "function":"_re",
      "arg0":["macro",59],
      "arg1":"(^$|((^|,)7691473_229($|,)))"
    },{
      "function":"_re",
      "arg0":["macro",56],
      "arg1":"(single-post|single-page)",
      "ignore_case":true
    },{
      "function":"_cn",
      "arg0":["macro",6],
      "arg1":"\/blog"
    },{
      "function":"_eq",
      "arg0":["macro",4],
      "arg1":"shopee.com"
    },{
      "function":"_cn",
      "arg0":["macro",67],
      "arg1":"sho.pe"
    },{
      "function":"_cn",
      "arg0":["macro",6],
      "arg1":"\/blog\/"
    },{
      "function":"_eq",
      "arg0":["macro",1],
      "arg1":"gtm.linkClick"
    },{
      "function":"_re",
      "arg0":["macro",59],
      "arg1":"(^$|((^|,)7691473_263($|,)))"
    },{
      "function":"_cn",
      "arg0":["macro",67],
      "arg1":"https:\/\/shopee."
    },{
      "function":"_re",
      "arg0":["macro",59],
      "arg1":"(^$|((^|,)7691473_264($|,)))"
    },{
      "function":"_cn",
      "arg0":["macro",5],
      "arg1":"action_delete_shopping_cart_item"
    },{
      "function":"_eq",
      "arg0":["macro",77],
      "arg1":"popstate"
    },{
      "function":"_re",
      "arg0":["macro",4],
      "arg1":"(event|doitac).shopee.*",
      "ignore_case":true
    },{
      "function":"_eq",
      "arg0":["macro",5],
      "arg1":"login_success"
    },{
      "function":"_eq",
      "arg0":["macro",79],
      "arg1":"action_login_success"
    },{
      "function":"_eq",
      "arg0":["macro",1],
      "arg1":"v3"
    },{
      "function":"_re",
      "arg0":["macro",4],
      "arg1":"(giaitri|nhasach).shopee.vn",
      "ignore_case":true
    },{
      "function":"_re",
      "arg0":["macro",4],
      "arg1":"nhasach.shopee.vn",
      "ignore_case":true
    },{
      "function":"_eq",
      "arg0":["macro",90],
      "arg1":"purchase"
    },{
      "function":"_eq",
      "arg0":["macro",1],
      "arg1":"purchase"
    },{
      "function":"_re",
      "arg0":["macro",4],
      "arg1":"(myads|iklanku|muatukhoa).shopee.(sg|com.my|co.th|tw|co.id|vn|ph)",
      "ignore_case":true
    },{
      "function":"_eq",
      "arg0":["macro",94],
      "arg1":"btn"
    },{
      "function":"_eq",
      "arg0":["macro",1],
      "arg1":"gtm.click"
    },{
      "function":"_eq",
      "arg0":["macro",90],
      "arg1":"pageState"
    },{
      "function":"_eq",
      "arg0":["macro",90],
      "arg1":"impressions"
    },{
      "function":"_eq",
      "arg0":["macro",5],
      "arg1":"registration"
    }],
  "rules":[
    [["if",0,1],["add",2,9,11,13,14,21,24,30,120,147,159,167,170,173,180]],
    [["if",9],["unless",10],["add",3,148],["block",9]],
    [["if",11],["unless",10],["add",4]],
    [["if",12],["unless",10],["add",4]],
    [["if",1,13],["add",5,29,36]],
    [["if",14,15],["add",6,26,40]],
    [["if",16,17],["add",7,9,11,14,27,30,35,67,71,85,87,102,110,151,160,167,170,173]],
    [["if",3,18],["unless",8],["add",8,65,69,84,90,101,111,131]],
    [["if",9,19],["add",8,38,131]],
    [["if",9,20],["add",8,38,131]],
    [["if",21,22,23],["add",9,11,13,14,19,24,30,118,149,167,170,173,178]],
    [["if",22,23,24],["add",9,11,13,14,20,24,30,119,150,162,167,170,173,179]],
    [["if",17,25],["add",9,11,30,151,167,170,173]],
    [["if",1,26],["add",9,11,13,14,24,30,125,167,170,173,184]],
    [["if",23,27],["add",9,11,13,14,24,30,167,170,173]],
    [["if",23,28],["add",9,11,13,14,20,24,30,125,167,170,173,184]],
    [["if",23,29],["add",9,11,13,14,24,30,125,167,170,173,184]],
    [["if",23,30],["add",9,11,13,14,24,30,125,166,167,170,173,184]],
    [["if",1,31],["add",9,11,13,14,24,30,167,170,173]],
    [["if",22,32,33],["add",9,11,13,20,24,30,63,73,83,88,100,107,121,154,158,167,170,173,181]],
    [["if",17,39],["add",10,12,15,16,17,22,25,0,33,39,42,43,44,45,46,68,75,82,94,97,106,124,152,153,155,156,161,168,1,171,174,185]],
    [["if",22,23,44],["add",14]],
    [["if",23,45],["add",18,122,165,182]],
    [["if",9],["add",23,157,169,172,177,132,134,135,136,137,138,140,141,142,143,144,145,146]],
    [["if",23,46],["add",24,123,164,183]],
    [["if",17,47],["add",28,41,61,74,79,91,98,108,163]],
    [["if",23,48],["unless",8],["add",31,64,76,78,95,103,109,130,157]],
    [["if",11,49],["unless",8],["add",31,130]],
    [["if",11,20],["unless",50],["add",31,130]],
    [["if",9,51],["add",32]],
    [["if",9,52],["add",32]],
    [["if",17,39,53],["add",34,58,175]],
    [["if",23,57],["add",37,115]],
    [["if",11,49,57],["add",37,115]],
    [["if",11,57],["add",37,115]],
    [["if",11,58],["add",37,115]],
    [["if",3,18,59],["add",38,114]],
    [["if",9,60],["add",38,50,114]],
    [["if",8,9],["add",38,114],["block",2,3,4,5,6,7,8,10,11,13,16,18,19,20,21,22,24,25,26,27,28,0,29,30,31,32,34,42,43,44,50,53,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,116,118,119,120,121,122,123,124,125,126,127,128,147,148,149,150,151,152,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,170,171,173,174,175,176,177,178,179,180,181,182,183,184,185]],
    [["if",9,61],["add",47]],
    [["if",62,63,64],["add",48]],
    [["if",9,65,66],["add",49]],
    [["if",9,67],["add",50]],
    [["if",3,4,5],["add",51],["block",2,3,4,5,6,7,8,9,10,11,12,13,14,16,17,18,19,20,21,22,24,25,26,27,28,0,29,30,31,32,34,42,43,44,50,53,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,116,118,119,120,121,122,123,124,125,126,127,128,155,157,158,159,160,161,162,163,164,165,167,168,170,171,173,174,175,176,177,178,179,180,181,182,183,184,185]],
    [["if",3,6,7],["add",51],["block",2,3,4,5,6,7,8,9,10,11,12,13,14,16,17,18,19,20,21,22,25,26,27,28,0,29,30,31,34,42,43,44,50,53,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,116,118,119,120,121,122,123,124,125,126,127,128,155,157,158,159,160,161,162,163,164,165,167,168,170,171,173,174,175,176,177,178,179,180,181,182,183,184,185]],
    [["if",68,69,70,71],["add",52]],
    [["if",69,70,72,73],["add",52]],
    [["if",17,74],["add",53,54,66,77,86,89,99,113]],
    [["if",11,75,76],["add",55]],
    [["if",9,76],["add",55]],
    [["if",17,77],["add",56,60,72,81,93,96,105]],
    [["if",78,79],["add",57,62,70,80,92,104,112]],
    [["if",9,80],["add",59],["block",148,177]],
    [["if",11,81],["unless",8],["add",116,157]],
    [["if",82,83],["add",117,126]],
    [["if",11,84],["add",127]],
    [["if",9,84],["add",128]],
    [["if",85,86],["add",129]],
    [["if",9,87],["add",133]],
    [["if",9,88],["add",139]],
    [["if",17,53,89],["add",176]],
    [["if",2,3],["block",2,3,4,5,6,7,16,153]],
    [["if",3,34],["block",9,10,11,13,14,15,17,24,25,30,58,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,118,119,120,121,122,123,124,125,130,131,153,155,156,167,168,170,171,173,174,175,176,177,178,179,180,181,182,183,184,185]],
    [["if",3,35],["block",9,10,11,12,13,14,15,24,25,30,58,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,147,148,149,150,151,152,153,154,156,166,167,168,170,171,173,174,175,176,177]],
    [["if",3,36],["block",9,10,11,12,13,14,15,24,25,30,58,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,130,131,147,148,149,150,151,152,153,154,155,156,166,167,168,170,171,173,174,175,176,177]],
    [["if",3,37],["block",9,14,24,25,30,58,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,130,131,147,148,149,150,151,152,153,154,155,166,170,171,173,174,175,176,177]],
    [["if",38],["block",9]],
    [["if",3,40],["block",10,11,13,14,15,17,24,25,30,58,60,61,62,63,64,65,66,67,68,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,130,131,147,148,149,150,151,152,153,154,156,166,167,168,173,174,175,176,177]],
    [["if",3,41],["block",10,11,13,15,17,25,30,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,147,148,149,150,151,152,153,154,156,166,167,168,170,171,175,176,177]],
    [["if",3,42],["block",10,11,13,14,15,17,24,58,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,105,106,107,108,109,110,111,112,113,130,131,147,148,149,150,151,152,153,154,156,166,167,168,170,171,173,174]],
    [["if",3,43],["block",10,11,13,18,19,20,21,22,24,25,30,58,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,118,119,120,121,122,123,124,125,130,131,147,148,149,150,151,152,154,155,156,166,167,168,170,171,173,174,175,176,177,178,179,180,181,182,183,184,185]],
    [["if",3,54,55],["block",35,36,37,38,39,40,41,45,46,54,86,114,115,117]],
    [["if",9],["unless",56],["block",35,36,37,38,39,40,41,45,46,54,114,115,117]]]
},
"runtime":[[50,"__hjtc",[46,"a"],[52,"b",["require","createArgumentsQueue"]],[52,"c",["require","encodeUriComponent"]],[52,"d",["require","injectScript"]],[52,"e",["require","makeString"]],[52,"f",["require","setInWindow"]],["b","hj","hj.q"],[52,"g",[17,[15,"a"],"hotjar_site_id"]],["f","_hjSettings",[8,"hjid",[15,"g"],"hjsv",7,"scriptSource","gtm"]],["d",[0,[0,"https://static.hotjar.com/c/hotjar-",["c",["e",[15,"g"]]]],".js?sv\u003d7"],[17,[15,"a"],"gtmOnSuccess"],[17,[15,"a"],"gtmOnFailure"]]],[50,"__crto",[46,"a"],[52,"b",["require","createQueue"]],[52,"c",["require","injectScript"]],[52,"d","https://static.criteo.net/js/ld/ld.js"],[52,"e",["b","criteo_q"]],[41,"f"],[3,"f",[8,"event","viewHome"]],[38,[17,[15,"a"],"tagType"],[46,"LISTING_TAG","PRODUCT_TAG","BASKET_TAG","TRANSACTION_TAG"],[46,[5,[46,[3,"f",[8,"event","viewList","item",[17,[15,"a"],"listingID"]]],[4]]],[5,[46,[3,"f",[8,"event","viewItem","item",[17,[15,"a"],"productID"]]],[4]]],[5,[46,[3,"f",[8,"event","viewBasket","item",[17,[15,"a"],"basketArray"]]],[4]]],[5,[46,[3,"f",[8,"event","trackTransaction","id",[30,[17,[15,"a"],"TransactionID"],""],"item",[17,[15,"a"],"TransactionArray"]]],[4]]]]],["e",[8,"event","setAccount","account",[17,[15,"a"],"accountId"]],[8,"event","setHashedEmail","email",[30,[17,[15,"a"],"hashedEmail"],""]],[8,"event","setSiteType","type",[30,[17,[15,"a"],"siteType"],"d"]],[15,"f"]],["c",[15,"d"],[17,[15,"a"],"gtmOnSuccess"],[17,[15,"a"],"gtmOnFailure"],"criteoStatic"]]]
,"permissions":{"__hjtc":{"access_globals":{"keys":[{"key":"hj","read":true,"write":true,"execute":false},{"key":"hj.q","read":true,"write":true,"execute":false},{"key":"_hjSettings","read":true,"write":true,"execute":false}]},"inject_script":{"urls":["https:\/\/static.hotjar.com\/c\/hotjar-*"]}},"__crto":{"access_globals":{"keys":[{"key":"criteo_q","read":true,"write":true,"execute":false}]},"inject_script":{"urls":["https:\/\/static.criteo.net\/js\/ld\/ld.js"]}}}

,"security_groups":{
"nonGoogleScripts":["__hjtc","__crto"]}

};
/*

 Copyright The Closure Library Authors.
 SPDX-License-Identifier: Apache-2.0
*/
var aa,ba="function"==typeof Object.create?Object.create:function(a){var b=function(){};b.prototype=a;return new b},ca;if("function"==typeof Object.setPrototypeOf)ca=Object.setPrototypeOf;else{var ea;a:{var fa={Zf:!0},ha={};try{ha.__proto__=fa;ea=ha.Zf;break a}catch(a){}ea=!1}ca=ea?function(a,b){a.__proto__=b;if(a.__proto__!==b)throw new TypeError(a+" is not extensible");return a}:null}
var ia=ca,ja=function(a,b){a.prototype=ba(b.prototype);a.prototype.constructor=a;if(ia)ia(a,b);else for(var c in b)if("prototype"!=c)if(Object.defineProperties){var d=Object.getOwnPropertyDescriptor(b,c);d&&Object.defineProperty(a,c,d)}else a[c]=b[c]},la=this||self,ma=/^[\w+/_-]+[=]{0,2}$/,na=null,oa=function(a,b){function c(){}c.prototype=b.prototype;a.prototype=new c;a.prototype.constructor=a},pa=function(a){return a};var qa=function(a,b){this.a=a;this.i=b};var sa=function(a){return"number"===typeof a&&0<=a&&isFinite(a)&&0===a%1||"string"===typeof a&&"-"!==a[0]&&a===""+parseInt(a,10)},ua=function(){this.s={};this.m=!1;this.F={}};ua.prototype.get=function(a){return this.s["dust."+a]};ua.prototype.set=function(a,b){this.m||(a="dust."+a,this.F.hasOwnProperty(a)||(this.s[a]=b))};ua.prototype.has=function(a){return this.s.hasOwnProperty("dust."+a)};var wa=function(a){var b=[],c;for(c in a.s)a.s.hasOwnProperty(c)&&b.push(c.substr(5));return b};var k=function(a){this.i=new ua;this.a=[];a=a||[];for(var b in a)a.hasOwnProperty(b)&&(sa(b)?this.a[Number(b)]=a[Number(b)]:this.i.set(b,a[b]))};aa=k.prototype;aa.toString=function(a){if(a&&0<=a.indexOf(this))return"";for(var b=[],c=0;c<this.a.length;c++){var d=this.a[c];null===d||void 0===d?b.push(""):d instanceof k?(a=a||[],a.push(this),b.push(d.toString(a)),a.pop()):b.push(d.toString())}return b.join(",")};
aa.set=function(a,b){if("length"==a){if(!sa(b))throw Error("RangeError: Length property must be a valid integer.");this.a.length=Number(b)}else sa(a)?this.a[Number(a)]=b:this.i.set(a,b)};aa.get=function(a){return"length"==a?this.length():sa(a)?this.a[Number(a)]:this.i.get(a)};aa.length=function(){return this.a.length};aa.sc=function(){for(var a=wa(this.i),b=0;b<this.a.length;b++)a.push(b+"");return new k(a)};
var ya=function(a,b){if(sa(b))delete a.a[Number(b)];else{var c=a.i,d;d="dust."+b;c.m||c.F.hasOwnProperty(d)||delete c.s[d]}};aa=k.prototype;aa.pop=function(){return this.a.pop()};aa.push=function(a){return this.a.push.apply(this.a,Array.prototype.slice.call(arguments))};aa.shift=function(){return this.a.shift()};aa.splice=function(a,b,c){return new k(this.a.splice.apply(this.a,arguments))};aa.unshift=function(a){return this.a.unshift.apply(this.a,Array.prototype.slice.call(arguments))};
aa.has=function(a){return sa(a)&&this.a.hasOwnProperty(a)||this.i.has(a)};var za=function(){function a(f,g){if(b[f]){if(b[f].hc+g>b[f].max)throw Error("Quota exceeded");b[f].hc+=g}}var b={},c=void 0,d=void 0,e={yh:function(f){c=f},qe:function(){c&&a(c,1)},Ah:function(f){d=f},Ia:function(f){d&&a(d,f)},Vh:function(f,g){b[f]=b[f]||{hc:0};b[f].max=g},Ug:function(f){return b[f]&&b[f].hc||0},reset:function(){b={}},Bg:a};e.onFnConsume=e.yh;e.consumeFn=e.qe;e.onStorageConsume=e.Ah;e.consumeStorage=e.Ia;e.setMax=e.Vh;e.getConsumed=e.Ug;e.reset=e.reset;e.consume=e.Bg;return e};var Ba=function(a,b){this.F=a;this.O=function(c,d,e){return c.apply(d,e)};this.m=b;this.i=new ua;this.a=this.s=void 0};Ba.prototype.add=function(a,b){Ca(this,a,b,!1)};var Ca=function(a,b,c,d){if(!a.i.m)if(a.F.Ia(("string"===typeof b?b.length:1)+("string"===typeof c?c.length:1)),d){var e=a.i;e.set(b,c);e.F["dust."+b]=!0}else a.i.set(b,c)};
Ba.prototype.set=function(a,b){this.i.m||(!this.i.has(a)&&this.m&&this.m.has(a)?this.m.set(a,b):(this.F.Ia(("string"===typeof a?a.length:1)+("string"===typeof b?b.length:1)),this.i.set(a,b)))};Ba.prototype.get=function(a){return this.i.has(a)?this.i.get(a):this.m?this.m.get(a):void 0};Ba.prototype.has=function(a){return!!this.i.has(a)||!(!this.m||!this.m.has(a))};var Da=function(a){var b=new Ba(a.F,a);a.s&&(b.s=a.s);b.O=a.O;b.a=a.a;return b};var Ea=function(){},Fa=function(a){return"function"==typeof a},p=function(a){return"string"==typeof a},Ga=function(a){return"number"==typeof a&&!isNaN(a)},Ha=function(a){return"[object Array]"==Object.prototype.toString.call(Object(a))},Ia=function(a,b){if(Array.prototype.indexOf){var c=a.indexOf(b);return"number"==typeof c?c:-1}for(var d=0;d<a.length;d++)if(a[d]===b)return d;return-1},Ja=function(a,b){if(a&&Ha(a))for(var c=0;c<a.length;c++)if(a[c]&&b(a[c]))return a[c]},Ka=function(a,b){if(!Ga(a)||
!Ga(b)||a>b)a=0,b=2147483647;return Math.floor(Math.random()*(b-a+1)+a)},Ma=function(a,b){for(var c=new La,d=0;d<a.length;d++)c.set(a[d],!0);for(var e=0;e<b.length;e++)if(c.get(b[e]))return!0;return!1},Na=function(a,b){for(var c in a)Object.prototype.hasOwnProperty.call(a,c)&&b(c,a[c])},Oa=function(a){return!!a&&("[object Arguments]"==Object.prototype.toString.call(a)||Object.prototype.hasOwnProperty.call(a,"callee"))},Pa=function(a){return Math.round(Number(a))||0},Qa=function(a){return"false"==
String(a).toLowerCase()?!1:!!a},Ra=function(a){var b=[];if(Ha(a))for(var c=0;c<a.length;c++)b.push(String(a[c]));return b},Sa=function(a){return a?a.replace(/^\s+|\s+$/g,""):""},Ta=function(){return(new Date).getTime()},La=function(){this.prefix="gtm.";this.values={}};La.prototype.set=function(a,b){this.values[this.prefix+a]=b};La.prototype.get=function(a){return this.values[this.prefix+a]};
var Ua=function(a,b,c){return a&&a.hasOwnProperty(b)?a[b]:c},Va=function(a){var b=!1;return function(){if(!b)try{a()}catch(c){}b=!0}},Wa=function(a,b){for(var c in b)b.hasOwnProperty(c)&&(a[c]=b[c])},Xa=function(a){for(var b in a)if(a.hasOwnProperty(b))return!0;return!1},Ya=function(a,b){for(var c=[],d=0;d<a.length;d++)c.push(a[d]),c.push.apply(c,b[a[d]]||[]);return c},Za=function(a){for(var b=C,c=0;c<a.length-1;c++){if(!b.hasOwnProperty(a[c]))return;b=b[a[c]]}return b},$a=function(a,b){for(var c=
{},d=c,e=a.split("."),f=0;f<e.length-1;f++)d=d[e[f]]={};d[e[e.length-1]]=b;return c},ab=function(a){var b=[];Na(a,function(c,d){10>c.length&&d&&b.push(c)});return b.join(",")};var bb=function(a,b){ua.call(this);this.a=a;this.O=b};ja(bb,ua);bb.prototype.toString=function(){return this.a};bb.prototype.sc=function(){return new k(wa(this))};bb.prototype.i=function(a,b){a.F.qe();return this.O.apply(db(this,a),Array.prototype.slice.call(arguments,1))};var db=function(a,b){var c=function(d,e){this.i=d;this.m=e};c.prototype.a=function(d){var e=this.m;return Ha(d)?eb(e,d):d};c.prototype.F=function(d){return fb(this.m,d)};c.prototype.s=function(){return b.F};return new c(a,b)};
bb.prototype.Ma=function(a,b){try{return this.i.apply(this,Array.prototype.slice.call(arguments,0))}catch(c){}};var fb=function(a,b){for(var c,d=0;d<b.length&&!(c=eb(a,b[d]),c instanceof qa);d++);return c},eb=function(a,b){try{var c=a.get(String(b[0]));if(!(c&&c instanceof bb))throw Error("Attempting to execute non-function "+b[0]+".");return c.i.apply(c,[a].concat(b.slice(1)))}catch(e){var d=a.s;d&&d(e,b.context?{id:b[0],line:b.context.line}:null);throw e;}};var gb=function(){ua.call(this)};ja(gb,ua);gb.prototype.sc=function(){return new k(wa(this))};/*
 jQuery v1.9.1 (c) 2005, 2012 jQuery Foundation, Inc. jquery.org/license. */
var hb=/\[object (Boolean|Number|String|Function|Array|Date|RegExp)\]/,ib=function(a){if(null==a)return String(a);var b=hb.exec(Object.prototype.toString.call(Object(a)));return b?b[1].toLowerCase():"object"},jb=function(a,b){return Object.prototype.hasOwnProperty.call(Object(a),b)},kb=function(a){if(!a||"object"!=ib(a)||a.nodeType||a==a.window)return!1;try{if(a.constructor&&!jb(a,"constructor")&&!jb(a.constructor.prototype,"isPrototypeOf"))return!1}catch(c){return!1}for(var b in a);return void 0===
b||jb(a,b)},E=function(a,b){var c=b||("array"==ib(a)?[]:{}),d;for(d in a)if(jb(a,d)){var e=a[d];"array"==ib(e)?("array"!=ib(c[d])&&(c[d]=[]),c[d]=E(e,c[d])):kb(e)?(kb(c[d])||(c[d]={}),c[d]=E(e,c[d])):c[d]=e}return c};var mb=function(a,b,c){var d=[],e=[],f=function(h,l){for(var n=wa(h),m=0;m<n.length;m++)l[n[m]]=g(h.get(n[m]))},g=function(h){var l=Ia(d,h);if(-1<l)return e[l];if(h instanceof k){var n=[];d.push(h);e.push(n);for(var m=h.sc(),q=0;q<m.length();q++)n[m.get(q)]=g(h.get(m.get(q)));return n}if(h instanceof gb){var t={};d.push(h);e.push(t);f(h,t);return t}if(h instanceof bb){var r=function(){for(var u=Array.prototype.slice.call(arguments,0),v=0;v<u.length;v++)u[v]=lb(u[v],b);var w=b?b.F:za(),y=new Ba(w);
b&&(y.a=b.a);return g(h.i.apply(h,[y].concat(u)))};d.push(h);e.push(r);f(h,r);return r}switch(typeof h){case "boolean":case "number":case "string":case "undefined":return h;case "object":if(null===h)return null;default:if(c)return c(h,b)}};return g(a)},lb=function(a,b,c){var d=[],e=[],f=function(h,l){for(var n in h)h.hasOwnProperty(n)&&l.set(n,g(h[n]))},g=function(h){var l=Ia(d,h);if(-1<l)return e[l];if(Ha(h)||Oa(h)){var n=new k([]);d.push(h);e.push(n);for(var m in h)h.hasOwnProperty(m)&&n.set(m,
g(h[m]));return n}if(kb(h)){var q=new gb;d.push(h);e.push(q);f(h,q);return q}if("function"===typeof h){var t=new bb("",function(u){for(var v=Array.prototype.slice.call(arguments,0),w=0;w<v.length;w++)v[w]=mb(this.a(v[w]),b);return g((0,this.m.O)(h,h,v))});d.push(h);e.push(t);f(h,t);return t}var r=typeof h;if(null===h||"string"===r||"number"===r||"boolean"===r)return h;if(void 0!==h&&c)return c(h,b)};return g(a)};var nb={control:function(a,b){return new qa(a,this.a(b))},fn:function(a,b,c){var d=this.m,e=this.a(b);if(!(e instanceof k))throw Error("Error: non-List value given for Fn argument names.");var f=Array.prototype.slice.call(arguments,2);this.s().Ia(a.length+f.length);return new bb(a,function(){return function(g){var h=Da(d);void 0===h.a&&(h.a=this.m.a);for(var l=Array.prototype.slice.call(arguments,0),n=0;n<l.length;n++)if(l[n]=this.a(l[n]),l[n]instanceof qa)return l[n];for(var m=e.get("length"),q=
0;q<m;q++)q<l.length?h.add(e.get(q),l[q]):h.add(e.get(q),void 0);h.add("arguments",new k(l));var t=fb(h,f);if(t instanceof qa)return"return"===t.a?t.i:t}}())},list:function(a){var b=this.s();b.Ia(arguments.length);for(var c=new k,d=0;d<arguments.length;d++){var e=this.a(arguments[d]);"string"===typeof e&&b.Ia(e.length?e.length-1:0);c.push(e)}return c},map:function(a){for(var b=this.s(),c=new gb,d=0;d<arguments.length-1;d+=2){var e=this.a(arguments[d])+"",f=this.a(arguments[d+1]),g=e.length;g+="string"===
typeof f?f.length:1;b.Ia(g);c.set(e,f)}return c},undefined:function(){}};var ob=function(){this.m=za();this.a=new Ba(this.m)},pb=function(a,b,c){var d=new bb(b,c);d.m=!0;a.a.set(b,d)};ob.prototype.nc=function(a,b){var c=Array.prototype.slice.call(arguments,0);return this.i(c)};ob.prototype.i=function(a){for(var b,c=0;c<arguments.length;c++)b=eb(this.a,arguments[c]);return b};ob.prototype.s=function(a,b){var c=Da(this.a);c.a=a;for(var d,e=1;e<arguments.length;e++)d=d=eb(c,arguments[e]);return d};var rb=function(a){if(a instanceof rb)return a;this.qa=a};rb.prototype.toString=function(){return String(this.qa)};var sb=function(a,b){return mb(a,b,function(c){})},tb=function(a,b){var c=void 0;return lb(a,b,c)};var ub=function(a){for(var b=[],c=0;c<a.length();c++)a.has(c)&&(b[c]=a.get(c));return b};var vb={supportedMethods:"concat every filter forEach hasOwnProperty indexOf join lastIndexOf map pop push reduce reduceRight reverse shift slice some sort splice unshift toString".split(" "),concat:function(a,b){for(var c=[],d=0;d<this.length();d++)c.push(this.get(d));for(var e=1;e<arguments.length;e++)if(arguments[e]instanceof k)for(var f=arguments[e],g=0;g<f.length();g++)c.push(f.get(g));else c.push(arguments[e]);return new k(c)},every:function(a,b){for(var c=this.length(),d=0;d<this.length()&&
d<c;d++)if(this.has(d)&&!b.i(a,this.get(d),d,this))return!1;return!0},filter:function(a,b){for(var c=this.length(),d=[],e=0;e<this.length()&&e<c;e++)this.has(e)&&b.i(a,this.get(e),e,this)&&d.push(this.get(e));return new k(d)},forEach:function(a,b){for(var c=this.length(),d=0;d<this.length()&&d<c;d++)this.has(d)&&b.i(a,this.get(d),d,this)},hasOwnProperty:function(a,b){return this.has(b)},indexOf:function(a,b,c){var d=this.length(),e=void 0===c?0:Number(c);0>e&&(e=Math.max(d+e,0));for(var f=e;f<d;f++)if(this.has(f)&&
this.get(f)===b)return f;return-1},join:function(a,b){for(var c=[],d=0;d<this.length();d++)c.push(this.get(d));return c.join(b)},lastIndexOf:function(a,b,c){var d=this.length(),e=d-1;void 0!==c&&(e=0>c?d+c:Math.min(c,e));for(var f=e;0<=f;f--)if(this.has(f)&&this.get(f)===b)return f;return-1},map:function(a,b){for(var c=this.length(),d=[],e=0;e<this.length()&&e<c;e++)this.has(e)&&(d[e]=b.i(a,this.get(e),e,this));return new k(d)},pop:function(){return this.pop()},push:function(a,b){return this.push.apply(this,
Array.prototype.slice.call(arguments,1))},reduce:function(a,b,c){var d=this.length(),e,f=0;if(void 0!==c)e=c;else{if(0==d)throw Error("TypeError: Reduce on List with no elements.");for(var g=0;g<d;g++)if(this.has(g)){e=this.get(g);f=g+1;break}if(g==d)throw Error("TypeError: Reduce on List with no elements.");}for(var h=f;h<d;h++)this.has(h)&&(e=b.i(a,e,this.get(h),h,this));return e},reduceRight:function(a,b,c){var d=this.length(),e,f=d-1;if(void 0!==c)e=c;else{if(0==d)throw Error("TypeError: ReduceRight on List with no elements.");
for(var g=1;g<=d;g++)if(this.has(d-g)){e=this.get(d-g);f=d-(g+1);break}if(g>d)throw Error("TypeError: ReduceRight on List with no elements.");}for(var h=f;0<=h;h--)this.has(h)&&(e=b.i(a,e,this.get(h),h,this));return e},reverse:function(){for(var a=ub(this),b=a.length-1,c=0;0<=b;b--,c++)a.hasOwnProperty(b)?this.set(c,a[b]):ya(this,c);return this},shift:function(){return this.shift()},slice:function(a,b,c){var d=this.length();void 0===b&&(b=0);b=0>b?Math.max(d+b,0):Math.min(b,d);c=void 0===c?d:0>c?
Math.max(d+c,0):Math.min(c,d);c=Math.max(b,c);for(var e=[],f=b;f<c;f++)e.push(this.get(f));return new k(e)},some:function(a,b){for(var c=this.length(),d=0;d<this.length()&&d<c;d++)if(this.has(d)&&b.i(a,this.get(d),d,this))return!0;return!1},sort:function(a,b){var c=ub(this);void 0===b?c.sort():c.sort(function(e,f){return Number(b.i(a,e,f))});for(var d=0;d<c.length;d++)c.hasOwnProperty(d)?this.set(d,c[d]):ya(this,d)},splice:function(a,b,c,d){return this.splice.apply(this,Array.prototype.splice.call(arguments,
1,arguments.length-1))},toString:function(){return this.toString()},unshift:function(a,b){return this.unshift.apply(this,Array.prototype.slice.call(arguments,1))}};var wb="charAt concat indexOf lastIndexOf match replace search slice split substring toLowerCase toLocaleLowerCase toString toUpperCase toLocaleUpperCase trim".split(" "),xb=new qa("break"),yb=new qa("continue"),zb=function(a,b){return this.a(a)+this.a(b)},Ab=function(a,b){return this.a(a)&&this.a(b)},Db=function(a,b,c){a=this.a(a);b=this.a(b);c=this.a(c);if(!(c instanceof k))throw Error("Error: Non-List argument given to Apply instruction.");if(null===a||void 0===a)throw Error("TypeError: Can't read property "+
b+" of "+a+".");if("boolean"==typeof a||"number"==typeof a){if("toString"==b)return a.toString();throw Error("TypeError: "+a+"."+b+" is not a function.");}if("string"==typeof a){if(0<=Ia(wb,b))return tb(a[b].apply(a,ub(c)),this.m);throw Error("TypeError: "+b+" is not a function");}if(a instanceof k){if(a.has(b)){var d=a.get(b);if(d instanceof bb){var e=ub(c);e.unshift(this.m);return d.i.apply(d,e)}throw Error("TypeError: "+b+" is not a function");}if(0<=Ia(vb.supportedMethods,b)){var f=ub(c);f.unshift(this.m);
return vb[b].apply(a,f)}}if(a instanceof bb||a instanceof gb){if(a.has(b)){var g=a.get(b);if(g instanceof bb){var h=ub(c);h.unshift(this.m);return g.i.apply(g,h)}throw Error("TypeError: "+b+" is not a function");}if("toString"==b)return a instanceof bb?a.a:a.toString();if("hasOwnProperty"==b)return a.has.apply(a,ub(c))}if(a instanceof rb&&"toString"===b)return a.toString();throw Error("TypeError: Object has no '"+b+"' property.");},Eb=function(a,b){a=this.a(a);if("string"!=typeof a)throw Error("Invalid key name given for assignment.");
var c=this.m;if(!c.has(a))throw Error("Attempting to assign to undefined value "+b);var d=this.a(b);c.set(a,d);return d},Fb=function(a){var b=Da(this.m),c=fb(b,Array.prototype.slice.apply(arguments));if(c instanceof qa)return c},Gb=function(){return xb},Hb=function(a){for(var b=this.a(a),c=0;c<b.length;c++){var d=this.a(b[c]);if(d instanceof qa)return d}},Ib=function(a){for(var b=this.m,c=0;c<arguments.length-1;c+=2){var d=arguments[c];if("string"===typeof d){var e=this.a(arguments[c+1]);Ca(b,d,e,
!0)}}},Jb=function(){return yb},Kb=function(a,b,c){var d=new k;b=this.a(b);for(var e=0;e<b.length;e++)d.push(b[e]);var f=[51,a,d].concat(Array.prototype.splice.call(arguments,2,arguments.length-2));this.m.add(a,this.a(f))},Lb=function(a,b){return this.a(a)/this.a(b)},Mb=function(a,b){a=this.a(a);b=this.a(b);var c=a instanceof rb,d=b instanceof rb;return c||d?c&&d?a.qa==b.qa:!1:a==b},Nb=function(a){for(var b,c=0;c<arguments.length;c++)b=this.a(arguments[c]);return b};
function Ob(a,b,c){if("string"==typeof b)for(var d=0;d<b.length;d++){var e=a(d),f=fb(e,c);if(f instanceof qa){if("break"==f.a)break;if("return"==f.a)return f}}else if(b instanceof gb||b instanceof k||b instanceof bb)for(var g=b.sc(),h=g.length(),l=0;l<h;l++){var n=a(g.get(l)),m=fb(n,c);if(m instanceof qa){if("break"==m.a)break;if("return"==m.a)return m}}}
var Pb=function(a,b,c){a=this.a(a);b=this.a(b);c=this.a(c);var d=this.m;return Ob(function(e){d.set(a,e);return d},b,c)},Qb=function(a,b,c){a=this.a(a);b=this.a(b);c=this.a(c);var d=this.m;return Ob(function(e){var f=Da(d);Ca(f,a,e,!0);return f},b,c)},Rb=function(a,b,c){a=this.a(a);b=this.a(b);c=this.a(c);var d=this.m;return Ob(function(e){var f=Da(d);f.add(a,e);return f},b,c)},Ub=function(a){return this.m.get(this.a(a))},Vb=function(a,b){var c;a=this.a(a);b=this.a(b);if(void 0===a||null===a)throw Error("TypeError: cannot access property of "+
a+".");if(a instanceof gb||a instanceof k||a instanceof bb)c=a.get(b);else if("string"==typeof a)"length"==b?c=a.length:sa(b)&&(c=a[b]);else if(a instanceof rb)return;return c},Wb=function(a,b){return this.a(a)>this.a(b)},Xb=function(a,b){return this.a(a)>=this.a(b)},Yb=function(a,b){a=this.a(a);b=this.a(b);a instanceof rb&&(a=a.qa);b instanceof rb&&(b=b.qa);return a===b},Zb=function(a,b){return!Yb.call(this,a,b)},$b=function(a,b,c){var d=[];this.a(a)?d=this.a(b):c&&(d=this.a(c));var e=this.F(d);
if(e instanceof qa)return e},ac=function(a,b){return this.a(a)<this.a(b)},bc=function(a,b){return this.a(a)<=this.a(b)},cc=function(a,b){return this.a(a)%this.a(b)},dc=function(a,b){return this.a(a)*this.a(b)},ec=function(a){return-this.a(a)},fc=function(a){return!this.a(a)},gc=function(a,b){return!Mb.call(this,a,b)},hc=function(){return null},ic=function(a,b){return this.a(a)||this.a(b)},jc=function(a,b){var c=this.a(a);this.a(b);return c},kc=function(a){return this.a(a)},lc=function(a){return Array.prototype.slice.apply(arguments)},
mc=function(a){return new qa("return",this.a(a))},nc=function(a,b,c){a=this.a(a);b=this.a(b);c=this.a(c);if(null===a||void 0===a)throw Error("TypeError: Can't set property "+b+" of "+a+".");(a instanceof bb||a instanceof k||a instanceof gb)&&a.set(b,c);return c},oc=function(a,b){return this.a(a)-this.a(b)},pc=function(a,b,c){a=this.a(a);var d=this.a(b),e=this.a(c);if(!Ha(d)||!Ha(e))throw Error("Error: Malformed switch instruction.");for(var f,g=!1,h=0;h<d.length;h++)if(g||a===this.a(d[h]))if(f=this.a(e[h]),
f instanceof qa){var l=f.a;if("break"==l)return;if("return"==l||"continue"==l)return f}else g=!0;if(e.length==d.length+1&&(f=this.a(e[e.length-1]),f instanceof qa&&("return"==f.a||"continue"==f.a)))return f},qc=function(a,b,c){return this.a(a)?this.a(b):this.a(c)},rc=function(a){a=this.a(a);return a instanceof bb?"function":typeof a},sc=function(a){for(var b=this.m,c=0;c<arguments.length;c++){var d=arguments[c];"string"!=typeof d||b.add(d,void 0)}},tc=function(a,b,c,d){var e,f=this.a(d);if(this.a(c)&&
(e=this.F(f),e instanceof qa)){if("break"==e.a)return;if("return"==e.a)return e}for(;this.a(a);){e=this.F(f);if(e instanceof qa){if("break"==e.a)break;if("return"==e.a)return e}this.a(b)}},uc=function(a){return~Number(this.a(a))},vc=function(a,b){return Number(this.a(a))<<Number(this.a(b))},wc=function(a,b){return Number(this.a(a))>>Number(this.a(b))},xc=function(a,b){return Number(this.a(a))>>>Number(this.a(b))},Bc=function(a,b){return Number(this.a(a))&Number(this.a(b))},Cc=function(a,b){return Number(this.a(a))^
Number(this.a(b))},Dc=function(a,b){return Number(this.a(a))|Number(this.a(b))};var Fc=function(){this.a=new ob;Ec(this)};Fc.prototype.nc=function(a){return Gc(this.a.i(a))};
var Ic=function(a,b){return Gc(Hc.a.s(a,b))},Ec=function(a){var b=function(d,e){var f=a.a,g=String(e);nb.hasOwnProperty(d)&&pb(f,g||d,nb[d])};b("control",49);b("fn",51);b("list",7);b("map",8);b("undefined",44);var c=function(d,e){pb(a.a,String(d),e)};c(0,zb);c(1,Ab);c(2,Db);c(3,Eb);c(53,Fb);c(4,Gb);c(5,Hb);c(52,Ib);c(6,Jb);c(9,Hb);c(50,Kb);c(10,Lb);c(12,Mb);c(13,Nb);c(47,Pb);c(54,Qb);c(55,Rb);c(15,Ub);c(16,Vb);c(17,Vb);c(18,Wb);c(19,Xb);c(20,Yb);c(21,Zb);c(22,$b);c(23,ac);c(24,bc);c(25,cc);c(26,dc);
c(27,ec);c(28,fc);c(29,gc);c(45,hc);c(30,ic);c(32,jc);c(33,jc);c(34,kc);c(35,kc);c(46,lc);c(36,mc);c(43,nc);c(37,oc);c(38,pc);c(39,qc);c(40,rc);c(41,sc);c(42,tc);c(58,uc);c(57,vc);c(60,wc);c(61,xc);c(56,Bc);c(62,Cc);c(59,Dc)},Kc=function(){var a=Hc,b=Jc();pb(a.a,"require",b)},Lc=function(a,b){a.a.a.O=b};function Gc(a){if(a instanceof qa||a instanceof bb||a instanceof k||a instanceof gb||null===a||void 0===a||"string"===typeof a||"number"===typeof a||"boolean"===typeof a)return a};
var Mc=[],Nc={"\x00":"&#0;",'"':"&quot;","&":"&amp;","'":"&#39;","<":"&lt;",">":"&gt;","\t":"&#9;","\n":"&#10;","\x0B":"&#11;","\f":"&#12;","\r":"&#13;"," ":"&#32;","-":"&#45;","/":"&#47;","=":"&#61;","`":"&#96;","\u0085":"&#133;","\u00a0":"&#160;","\u2028":"&#8232;","\u2029":"&#8233;"},Oc=function(a){return Nc[a]},Pc=/[\x00\x22\x26\x27\x3c\x3e]/g;Mc[3]=function(a){return String(a).replace(Pc,Oc)};var Tc=/[\x00\x08-\x0d\x22\x26\x27\/\x3c-\x3e\\\x85\u2028\u2029]/g,Uc={"\x00":"\\x00","\b":"\\x08","\t":"\\t","\n":"\\n","\x0B":"\\x0b",
"\f":"\\f","\r":"\\r",'"':"\\x22","&":"\\x26","'":"\\x27","/":"\\/","<":"\\x3c","=":"\\x3d",">":"\\x3e","\\":"\\\\","\u0085":"\\x85","\u2028":"\\u2028","\u2029":"\\u2029",$:"\\x24","(":"\\x28",")":"\\x29","*":"\\x2a","+":"\\x2b",",":"\\x2c","-":"\\x2d",".":"\\x2e",":":"\\x3a","?":"\\x3f","[":"\\x5b","]":"\\x5d","^":"\\x5e","{":"\\x7b","|":"\\x7c","}":"\\x7d"},Vc=function(a){return Uc[a]};Mc[7]=function(a){return String(a).replace(Tc,Vc)};
Mc[8]=function(a){if(null==a)return" null ";switch(typeof a){case "boolean":case "number":return" "+a+" ";default:return"'"+String(String(a)).replace(Tc,Vc)+"'"}};var ad=/['()]/g,bd=function(a){return"%"+a.charCodeAt(0).toString(16)};Mc[12]=function(a){var b=
encodeURIComponent(String(a));ad.lastIndex=0;return ad.test(b)?b.replace(ad,bd):b};var cd=/[\x00- \x22\x27-\x29\x3c\x3e\\\x7b\x7d\x7f\x85\xa0\u2028\u2029\uff01\uff03\uff04\uff06-\uff0c\uff0f\uff1a\uff1b\uff1d\uff1f\uff20\uff3b\uff3d]/g,dd={"\x00":"%00","\u0001":"%01","\u0002":"%02","\u0003":"%03","\u0004":"%04","\u0005":"%05","\u0006":"%06","\u0007":"%07","\b":"%08","\t":"%09","\n":"%0A","\x0B":"%0B","\f":"%0C","\r":"%0D","\u000e":"%0E","\u000f":"%0F","\u0010":"%10",
"\u0011":"%11","\u0012":"%12","\u0013":"%13","\u0014":"%14","\u0015":"%15","\u0016":"%16","\u0017":"%17","\u0018":"%18","\u0019":"%19","\u001a":"%1A","\u001b":"%1B","\u001c":"%1C","\u001d":"%1D","\u001e":"%1E","\u001f":"%1F"," ":"%20",'"':"%22","'":"%27","(":"%28",")":"%29","<":"%3C",">":"%3E","\\":"%5C","{":"%7B","}":"%7D","\u007f":"%7F","\u0085":"%C2%85","\u00a0":"%C2%A0","\u2028":"%E2%80%A8","\u2029":"%E2%80%A9","\uff01":"%EF%BC%81","\uff03":"%EF%BC%83","\uff04":"%EF%BC%84","\uff06":"%EF%BC%86",
"\uff07":"%EF%BC%87","\uff08":"%EF%BC%88","\uff09":"%EF%BC%89","\uff0a":"%EF%BC%8A","\uff0b":"%EF%BC%8B","\uff0c":"%EF%BC%8C","\uff0f":"%EF%BC%8F","\uff1a":"%EF%BC%9A","\uff1b":"%EF%BC%9B","\uff1d":"%EF%BC%9D","\uff1f":"%EF%BC%9F","\uff20":"%EF%BC%A0","\uff3b":"%EF%BC%BB","\uff3d":"%EF%BC%BD"},ed=function(a){return dd[a]};var gd=
/^(?:(?:https?|mailto):|[^&:\/?#]*(?:[\/?#]|$))/i;Mc[14]=function(a){var b=String(a);return gd.test(b)?b.replace(cd,ed):"#zSoyz"};Mc[16]=function(a){return a};var hd;
var id=[],jd=[],kd=[],ld=[],md=[],nd={},od,pd,qd,rd=function(a,b){var c={};c["function"]="__"+a;for(var d in b)b.hasOwnProperty(d)&&(c["vtp_"+d]=b[d]);return c},sd=function(a,b){var c=a["function"];if(!c)throw Error("Error: No function name given for function call.");var d=nd[c],e={},f;for(f in a)a.hasOwnProperty(f)&&0===f.indexOf("vtp_")&&(e[void 0!==d?f:f.substr(4)]=a[f]);return void 0!==d?d(e):hd(c,e,b)},ud=function(a,b,c){c=c||[];var d={},e;for(e in a)a.hasOwnProperty(e)&&(d[e]=td(a[e],b,c));
return d},vd=function(a){var b=a["function"];if(!b)throw"Error: No function name given for function call.";var c=nd[b];return c?c.priorityOverride||0:0},td=function(a,b,c){if(Ha(a)){var d;switch(a[0]){case "function_id":return a[1];case "list":d=[];for(var e=1;e<a.length;e++)d.push(td(a[e],b,c));return d;case "macro":var f=a[1];if(c[f])return;var g=id[f];if(!g||b.od(g))return;c[f]=!0;try{var h=ud(g,b,c);h.vtp_gtmEventId=b.id;d=sd(h,b);qd&&(d=qd.Dg(d,h))}catch(y){b.Ke&&b.Ke(y,Number(f)),d=!1}c[f]=
!1;return d;case "map":d={};for(var l=1;l<a.length;l+=2)d[td(a[l],b,c)]=td(a[l+1],b,c);return d;case "template":d=[];for(var n=!1,m=1;m<a.length;m++){var q=td(a[m],b,c);pd&&(n=n||q===pd.Yb);d.push(q)}return pd&&n?pd.Gg(d):d.join("");case "escape":d=td(a[1],b,c);if(pd&&Ha(a[1])&&"macro"===a[1][0]&&pd.jh(a))return pd.Fh(d);d=String(d);for(var t=2;t<a.length;t++)Mc[a[t]]&&(d=Mc[a[t]](d));return d;case "tag":var r=a[1];if(!ld[r])throw Error("Unable to resolve tag reference "+r+".");return d={we:a[2],
index:r};case "zb":var u={arg0:a[2],arg1:a[3],ignore_case:a[5]};u["function"]=a[1];var v=wd(u,b,c),w=!!a[4];return w||2!==v?w!==(1===v):null;default:throw Error("Attempting to expand unknown Value type: "+a[0]+".");}}return a},wd=function(a,b,c){try{return od(ud(a,b,c))}catch(d){JSON.stringify(a)}return 2};var xd=function(){var a=function(b){return{toString:function(){return b}}};return{Pd:a("convert_case_to"),Qd:a("convert_false_to"),Rd:a("convert_null_to"),Sd:a("convert_true_to"),Td:a("convert_undefined_to"),gi:a("debug_mode_metadata"),Sa:a("function"),yf:a("instance_name"),Cf:a("live_only"),Ef:a("malware_disabled"),Ff:a("metadata"),ii:a("original_vendor_template_id"),Jf:a("once_per_event"),Wd:a("once_per_load"),$d:a("setup_tags"),ae:a("tag_id"),be:a("teardown_tags")}}();var yd=function(a,b,c){var d;d=Error.call(this);this.message=d.message;"stack"in d&&(this.stack=d.stack);this.i=a;this.a=c};ja(yd,Error);function zd(a,b){if(Ha(a)){Object.defineProperty(a,"context",{value:{line:b[0]}});for(var c=1;c<a.length;c++)zd(a[c],b[c])}};var Ad=function(a,b){var c;c=Error.call(this);this.message=c.message;"stack"in c&&(this.stack=c.stack);this.m=a;this.i=b;this.a=[]};ja(Ad,Error);var Bd=function(a){var b=a.a.slice();a.i&&(b=a.i(b));return b};var Dd=function(){return function(a,b){a instanceof Ad||(a=new Ad(a,Cd));b&&a.a.push(b);throw a;}};function Cd(a){if(!a.length)return a;a.push({id:"main",line:0});for(var b=a.length-1;0<b;b--)Ga(a[b].id)&&a.splice(b++,1);for(var c=a.length-1;0<c;c--)a[c].line=a[c-1].line;a.splice(0,1);return a};var Ed=null,Hd=function(a){function b(q){for(var t=0;t<q.length;t++)d[q[t]]=!0}var c=[],d=[];Ed=Fd(a);for(var e=0;e<jd.length;e++){var f=jd[e],g=Gd(f);if(g){for(var h=f.add||[],l=0;l<h.length;l++)c[h[l]]=!0;b(f.block||[])}else null===g&&b(f.block||[])}for(var n=[],m=0;m<ld.length;m++)c[m]&&!d[m]&&(n[m]=!0);return n},Gd=function(a){for(var b=a["if"]||[],c=0;c<b.length;c++){var d=Ed(b[c]);if(0===d)return!1;if(2===d)return null}for(var e=a.unless||[],f=0;f<e.length;f++){var g=Ed(e[f]);if(2===g)return null;
if(1===g)return!1}return!0},Fd=function(a){var b=[];return function(c){void 0===b[c]&&(b[c]=wd(kd[c],a));return b[c]}};var Id={Dg:function(a,b){b[xd.Pd]&&"string"===typeof a&&(a=1==b[xd.Pd]?a.toLowerCase():a.toUpperCase());b.hasOwnProperty(xd.Rd)&&null===a&&(a=b[xd.Rd]);b.hasOwnProperty(xd.Td)&&void 0===a&&(a=b[xd.Td]);b.hasOwnProperty(xd.Sd)&&!0===a&&(a=b[xd.Sd]);b.hasOwnProperty(xd.Qd)&&!1===a&&(a=b[xd.Qd]);return a}};var Jd=function(){this.a={}};function Kd(a,b,c,d){if(a)for(var e=0;e<a.length;e++){var f=void 0,g="A policy function denied the permission request";try{f=a[e].call(void 0,b,c,d),g+="."}catch(h){g="string"===typeof h?g+(": "+h):h instanceof Error?g+(": "+h.message):g+"."}if(!f)throw new yd(c,d,g);}}function Ld(a,b,c){return function(){var d=arguments[0];if(d){var e=a.a[d],f=a.a.all;if(e||f){var g=c.apply(void 0,Array.prototype.slice.call(arguments,0));Kd(e,b,d,g);Kd(f,b,d,g)}}}};var Pd=function(a){var b=Md.C,c=this;this.i=new Jd;this.a={};var d={},e=Ld(this.i,b,function(){var f=arguments[0];return f&&d[f]?d[f].apply(void 0,Array.prototype.slice.call(arguments,0)):{}});Na(a,function(f,g){var h={};Na(g,function(l,n){var m=Nd(l,n);h[l]=m.assert;d[l]||(d[l]=m.J)});c.a[f]=function(l,n){var m=h[l];if(!m)throw Od(l,{},"The requested permission "+l+" is not configured.");var q=Array.prototype.slice.call(arguments,0);m.apply(void 0,q);e.apply(void 0,q)}})},Rd=function(a){return Qd.a[a]||
function(){}};function Nd(a,b){var c=rd(a,b);c.vtp_permissionName=a;c.vtp_createPermissionError=Od;try{return sd(c)}catch(d){return{assert:function(e){throw new yd(e,{},"Permission "+e+" is unknown.");},J:function(){for(var e={},f=0;f<arguments.length;++f)e["arg"+(f+1)]=arguments[f];return e}}}}function Od(a,b,c){return new yd(a,b,c)};var Sd=!1;var Td={};Td.bi=Qa('');Td.Mg=Qa('');var Ud=Sd,Vd=Td.Mg,Wd=Td.bi;
var me=function(a,b){return a.length&&b.length&&a.lastIndexOf(b)===a.length-b.length},ne=function(a,b){var c="*"===b.charAt(b.length-1)||"/"===b||"/*"===b;me(b,"/*")&&(b=b.slice(0,-2));me(b,"?")&&(b=b.slice(0,-1));var d=b.split("*");if(!c&&1===d.length)return a===d[0];for(var e=-1,f=0;f<d.length;f++){var g=d[f];if(g){e=a.indexOf(g,e);if(-1===e||0===f&&0!==e)return!1;e+=g.length}}if(c||e===a.length)return!0;var h=d[d.length-1];return a.lastIndexOf(h)===a.length-h.length},oe=/^[a-z0-9-]+$/i,pe=/^https:\/\/(\*\.|)((?:[a-z0-9-]+\.)+[a-z0-9-]+)\/(.*)$/i,
re=function(a,b){var c;if(!(c=!qe(a))){var d;a:{var e=a.hostname.split(".");if(2>e.length)d=!1;else{for(var f=0;f<e.length;f++)if(!oe.exec(e[f])){d=!1;break a}d=!0}}c=!d}if(c)return!1;for(var g=0;g<b.length;g++){var h;var l=a,n=b[g];if(!pe.exec(n))throw Error("Invalid Wildcard");var m=n.slice(8),q=m.slice(0,m.indexOf("/")),t;var r=l.hostname,u=q;if(0!==u.indexOf("*."))t=r.toLowerCase()===u.toLowerCase();else{u=u.slice(2);var v=r.toLowerCase().indexOf(u.toLowerCase());t=-1===v?!1:r.length===u.length?
!0:r.length!==u.length+v?!1:"."===r[v-1]}if(t){var w=m.slice(m.indexOf("/"));h=ne(l.pathname+l.search,w)?!0:!1}else h=!1;if(h)return!0}return!1},qe=function(a){return"https:"===a.protocol&&(!a.port||"443"===a.port)};/*
 Copyright (c) 2014 Derek Brans, MIT license https://github.com/krux/postscribe/blob/master/LICENSE. Portions derived from simplehtmlparser, which is licensed under the Apache License, Version 2.0 */
var ue=/^([a-z][a-z0-9]*):(!|\?)(\*|string|boolean|number|Fn|DustMap|List|OpaqueValue)$/i,ve={Fn:"function",DustMap:"Object",List:"Array"},F=function(a,b,c){for(var d=0;d<b.length;d++){var e=ue.exec(b[d]);if(!e)throw Error("Internal Error in "+a);var f=e[1],g="!"===e[2],h=e[3],l=c[d],n=typeof l;if(null===l||"undefined"===n){if(g)throw Error("Error in "+a+". Required argument "+f+" not supplied.");}else if("*"!==h){var m=typeof l;l instanceof bb?m="Fn":l instanceof k?m="List":l instanceof gb?m="DustMap":
l instanceof rb&&(m="OpaqueValue");if(m!=h)throw Error("Error in "+a+". Argument "+f+" has type "+m+", which does not match required type "+(ve[h]||h)+".");}}};function we(a){return""+a}
function xe(a,b){var c=[];return c};var ye=function(a,b){var c=new bb(a,function(){for(var d=Array.prototype.slice.call(arguments,0),e=0;e<d.length;e++)d[e]=this.a(d[e]);return b.apply(this,d)});c.m=!0;return c},ze=function(a,b){var c=new gb,d;for(d in b)if(b.hasOwnProperty(d)){var e=b[d];Fa(e)?c.set(d,ye(a+"_"+d,e)):(Ga(e)||p(e)||"boolean"==typeof e)&&c.set(d,e)}c.m=!0;return c};var Ae=function(a,b){F(this.i.a,["apiName:!string","message:?string"],arguments);var c={},d=new gb;return d=ze("AssertApiSubject",c)};var Be=function(a,b){F(this.i.a,["actual:?*","message:?string"],arguments);var c={},d=new gb;return d=ze("AssertThatSubject",c)};function Ce(a){return function(){for(var b=[],c=this.m,d=0;d<arguments.length;++d)b.push(sb(arguments[d],c));return tb(a.apply(null,b))}}var Ee=function(){for(var a=Math,b=De,c={},d=0;d<b.length;d++){var e=b[d];a.hasOwnProperty(e)&&(c[e]=Ce(a[e].bind(a)))}return c};var Fe=function(a){var b;return b};var Ge=function(a){var b;return b};var He=function(a){F(this.i.a,["uri:!string"],arguments);return encodeURI(a)};var Ie=function(a){F(this.i.a,["uri:!string"],arguments);return encodeURIComponent(a)};var Je=function(a){F(this.i.a,["message:?string"],arguments);};var Ke=function(a,b){F(this.i.a,["min:!number","max:!number"],arguments);return Ka(a,b)};var Le=function(a,b,c){var d=a.m.a;if(!d)throw Error("Missing program state.");d.mg.apply(null,Array.prototype.slice.call(arguments,1))};var Me=function(){Le(this,"read_container_data");var a=new gb;a.set("containerId",'GTM-WJZQSJF');a.set("version",'220');a.set("environmentName",'');a.set("debugMode",Ud);a.set("previewMode",Wd);a.set("environmentMode",Vd);a.m=!0;return a};var Ne=function(){return(new Date).getTime()};var Oe=function(a){if(null===a)return"null";if(a instanceof k)return"array";if(a instanceof bb)return"function";if(a instanceof rb){a=a.qa;if(void 0===a.constructor||void 0===a.constructor.name){var b=String(a);return b.substring(8,b.length-1)}return String(a.constructor.name)}return typeof a};var Pe=function(a){function b(c){return function(d){try{return c(d)}catch(e){(Ud||Wd)&&a.call(this,e.message)}}}return{parse:b(function(c){return tb(JSON.parse(c))}),stringify:b(function(c){return JSON.stringify(sb(c))})}};var Qe=function(a){return Pa(sb(a,this.m))};var Re=function(a){return Number(sb(a,this.m))};var Se=function(a){return null===a?"null":void 0===a?"undefined":a.toString()};var Te=function(a,b,c){var d=null,e=!1;return e?d:null};var De="floor ceil round max min abs pow sqrt".split(" ");var Ue=function(){var a={};return{Vg:function(b){return a.hasOwnProperty(b)?a[b]:void 0},Wh:function(b,c){a[b]=c},reset:function(){a={}}}},Ve=function(a,b){F(this.i.a,["apiName:!string","mock:?*"],arguments);};var We=function(){this.a={};this.i={}};We.prototype.get=function(a,b){var c=this.a.hasOwnProperty(a)?this.a[a]:void 0;return c};
We.prototype.add=function(a,b,c){if(this.a.hasOwnProperty(a))throw"Attempting to add a function which already exists: "+a+".";if(this.i.hasOwnProperty(a))throw"Attempting to add an API with an existing private API name: "+a+".";this.a[a]=c?void 0:Fa(b)?ye(a,b):ze(a,b)};
var Ye=function(a){var b=Xe;if(a.i.hasOwnProperty("getUserAgent"))throw"Attempting to add a private function which already exists: getUserAgent.";if(a.a.hasOwnProperty("getUserAgent"))throw"Attempting to add a private function with an existing API name: getUserAgent.";a.i.getUserAgent=Fa(b)?ye("getUserAgent",b):ze("getUserAgent",b)};function Ze(){var a={};return a};var H={ib:"_ee",$c:"_syn",li:"_uei",ji:"_pci",Kc:"event_callback",Xb:"event_timeout",ia:"gtag.config"};H.ja="allow_ad_personalization_signals";H.Wc="restricted_data_processing";H.qb="allow_google_signals";H.ka="cookie_expires";H.Tb="cookie_update";H.Eb="session_duration";H.oa="user_properties";H.Ga="transport_url";H.S="ads_data_redaction";H.o="ad_storage";
H.L="analytics_storage";H.nf="region";H.qf="wait_for_update";
H.bf=[H.ja,H.qb,H.Tb];H.df=[H.ka,H.Xb,H.Eb];var $e={},af=function(a,b){$e[a]=$e[a]||[];$e[a][b]=!0},bf=function(a){for(var b=[],c=$e[a]||[],d=0;d<c.length;d++)c[d]&&(b[Math.floor(d/6)]^=1<<d%6);for(var e=0;e<b.length;e++)b[e]="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(b[e]||0);return b.join("")};var I=function(a){af("GTM",a)};var cf=function(a){if(Error.captureStackTrace)Error.captureStackTrace(this,cf);else{var b=Error().stack;b&&(this.stack=b)}a&&(this.message=String(a))};oa(cf,Error);cf.prototype.name="CustomError";var df=function(a,b){for(var c=a.split("%s"),d="",e=c.length-1,f=0;f<e;f++)d+=c[f]+(f<b.length?b[f]:"%s");cf.call(this,d+c[e])};oa(df,cf);df.prototype.name="AssertionError";var ef=function(a,b){throw new df("Failure"+(a?": "+a:""),Array.prototype.slice.call(arguments,1));};var ff=function(a,b){var c=function(){};c.prototype=a.prototype;var d=new c;a.apply(d,Array.prototype.slice.call(arguments,1));return d};var gf;var hf=/^(?:(?:https?|mailto|ftp):|[^:/?#]*(?:[/?#]|$))/i;var jf;a:{var kf=la.navigator;if(kf){var lf=kf.userAgent;if(lf){jf=lf;break a}}jf=""}var nf=function(a){return-1!=jf.indexOf(a)};var pf=function(a,b,c){this.a=c===of?a:""};pf.prototype.toString=function(){return"SafeHtml{"+this.a+"}"};var qf=function(a){if(a instanceof pf&&a.constructor===pf)return a.a;var b=typeof a;ef("expected object of type SafeHtml, got '"+a+"' of type "+("object"!=b?b:a?Array.isArray(a)?"array":b:"null"));return"type_error:SafeHtml"},of={},rf=new pf(la.trustedTypes&&la.trustedTypes.emptyHTML||"",0,of);var sf={MATH:!0,SCRIPT:!0,STYLE:!0,SVG:!0,TEMPLATE:!0},tf=function(a){var b=!1,c;return function(){b||(c=a(),b=!0);return c}}(function(){if("undefined"===typeof document)return!1;var a=document.createElement("div"),b=document.createElement("div");b.appendChild(document.createElement("div"));a.appendChild(b);if(!a.firstChild)return!1;var c=a.firstChild.firstChild;a.innerHTML=qf(rf);return!c.parentElement}),uf=function(a,b){if(sf[a.tagName.toUpperCase()])throw Error("goog.dom.safe.setInnerHtml cannot be used to set content of "+
a.tagName+".");if(tf())for(;a.lastChild;)a.removeChild(a.lastChild);a.innerHTML=qf(b)};var vf=function(a){var b;if(void 0===gf){var c=null,d=la.trustedTypes;if(d&&d.createPolicy){try{c=d.createPolicy("goog#html",{createHTML:pa,createScript:pa,createScriptURL:pa})}catch(f){la.console&&la.console.error(f.message)}gf=c}else gf=c}var e=(b=gf)?b.createHTML(a):a;return new pf(e,null,of)};var C=window,K=document,wf=navigator,xf=K.currentScript&&K.currentScript.src,yf=function(a,b){var c=C[a];C[a]=void 0===c?b:c;return C[a]},zf=function(a,b){b&&(a.addEventListener?a.onload=b:a.onreadystatechange=function(){a.readyState in{loaded:1,complete:1}&&(a.onreadystatechange=null,b())})},Af=function(a,b,c){var d=K.createElement("script");d.type="text/javascript";d.async=!0;d.src=a;zf(d,b);c&&(d.onerror=c);var e;if(null===na)b:{var f=la.document,g=f.querySelector&&f.querySelector("script[nonce]");
if(g){var h=g.nonce||g.getAttribute("nonce");if(h&&ma.test(h)){na=h;break b}}na=""}e=na;e&&d.setAttribute("nonce",e);var l=K.getElementsByTagName("script")[0]||K.body||K.head;l.parentNode.insertBefore(d,l);return d},Bf=function(){if(xf){var a=xf.toLowerCase();if(0===a.indexOf("https://"))return 2;if(0===a.indexOf("http://"))return 3}return 1},Cf=function(a,b){var c=K.createElement("iframe");c.height="0";c.width="0";c.style.display="none";c.style.visibility="hidden";var d=K.body&&K.body.lastChild||
K.body||K.head;d.parentNode.insertBefore(c,d);zf(c,b);void 0!==a&&(c.src=a);return c},Df=function(a,b,c){var d=new Image(1,1);d.onload=function(){d.onload=null;b&&b()};d.onerror=function(){d.onerror=null;c&&c()};d.src=a;return d},Ef=function(a,b,c,d){a.addEventListener?a.addEventListener(b,c,!!d):a.attachEvent&&a.attachEvent("on"+b,c)},Ff=function(a,b,c){a.removeEventListener?a.removeEventListener(b,c,!1):a.detachEvent&&a.detachEvent("on"+b,c)},O=function(a){C.setTimeout(a,0)},Gf=function(a,b){return a&&
b&&a.attributes&&a.attributes[b]?a.attributes[b].value:null},Hf=function(a){var b=a.innerText||a.textContent||"";b&&" "!=b&&(b=b.replace(/^[\s\xa0]+|[\s\xa0]+$/g,""));b&&(b=b.replace(/(\xa0+|\s{2,}|\n|\r\t)/g," "));return b},If=function(a){var b=K.createElement("div");uf(b,vf("A<div>"+a+"</div>"));b=b.lastChild;for(var c=[];b.firstChild;)c.push(b.removeChild(b.firstChild));return c},Jf=function(a,b,c){c=c||100;for(var d={},e=0;e<b.length;e++)d[b[e]]=!0;for(var f=a,g=0;f&&g<=c;g++){if(d[String(f.tagName).toLowerCase()])return f;
f=f.parentElement}return null},Kf=function(a){wf.sendBeacon&&wf.sendBeacon(a)||Df(a)},Lf=function(a,b){var c=a[b];c&&"string"===typeof c.animVal&&(c=c.animVal);return c};var Mf={},Nf=function(a){return void 0==Mf[a]?!1:Mf[a]};var Of=[];function Pf(){var a=yf("google_tag_data",{});a.ics||(a.ics={entries:{},set:Qf,update:Rf,addListener:Sf,notifyListeners:Tf,active:!1});return a.ics}
function Qf(a,b,c,d,e,f){var g=Pf();g.active=!0;if(void 0!=b){var h=g.entries,l=h[a]||{},n=l.region,m=c&&p(c)?c.toUpperCase():void 0;d=d.toUpperCase();e=e.toUpperCase();if(m===e||(m===d?n!==e:!m&&!n)){var q=!!(f&&0<f&&void 0===l.update),t={region:m,initial:"granted"===b,update:l.update,quiet:q};h[a]=t;q&&C.setTimeout(function(){h[a]===t&&t.quiet&&(t.quiet=!1,Uf(a),Tf(),af("TAGGING",2))},f)}}}
function Rf(a,b){var c=Pf();c.active=!0;if(void 0!=b){var d=Vf(a),e=c.entries,f=e[a]=e[a]||{};f.update="granted"===b;var g=Vf(a);f.quiet?(f.quiet=!1,Uf(a)):g!==d&&Uf(a)}}function Sf(a,b){Of.push({pe:a,Qg:b})}function Uf(a){for(var b=0;b<Of.length;++b){var c=Of[b];Ha(c.pe)&&-1!==c.pe.indexOf(a)&&(c.Se=!0)}}function Tf(){for(var a=0;a<Of.length;++a){var b=Of[a];if(b.Se){b.Se=!1;try{b.Qg.call()}catch(c){}}}}
var Vf=function(a){var b=Pf().entries[a]||{};return void 0!==b.update?b.update:void 0!==b.initial?b.initial:void 0},Wf=function(a){return!(Pf().entries[a]||{}).quiet},Xf=function(){return Nf("gtag_cs_api")?Pf().active:!1},Yf=function(a,b){Pf().addListener(a,b)},Zf=function(a,b){function c(){for(var e=0;e<b.length;e++)if(!Wf(b[e]))return!0;return!1}if(c()){var d=!1;Yf(b,function(){d||c()||(d=!0,a())})}else a()},$f=function(a,b){if(!1===Vf(b)){var c=!1;Yf([b],function(){!c&&Vf(b)&&(a(),c=!0)})}};var ag=[H.o,H.L],bg=function(a){var b=a[H.nf];b&&I(40);var c=a[H.qf];c&&I(41);for(var d=Ha(b)?b:[b],e=0;e<d.length;++e)for(var f=0;f<ag.length;f++){var g=ag[f],h=a[ag[f]],l=d[e];Pf().set(g,h,l,"VN","VN-DN",c)}},cg=function(a){for(var b=0;b<ag.length;b++){var c=ag[b],d=a[ag[b]];Pf().update(c,d)}Pf().notifyListeners()},dg=function(a){var b=Vf(a);return void 0!=b?b:!0},eg=function(){for(var a=[],b=0;b<ag.length;b++){var c=Vf(ag[b]);a[b]=!0===c?"1":!1===c?"0":"-"}return"G1"+a.join("")},
fg=function(a,b){Zf(a,b)};var hg=function(a){return gg?K.querySelectorAll(a):null},ig=function(a,b){if(!gg)return null;if(Element.prototype.closest)try{return a.closest(b)}catch(e){return null}var c=Element.prototype.matches||Element.prototype.webkitMatchesSelector||Element.prototype.mozMatchesSelector||Element.prototype.msMatchesSelector||Element.prototype.oMatchesSelector,d=a;if(!K.documentElement.contains(d))return null;do{try{if(c.call(d,b))return d}catch(e){break}d=d.parentElement||d.parentNode}while(null!==d&&1===d.nodeType);
return null},jg=!1;if(K.querySelectorAll)try{var kg=K.querySelectorAll(":root");kg&&1==kg.length&&kg[0]==K.documentElement&&(jg=!0)}catch(a){}var gg=jg;var Md={},R=null,yg=Math.random();Md.C="GTM-WJZQSJF";Md.bc="8j2";Md.hi="";var zg={__cl:!0,__ecl:!0,__ehl:!0,__evl:!0,__fal:!0,__fil:!0,__fsl:!0,__hl:!0,__jel:!0,__lcl:!0,__sdl:!0,__tl:!0,__ytl:!0,__paused:!0,__tg:!0},Ag="www.googletagmanager.com/gtm.js";
var Bg=Ag,Cg=null,Dg=null,Eg="//www.googletagmanager.com/a?id="+Md.C+"&cv=220",Fg={},Gg={},Hg=function(){var a=R.sequence||1;R.sequence=a+1;return a};
var Ig=function(){return"&tc="+ld.filter(function(a){return a}).length},Lg=function(){Jg||(Jg=C.setTimeout(Kg,500))},Kg=function(){Jg&&(C.clearTimeout(Jg),Jg=void 0);void 0===Mg||Ng[Mg]&&!Og&&!Pg||(Qg[Mg]||Rg.lh()||0>=Sg--?(I(1),Qg[Mg]=!0):(Rg.Mh(),Df(Tg()),Ng[Mg]=!0,Ug=Vg=Pg=Og=""))},Tg=function(){var a=Mg;if(void 0===a)return"";var b=bf("GTM"),c=bf("TAGGING");return[Wg,Ng[a]?"":"&es=1",Xg[a],b?"&u="+b:"",c?"&ut="+c:"",Ig(),Og,Pg,Vg,Ug,"&z=0"].join("")},Yg=function(){return[Eg,"&v=3&t=t","&pid="+
Ka(),"&rv="+Md.bc].join("")},Zg="0.005000">Math.random(),Wg=Yg(),$g=function(){Wg=Yg()},Ng={},Og="",Pg="",Ug="",Vg="",Mg=void 0,Xg={},Qg={},Jg=void 0,Rg=function(a,b){var c=0,d=0;return{lh:function(){if(c<a)return!1;Ta()-d>=b&&(c=0);return c>=a},Mh:function(){Ta()-d>=b&&(c=0);c++;d=Ta()}}}(2,1E3),Sg=1E3,ah=function(a,b){if(Zg&&!Qg[a]&&Mg!==a){Kg();Mg=a;Ug=Og="";var c;c=0===b.indexOf("gtm.")?encodeURIComponent(b):"*";Xg[a]="&e="+c+"&eid="+a;Lg()}},bh=function(a,b,c){if(Zg&&!Qg[a]&&
b){a!==Mg&&(Kg(),Mg=a);var d,e=String(b[xd.Sa]||"").replace(/_/g,"");0===e.indexOf("cvt")&&(e="cvt");d=e;var f=c+d;Og=Og?Og+"."+f:"&tr="+f;var g=b["function"];if(!g)throw Error("Error: No function name given for function call.");var h=(nd[g]?"1":"2")+d;Ug=Ug?Ug+"."+h:"&ti="+h;Lg();2022<=Tg().length&&Kg()}},ch=function(a,b,c){if(Zg&&!Qg[a]){a!==Mg&&(Kg(),Mg=a);var d=c+b;Pg=Pg?Pg+
"."+d:"&epr="+d;Lg();2022<=Tg().length&&Kg()}};var dh={},eh=new La,fh={},gh={},jh={name:"dataLayer",set:function(a,b){E($a(a,b),fh);hh()},get:function(a){return ih(a,2)},reset:function(){eh=new La;fh={};hh()}},ih=function(a,b){if(2!=b){var c=eh.get(a);Zg&&c!==kh(a.split("."))&&I(5);return c}return kh(a.split("."))},kh=function(a){for(var b=fh,c=0;c<a.length;c++){if(null===b)return!1;if(void 0===b)break;b=b[a[c]]}return b},lh=function(a,b){gh.hasOwnProperty(a)||(eh.set(a,b),E($a(a,b),fh),hh())},hh=function(a){Na(gh,function(b,c){eh.set(b,c);
E($a(b,void 0),fh);E($a(b,c),fh);a&&delete gh[b]})},mh=function(a,b,c){dh[a]=dh[a]||{};var d=1!==c?kh(b.split(".")):eh.get(b);"array"===ib(d)||"object"===ib(d)?dh[a][b]=E(d):dh[a][b]=d},nh=function(a,b){if(dh[a])return dh[a][b]},oh=function(a,b){dh[a]&&delete dh[a][b]};var rh=/:[0-9]+$/,sh=function(a,b,c,d){for(var e=[],f=a.split("&"),g=0;g<f.length;g++){var h=f[g].split("=");if(decodeURIComponent(h[0]).replace(/\+/g," ")===b){var l=h.slice(1).join("=");if(!c)return d?l:decodeURIComponent(l).replace(/\+/g," ");e.push(d?l:decodeURIComponent(l).replace(/\+/g," "))}}return c?e:void 0},vh=function(a,b,c,d,e){b&&(b=String(b).toLowerCase());if("protocol"===b||"port"===b)a.protocol=th(a.protocol)||th(C.location.protocol);"port"===b?a.port=String(Number(a.hostname?a.port:
C.location.port)||("http"==a.protocol?80:"https"==a.protocol?443:"")):"host"===b&&(a.hostname=(a.hostname||C.location.hostname).replace(rh,"").toLowerCase());return uh(a,b,c,d,e)},uh=function(a,b,c,d,e){var f,g=th(a.protocol);b&&(b=String(b).toLowerCase());switch(b){case "url_no_fragment":f=wh(a);break;case "protocol":f=g;break;case "host":f=a.hostname.replace(rh,"").toLowerCase();if(c){var h=/^www\d*\./.exec(f);h&&h[0]&&(f=f.substr(h[0].length))}break;case "port":f=String(Number(a.port)||("http"==
g?80:"https"==g?443:""));break;case "path":a.pathname||a.hostname||af("TAGGING",1);f="/"==a.pathname.substr(0,1)?a.pathname:"/"+a.pathname;var l=f.split("/");0<=Ia(d||[],l[l.length-1])&&(l[l.length-1]="");f=l.join("/");break;case "query":f=a.search.replace("?","");e&&(f=sh(f,e,!1,void 0));break;case "extension":var n=a.pathname.split(".");f=1<n.length?n[n.length-1]:"";f=f.split("/")[0];break;case "fragment":f=a.hash.replace("#","");break;default:f=a&&a.href}return f},th=function(a){return a?a.replace(":",
"").toLowerCase():""},wh=function(a){var b="";if(a&&a.href){var c=a.href.indexOf("#");b=0>c?a.href:a.href.substr(0,c)}return b},xh=function(a){var b=K.createElement("a");a&&(b.href=a);var c=b.pathname;"/"!==c[0]&&(a||af("TAGGING",1),c="/"+c);var d=b.hostname.replace(rh,"");return{href:b.href,protocol:b.protocol,host:b.host,hostname:d,pathname:c,search:b.search,hash:b.hash,port:b.port}},yh=function(a){function b(n){var m=n.split("=")[0];return 0>d.indexOf(m)?n:m+"=0"}function c(n){return n.split("&").map(b).filter(function(m){return void 0!=
m}).join("&")}var d="gclid dclid gclaw gcldc gclgp gclha gclgf _gl".split(" "),e=xh(a),f=a.split(/[?#]/)[0],g=e.search,h=e.hash;"?"===g[0]&&(g=g.substring(1));"#"===h[0]&&(h=h.substring(1));g=c(g);h=c(h);""!==g&&(g="?"+g);""!==h&&(h="#"+h);var l=""+f+g+h;"/"===l[l.length-1]&&(l=l.substring(0,l.length-1));return l};function zh(a,b,c){for(var d=[],e=b.split(";"),f=0;f<e.length;f++){var g=e[f].split("="),h=g[0].replace(/^\s*|\s*$/g,"");if(h&&h==a){var l=g.slice(1).join("=").replace(/^\s*|\s*$/g,"");l&&c&&(l=decodeURIComponent(l));d.push(l)}}return d};var Bh=function(a,b,c,d){return Ah(d)?zh(a,String(b||document.cookie),c):[]},Eh=function(a,b,c,d,e){if(Ah(e)){var f=Ch(a,d,e);if(1===f.length)return f[0].id;if(0!==f.length){f=Dh(f,function(g){return g.kc},b);if(1===f.length)return f[0].id;f=Dh(f,function(g){return g.Hb},c);return f[0]?f[0].id:void 0}}};function Gh(a,b,c,d){var e=document.cookie;document.cookie=a;var f=document.cookie;return e!=f||void 0!=c&&0<=Bh(b,f,!1,d).indexOf(c)}
var Kh=function(a,b,c,d){function e(w,y,x){if(null==x)return delete h[y],w;h[y]=x;return w+"; "+y+"="+x}function f(w,y){if(null==y)return delete h[y],w;h[y]=!0;return w+"; "+y}if(!Ah(c.La))return 2;var g;void 0==b?g=a+"=deleted; expires="+(new Date(0)).toUTCString():(c.encode&&(b=encodeURIComponent(b)),b=Hh(b),g=a+"="+b);var h={};g=e(g,"path",c.path);var l;c.expires instanceof Date?l=c.expires.toUTCString():null!=c.expires&&(l=""+c.expires);g=e(g,"expires",l);g=e(g,"max-age",c.vh);g=e(g,"samesite",
c.Qh);c.Th&&(g=f(g,"secure"));var n=c.domain;if("auto"===n){for(var m=Ih(),q=void 0,t=!1,r=0;r<m.length;++r){var u="none"!==m[r]?m[r]:void 0,v=e(g,"domain",u);v=f(v,c.flags);try{d&&d(a,h)}catch(w){q=w;continue}t=!0;if(!Jh(u,c.path)&&Gh(v,a,b,c.La))return 0}if(q&&!t)throw q;return 1}n&&"none"!==n&&(g=e(g,"domain",n));g=f(g,c.flags);d&&d(a,h);return Jh(n,c.path)?1:Gh(g,a,b,c.La)?0:1},Lh=function(a,b,c){null==c.path&&(c.path="/");c.domain||(c.domain="auto");return Kh(a,b,c)};
function Dh(a,b,c){for(var d=[],e=[],f,g=0;g<a.length;g++){var h=a[g],l=b(h);l===c?d.push(h):void 0===f||l<f?(e=[h],f=l):l===f&&e.push(h)}return 0<d.length?d:e}function Ch(a,b,c){for(var d=[],e=Bh(a,void 0,void 0,c),f=0;f<e.length;f++){var g=e[f].split("."),h=g.shift();if(!b||-1!==b.indexOf(h)){var l=g.shift();l&&(l=l.split("-"),d.push({id:g.join("."),kc:1*l[0]||1,Hb:1*l[1]||1}))}}return d}
var Hh=function(a){a&&1200<a.length&&(a=a.substring(0,1200));return a},Mh=/^(www\.)?google(\.com?)?(\.[a-z]{2})?$/,Nh=/(^|\.)doubleclick\.net$/i,Jh=function(a,b){return Nh.test(document.location.hostname)||"/"===b&&Mh.test(a)},Ih=function(){var a=[],b=document.location.hostname.split(".");if(4===b.length){var c=b[b.length-1];if(parseInt(c,10).toString()===c)return["none"]}for(var d=b.length-2;0<=d;d--)a.push(b.slice(d).join("."));var e=document.location.hostname;Nh.test(e)||Mh.test(e)||a.push("none");
return a},Ah=function(a){if(!Nf("gtag_cs_api")||!a||!Xf())return!0;if(!Wf(a))return!1;var b=Vf(a);return null==b?!0:!!b};var Oh=function(){for(var a=wf.userAgent+(K.cookie||"")+(K.referrer||""),b=a.length,c=C.history.length;0<c;)a+=c--^b++;var d=1,e,f,g;if(a)for(d=0,f=a.length-1;0<=f;f--)g=a.charCodeAt(f),d=(d<<6&268435455)+g+(g<<14),e=d&266338304,d=0!=e?d^e>>21:d;return[Math.round(2147483647*Math.random())^d&2147483647,Math.round(Ta()/1E3)].join(".")},Rh=function(a,b,c,d,e){var f=Ph(b);return Eh(a,f,Qh(c),d,e)},Sh=function(a,b,c,d){var e=""+Ph(c),f=Qh(d);1<f&&(e+="-"+f);return[b,e,a].join(".")},Ph=function(a){if(!a)return 1;
a=0===a.indexOf(".")?a.substr(1):a;return a.split(".").length},Qh=function(a){if(!a||"/"===a)return 1;"/"!==a[0]&&(a="/"+a);"/"!==a[a.length-1]&&(a+="/");return a.split("/").length-1};function Th(a,b,c){var d,e=a.Db;null==e&&(e=7776E3);0!==e&&(d=new Date((b||Ta())+1E3*e));return{path:a.path,domain:a.domain,flags:a.flags,encode:!!c,expires:d}};var Uh=["1"],Vh={},Zh=function(a){var b=Wh(a.prefix);Vh[b]||Xh(b,a.path,a.domain)||(Yh(b,Oh(),a),Xh(b,a.path,a.domain))};function Yh(a,b,c){var d=Sh(b,"1",c.domain,c.path),e=Th(c);e.La="ad_storage";Lh(a,d,e)}function Xh(a,b,c){var d=Rh(a,b,c,Uh,"ad_storage");d&&(Vh[a]=d);return d}function Wh(a){return(a||"_gcl")+"_au"};function $h(){for(var a=ai,b={},c=0;c<a.length;++c)b[a[c]]=c;return b}function bi(){var a="ABCDEFGHIJKLMNOPQRSTUVWXYZ";a+=a.toLowerCase()+"0123456789-_";return a+"."}var ai,ci;function di(a){ai=ai||bi();ci=ci||$h();for(var b=[],c=0;c<a.length;c+=3){var d=c+1<a.length,e=c+2<a.length,f=a.charCodeAt(c),g=d?a.charCodeAt(c+1):0,h=e?a.charCodeAt(c+2):0,l=f>>2,n=(f&3)<<4|g>>4,m=(g&15)<<2|h>>6,q=h&63;e||(q=64,d||(m=64));b.push(ai[l],ai[n],ai[m],ai[q])}return b.join("")}
function ei(a){function b(l){for(;d<a.length;){var n=a.charAt(d++),m=ci[n];if(null!=m)return m;if(!/^[\s\xa0]*$/.test(n))throw Error("Unknown base64 encoding at char: "+n);}return l}ai=ai||bi();ci=ci||$h();for(var c="",d=0;;){var e=b(-1),f=b(0),g=b(64),h=b(64);if(64===h&&-1===e)return c;c+=String.fromCharCode(e<<2|f>>4);64!=g&&(c+=String.fromCharCode(f<<4&240|g>>2),64!=h&&(c+=String.fromCharCode(g<<6&192|h)))}};var fi;var ji=function(){var a=gi,b=hi,c=ii(),d=function(g){a(g.target||g.srcElement||{})},e=function(g){b(g.target||g.srcElement||{})};if(!c.init){Ef(K,"mousedown",d);Ef(K,"keyup",d);Ef(K,"submit",e);var f=HTMLFormElement.prototype.submit;HTMLFormElement.prototype.submit=function(){b(this);f.call(this)};c.init=!0}},ki=function(a,b,c,d,e){var f={callback:a,domains:b,fragment:2===c,placement:c,forms:d,sameHost:e};ii().decorators.push(f)},li=function(a,b,c){for(var d=ii().decorators,e={},f=0;f<d.length;++f){var g=
d[f],h;if(h=!c||g.forms)a:{var l=g.domains,n=a,m=!!g.sameHost;if(l&&(m||n!==K.location.hostname))for(var q=0;q<l.length;q++)if(l[q]instanceof RegExp){if(l[q].test(n)){h=!0;break a}}else if(0<=n.indexOf(l[q])||m&&0<=l[q].indexOf(n)){h=!0;break a}h=!1}if(h){var t=g.placement;void 0==t&&(t=g.fragment?2:1);t===b&&Wa(e,g.callback())}}return e},ii=function(){var a=yf("google_tag_data",{}),b=a.gl;b&&b.decorators||(b={decorators:[]},a.gl=b);return b};var mi=/(.*?)\*(.*?)\*(.*)/,ni=/^https?:\/\/([^\/]*?)\.?cdn\.ampproject\.org\/?(.*)/,oi=/^(?:www\.|m\.|amp\.)+/,pi=/([^?#]+)(\?[^#]*)?(#.*)?/;function qi(a){return new RegExp("(.*?)(^|&)"+a+"=([^&]*)&?(.*)")}
var si=function(a){var b=[],c;for(c in a)if(a.hasOwnProperty(c)){var d=a[c];void 0!==d&&d===d&&null!==d&&"[object Object]"!==d.toString()&&(b.push(c),b.push(di(String(d))))}var e=b.join("*");return["1",ri(e),e].join("*")},ri=function(a,b){var c=[window.navigator.userAgent,(new Date).getTimezoneOffset(),window.navigator.userLanguage||window.navigator.language,Math.floor((new Date).getTime()/60/1E3)-(void 0===b?0:b),a].join("*"),d;if(!(d=fi)){for(var e=Array(256),f=0;256>f;f++){for(var g=f,h=0;8>h;h++)g=
g&1?g>>>1^3988292384:g>>>1;e[f]=g}d=e}fi=d;for(var l=4294967295,n=0;n<c.length;n++)l=l>>>8^fi[(l^c.charCodeAt(n))&255];return((l^-1)>>>0).toString(36)},ui=function(){return function(a){var b=xh(C.location.href),c=b.search.replace("?",""),d=sh(c,"_gl",!1,!0)||"";a.query=ti(d)||{};var e=vh(b,"fragment").match(qi("_gl"));a.fragment=ti(e&&e[3]||"")||{}}},vi=function(a){var b=ui(),c=ii();c.data||(c.data={query:{},fragment:{}},b(c.data));var d={},e=c.data;e&&(Wa(d,e.query),a&&Wa(d,e.fragment));return d},
ti=function(a){var b;b=void 0===b?3:b;try{if(a){var c;a:{for(var d=a,e=0;3>e;++e){var f=mi.exec(d);if(f){c=f;break a}d=decodeURIComponent(d)}c=void 0}var g=c;if(g&&"1"===g[1]){var h=g[3],l;a:{for(var n=g[2],m=0;m<b;++m)if(n===ri(h,m)){l=!0;break a}l=!1}if(l){for(var q={},t=h?h.split("*"):[],r=0;r<t.length;r+=2)q[t[r]]=ei(t[r+1]);return q}}}}catch(u){}};
function wi(a,b,c,d){function e(m){var q=m,t=qi(a).exec(q),r=q;if(t){var u=t[2],v=t[4];r=t[1];v&&(r=r+u+v)}m=r;var w=m.charAt(m.length-1);m&&"&"!==w&&(m+="&");return m+n}d=void 0===d?!1:d;var f=pi.exec(c);if(!f)return"";var g=f[1],h=f[2]||"",l=f[3]||"",n=a+"="+b;d?l="#"+e(l.substring(1)):h="?"+e(h.substring(1));return""+g+h+l}
function xi(a,b){var c="FORM"===(a.tagName||"").toUpperCase(),d=li(b,1,c),e=li(b,2,c),f=li(b,3,c);if(Xa(d)){var g=si(d);c?yi("_gl",g,a):zi("_gl",g,a,!1)}if(!c&&Xa(e)){var h=si(e);zi("_gl",h,a,!0)}for(var l in f)if(f.hasOwnProperty(l))a:{var n=l,m=f[l],q=a;if(q.tagName){if("a"===q.tagName.toLowerCase()){zi(n,m,q,void 0);break a}if("form"===q.tagName.toLowerCase()){yi(n,m,q);break a}}"string"==typeof q&&wi(n,m,q,void 0)}}
function zi(a,b,c,d){if(c.href){var e=wi(a,b,c.href,void 0===d?!1:d);hf.test(e)&&(c.href=e)}}
function yi(a,b,c){if(c&&c.action){var d=(c.method||"").toLowerCase();if("get"===d){for(var e=c.childNodes||[],f=!1,g=0;g<e.length;g++){var h=e[g];if(h.name===a){h.setAttribute("value",b);f=!0;break}}if(!f){var l=K.createElement("input");l.setAttribute("type","hidden");l.setAttribute("name",a);l.setAttribute("value",b);c.appendChild(l)}}else if("post"===d){var n=wi(a,b,c.action);hf.test(n)&&(c.action=n)}}}
var gi=function(a){try{var b;a:{for(var c=a,d=100;c&&0<d;){if(c.href&&c.nodeName.match(/^a(?:rea)?$/i)){b=c;break a}c=c.parentNode;d--}b=null}var e=b;if(e){var f=e.protocol;"http:"!==f&&"https:"!==f||xi(e,e.hostname)}}catch(g){}},hi=function(a){try{if(a.action){var b=vh(xh(a.action),"host");xi(a,b)}}catch(c){}},Ai=function(a,b,c,d){ji();ki(a,b,"fragment"===c?2:1,!!d,!1)},Bi=function(a,b){ji();ki(a,[uh(C.location,"host",!0)],b,!0,!0)},Ci=function(){var a=K.location.hostname,b=ni.exec(K.referrer);if(!b)return!1;
var c=b[2],d=b[1],e="";if(c){var f=c.split("/"),g=f[1];e="s"===g?decodeURIComponent(f[2]):decodeURIComponent(g)}else if(d){if(0===d.indexOf("xn--"))return!1;e=d.replace(/-/g,".").replace(/\.\./g,"-")}var h=a.replace(oi,""),l=e.replace(oi,""),n;if(!(n=h===l)){var m="."+l;n=h.substring(h.length-m.length,h.length)===m}return n},Di=function(a,b){return!1===a?!1:a||b||Ci()};var Ei=/^\w+$/,Fi=/^[\w-]+$/,Gi=/^~?[\w-]+$/,Hi={aw:"_aw",dc:"_dc",gf:"_gf",ha:"_ha",gp:"_gp"},Ii=function(){if(!Nf("gtag_cs_api")||!Xf())return!0;var a=Vf("ad_storage");return null==a?!0:!!a},Ji=function(a,b){Wf("ad_storage")?Ii()?a():$f(a,"ad_storage"):b?af("TAGGING",3):Zf(function(){Ji(a,!0)},["ad_storage"])},Mi=function(a){var b=[];if(!K.cookie)return b;var c=Bh(a,K.cookie,void 0,"ad_storage");if(!c||0==c.length)return b;for(var d=0;d<c.length;d++){var e=Ki(c[d]);e&&-1===Ia(b,e)&&b.push(e)}return Li(b)};
function Ni(a){return a&&"string"==typeof a&&a.match(Ei)?a:"_gcl"}
var Pi=function(){var a=xh(C.location.href),b=vh(a,"query",!1,void 0,"gclid"),c=vh(a,"query",!1,void 0,"gclsrc"),d=vh(a,"query",!1,void 0,"dclid");if(!b||!c){var e=a.hash.replace("#","");b=b||sh(e,"gclid",!1,void 0);c=c||sh(e,"gclsrc",!1,void 0)}return Oi(b,c,d)},Oi=function(a,b,c){var d={},e=function(f,g){d[g]||(d[g]=[]);d[g].push(f)};d.gclid=a;d.gclsrc=b;d.dclid=c;if(void 0!==a&&a.match(Fi))switch(b){case void 0:e(a,"aw");break;case "aw.ds":e(a,"aw");e(a,"dc");break;case "ds":e(a,"dc");break;case "3p.ds":Nf("gtm_3pds")&&
e(a,"dc");break;case "gf":e(a,"gf");break;case "ha":e(a,"ha");break;case "gp":e(a,"gp")}c&&e(c,"dc");return d},Ri=function(a){var b=Pi();Ji(function(){return Qi(b,a)})};
function Qi(a,b,c){function d(n,m){var q=Si(n,e);q&&(Lh(q,m,f),g=!0)}b=b||{};var e=Ni(b.prefix);c=c||Ta();var f=Th(b,c,!0);f.La="ad_storage";var g=!1,h=Math.round(c/1E3),l=function(n){return["GCL",h,n].join(".")};a.aw&&(!0===b.Fi?d("aw",l("~"+a.aw[0])):d("aw",l(a.aw[0])));a.dc&&d("dc",l(a.dc[0]));a.gf&&d("gf",l(a.gf[0]));a.ha&&d("ha",l(a.ha[0]));a.gp&&d("gp",l(a.gp[0]));return g}
var Ui=function(a,b){var c=vi(!0);Ji(function(){for(var d=Ni(b.prefix),e=0;e<a.length;++e){var f=a[e];if(void 0!==Hi[f]){var g=Si(f,d),h=c[g];if(h){var l=Math.min(Ti(h),Ta()),n;b:{for(var m=l,q=Bh(g,K.cookie,void 0,"ad_storage"),t=0;t<q.length;++t)if(Ti(q[t])>m){n=!0;break b}n=!1}if(!n){var r=Th(b,l,!0);r.La="ad_storage";Lh(g,h,r)}}}}Qi(Oi(c.gclid,c.gclsrc),b)})},Si=function(a,b){var c=Hi[a];if(void 0!==c)return b+c},Ti=function(a){var b=a.split(".");return 3!==b.length||"GCL"!==b[0]?0:1E3*(Number(b[1])||
0)};function Ki(a){var b=a.split(".");if(3==b.length&&"GCL"==b[0]&&b[1])return b[2]}
var Vi=function(a,b,c,d,e){if(Ha(b)){var f=Ni(e),g=function(){for(var h={},l=0;l<a.length;++l){var n=Si(a[l],f);if(n){var m=Bh(n,K.cookie,void 0,"ad_storage");m.length&&(h[n]=m.sort()[m.length-1])}}return h};Ji(function(){Ai(g,b,c,d)})}},Li=function(a){return a.filter(function(b){return Gi.test(b)})},Wi=function(a,b){for(var c=Ni(b.prefix),d={},e=0;e<a.length;e++)Hi[a[e]]&&(d[a[e]]=Hi[a[e]]);Ji(function(){Na(d,function(f,g){var h=Bh(c+g,K.cookie,void 0,"ad_storage");if(h.length){var l=h[0],n=Ti(l),
m={};m[f]=[Ki(l)];Qi(m,b,n)}})})};function Xi(a,b){for(var c=0;c<b.length;++c)if(a[b[c]])return!0;return!1}
var Yi=function(){function a(e,f,g){g&&(e[f]=g)}var b=["aw","dc"];if(Xf()){var c=Pi();if(Xi(c,b)){var d={};a(d,"gclid",c.gclid);a(d,"dclid",c.dclid);a(d,"gclsrc",c.gclsrc);Bi(function(){return d},3);Bi(function(){var e={};return e._up="1",e},1)}}},Zi=function(){var a;if(Ii()){for(var b=[],c=K.cookie.split(";"),d=/^\s*_gac_(UA-\d+-\d+)=\s*(.+?)\s*$/,e=0;e<c.length;e++){var f=c[e].match(d);f&&b.push({Id:f[1],value:f[2]})}var g={};if(b&&b.length)for(var h=0;h<b.length;h++){var l=b[h].value.split(".");
"1"==l[0]&&3==l.length&&l[1]&&(g[b[h].Id]||(g[b[h].Id]=[]),g[b[h].Id].push({timestamp:l[1],Sg:l[2]}))}a=g}else a={};return a};var $i=/^\d+\.fls\.doubleclick\.net$/;function aj(a,b){Wf(H.o)?dg(H.o)?a():$f(a,H.o):b?I(42):fg(function(){aj(a,!0)},[H.o])}function bj(a){var b=xh(C.location.href),c=vh(b,"host",!1);if(c&&c.match($i)){var d=vh(b,"path").split(a+"=");if(1<d.length)return d[1].split(";")[0].split("?")[0]}}
function cj(a,b,c){if("aw"==a||"dc"==a){var d=bj("gcl"+a);if(d)return d.split(".")}var e=Ni(b);if("_gcl"==e){c=void 0===c?!0:c;var f=!dg(H.o)&&c,g;g=Pi()[a]||[];if(0<g.length)return f?["0"]:g}var h=Si(a,e);return h?Mi(h):[]}
var dj=function(a){var b=bj("gac");if(b)return!dg(H.o)&&a?"0":decodeURIComponent(b);var c=Zi(),d=[];Na(c,function(e,f){for(var g=[],h=0;h<f.length;h++)g.push(f[h].Sg);g=Li(g);g.length&&d.push(e+":"+g.join(","))});return d.join(";")},ej=function(a,b){var c=Pi().dc||[];aj(function(){Zh(b);var d=Vh[Wh(b.prefix)],e=!1;if(d&&0<c.length){var f=R.joined_au=R.joined_au||{},g=b.prefix||"_gcl";if(!f[g])for(var h=0;h<c.length;h++){var l="https://adservice.google.com/ddm/regclk";l=l+"?gclid="+c[h]+"&auiddc="+d;Kf(l);e=f[g]=
!0}}null==a&&(a=e);if(a&&d){var n=Wh(b.prefix),m=Vh[n];m&&Yh(n,m,b)}})};var fj=/[A-Z]+/,gj=/\s/,hj=function(a){if(p(a)&&(a=Sa(a),!gj.test(a))){var b=a.indexOf("-");if(!(0>b)){var c=a.substring(0,b);if(fj.test(c)){for(var d=a.substring(b+1).split("/"),e=0;e<d.length;e++)if(!d[e])return;return{id:a,prefix:c,containerId:c+"-"+d[0],D:d}}}}},jj=function(a){for(var b={},c=0;c<a.length;++c){var d=hj(a[c]);d&&(b[d.id]=d)}ij(b);var e=[];Na(b,function(f,g){e.push(g)});return e};
function ij(a){var b=[],c;for(c in a)if(a.hasOwnProperty(c)){var d=a[c];"AW"===d.prefix&&d.D[1]&&b.push(d.containerId)}for(var e=0;e<b.length;++e)delete a[b[e]]};var kj=function(){var a=!1;return a};var mj=function(a,b,c,d){return(2===lj()||d||"http:"!=C.location.protocol?a:b)+c},lj=function(){var a=Bf(),b;if(1===a)a:{var c=Bg;c=c.toLowerCase();for(var d="https://"+c,e="http://"+c,f=1,g=K.getElementsByTagName("script"),h=0;h<g.length&&100>h;h++){var l=g[h].src;if(l){l=l.toLowerCase();if(0===l.indexOf(e)){b=3;break a}1===f&&0===l.indexOf(d)&&(f=2)}}b=f}else b=a;return b};
var Aj=function(a){return dg(H.o)?a:a.replace(/&url=([^&#]+)/,function(b,c){var d=yh(decodeURIComponent(c));return"&url="+encodeURIComponent(d)})};var Bj=new RegExp(/^(.*\.)?(google|youtube|blogger|withgoogle)(\.com?)?(\.[a-z]{2})?\.?$/),Cj={cl:["ecl"],customPixels:["nonGooglePixels"],ecl:["cl"],ehl:["hl"],hl:["ehl"],html:["customScripts","customPixels","nonGooglePixels","nonGoogleScripts","nonGoogleIframes"],customScripts:["html","customPixels","nonGooglePixels","nonGoogleScripts","nonGoogleIframes"],nonGooglePixels:[],nonGoogleScripts:["nonGooglePixels"],nonGoogleIframes:["nonGooglePixels"]},Dj={cl:["ecl"],customPixels:["customScripts","html"],
ecl:["cl"],ehl:["hl"],hl:["ehl"],html:["customScripts"],customScripts:["html"],nonGooglePixels:["customPixels","customScripts","html","nonGoogleScripts","nonGoogleIframes"],nonGoogleScripts:["customScripts","html"],nonGoogleIframes:["customScripts","html","nonGoogleScripts"]},Ej="google customPixels customScripts html nonGooglePixels nonGoogleScripts nonGoogleIframes".split(" ");
var Gj=function(a){var b;b||(b=ih("gtm.whitelist"));b&&I(9);
var c=b&&Ya(Ra(b),Cj),d;d||(d=ih("gtm.blacklist"));d||(d=ih("tagTypeBlacklist"))&&I(3);d?I(8):d=[];Fj()&&(d=Ra(d),d.push("nonGooglePixels","nonGoogleScripts","sandboxedScripts"));0<=Ia(Ra(d),"google")&&I(2);var e=d&&Ya(Ra(d),Dj),f={};return function(g){var h=
g&&g[xd.Sa];if(!h||"string"!=typeof h)return!0;h=h.replace(/^_*/,"");if(void 0!==f[h])return f[h];var l=Gg[h]||[],n=a(h,l);if(b){var m;if(m=n)a:{if(0>Ia(c,h))if(l&&0<l.length)for(var q=0;q<l.length;q++){if(0>Ia(c,l[q])){I(11);m=!1;break a}}else{m=!1;break a}m=!0}n=m}var t=!1;if(d){var r=0<=Ia(e,h);if(r)t=r;else{var u=Ma(e,l||[]);u&&I(10);t=u}}var v=!n||t;v||!(0<=Ia(l,"sandboxedScripts"))||c&&-1!==Ia(c,"sandboxedScripts")||(v=Ma(e,Ej));return f[h]=v}},Fj=function(){return Bj.test(C.location&&C.location.hostname)};var Hj={active:!0,isAllowed:function(){return!0}},Ij=function(a){var b=R.zones;!b&&a&&(b=R.zones=a());return b};var Jj=function(){};var Kj=!1,Lj=0,Mj=[];function Nj(a){if(!Kj){var b=K.createEventObject,c="complete"==K.readyState,d="interactive"==K.readyState;if(!a||"readystatechange"!=a.type||c||!b&&d){Kj=!0;for(var e=0;e<Mj.length;e++)O(Mj[e])}Mj.push=function(){for(var f=0;f<arguments.length;f++)O(arguments[f]);return 0}}}function Oj(){if(!Kj&&140>Lj){Lj++;try{K.documentElement.doScroll("left"),Nj()}catch(a){C.setTimeout(Oj,50)}}}var Pj=function(a){Kj?a():Mj.push(a)};var Qj={},Rj={},Sj=function(a,b,c,d){if(!Rj[a]||zg[b]||"__zone"===b)return-1;var e={};kb(d)&&(e=E(d,e));e.id=c;e.status="timeout";return Rj[a].tags.push(e)-1},Tj=function(a,b,c,d){if(Rj[a]){var e=Rj[a].tags[b];e&&(e.status=c,e.executionTime=d)}};function Uj(a){for(var b=Qj[a]||[],c=0;c<b.length;c++)b[c]();Qj[a]={push:function(d){d(Md.C,Rj[a])}}}
var Xj=function(a,b,c){Rj[a]={tags:[]};Fa(b)&&Vj(a,b);c&&C.setTimeout(function(){return Uj(a)},Number(c));return Wj(a)},Vj=function(a,b){Qj[a]=Qj[a]||[];Qj[a].push(Va(function(){return O(function(){b(Md.C,Rj[a])})}))};function Wj(a){var b=0,c=0,d=!1;return{add:function(){c++;return Va(function(){b++;d&&b>=c&&Uj(a)})},lg:function(){d=!0;b>=c&&Uj(a)}}};var Yj=function(){function a(d){return!Ga(d)||0>d?0:d}if(!R._li&&C.performance&&C.performance.timing){var b=C.performance.timing.navigationStart,c=Ga(jh.get("gtm.start"))?jh.get("gtm.start"):0;R._li={cst:a(c-b),cbt:a(Dg-b)}}};var ck={},dk=function(){return C.GoogleAnalyticsObject&&C[C.GoogleAnalyticsObject]},ek=!1;
var fk=function(a){C.GoogleAnalyticsObject||(C.GoogleAnalyticsObject=a||"ga");var b=C.GoogleAnalyticsObject;if(C[b])C.hasOwnProperty(b)||I(12);else{var c=function(){c.q=c.q||[];c.q.push(arguments)};c.l=Number(new Date);C[b]=c}Yj();return C[b]},gk=function(a,b,c,d){b=String(b).replace(/\s+/g,"").split(",");var e=dk();e(a+"require","linker");e(a+"linker:autoLink",b,c,d)};
var ik=function(a){},hk=function(){return C.GoogleAnalyticsObject||"ga"},jk=function(a,b){return function(){var c=dk(),d=c&&c.getByName&&c.getByName(a);if(d){var e=d.get("sendHitTask");d.set("sendHitTask",function(f){var g=f.get("hitPayload"),h=f.get("hitCallback"),l=0>g.indexOf("&tid="+b);l&&(f.set("hitPayload",g.replace(/&tid=UA-[0-9]+-[0-9]+/,"&tid="+
b),!0),f.set("hitCallback",void 0,!0));e(f);l&&(f.set("hitPayload",g,!0),f.set("hitCallback",h,!0),f.set("_x_19",void 0,!0),e(f))})}}};var ok=function(){return!1},pk=function(){var a={};return function(b,c,d){}};function qk(a,b,c,d){var e=ld[a],f=rk(a,b,c,d);if(!f)return null;var g=td(e[xd.$d],c,[]);if(g&&g.length){var h=g[0];f=qk(h.index,{I:f,H:1===h.we?b.terminate:f,terminate:b.terminate},c,d)}return f}
function rk(a,b,c,d){function e(){if(f[xd.Ef])h();else{var w=ud(f,c,[]),y=Sj(c.id,String(f[xd.Sa]),Number(f[xd.ae]),w[xd.Ff]),x=!1;w.vtp_gtmOnSuccess=function(){if(!x){x=!0;var z=Ta()-A;bh(c.id,ld[a],"5");Tj(c.id,y,"success",z);g()}};w.vtp_gtmOnFailure=function(){if(!x){x=!0;var z=Ta()-A;bh(c.id,ld[a],"6");Tj(c.id,y,"failure",z);h()}};w.vtp_gtmTagId=f.tag_id;
w.vtp_gtmEventId=c.id;bh(c.id,f,"1");var B=function(){var z=Ta()-A;bh(c.id,f,"7");Tj(c.id,y,"exception",z);x||(x=!0,h())};var A=Ta();try{sd(w,c)}catch(z){B(z)}}}var f=ld[a],g=b.I,h=b.H,l=b.terminate;if(c.od(f))return null;var n=td(f[xd.be],c,[]);if(n&&n.length){var m=n[0],q=qk(m.index,{I:g,H:h,terminate:l},c,d);if(!q)return null;g=q;h=2===m.we?l:q}if(f[xd.Wd]||f[xd.Jf]){var t=f[xd.Wd]?md:c.Yh,r=g,u=h;if(!t[a]){e=Va(e);var v=sk(a,t,e);g=v.I;h=v.H}return function(){t[a](r,u)}}return e}
function sk(a,b,c){var d=[],e=[];b[a]=tk(d,e,c);return{I:function(){b[a]=uk;for(var f=0;f<d.length;f++)d[f]()},H:function(){b[a]=vk;for(var f=0;f<e.length;f++)e[f]()}}}function tk(a,b,c){return function(d,e){a.push(d);b.push(e);c()}}function uk(a){a()}function vk(a,b){b()};var yk=function(a,b){for(var c=[],d=0;d<ld.length;d++)if(a.Fb[d]){var e=ld[d];var f=b.add();try{var g=qk(d,{I:f,H:f,terminate:f},a,d);g?c.push({af:d,Te:vd(e),nc:g}):(wk(d,a),f())}catch(l){f()}}b.lg();c.sort(xk);for(var h=0;h<c.length;h++)c[h].nc();return 0<c.length};function xk(a,b){var c,d=b.Te,e=a.Te;c=d>e?1:d<e?-1:0;var f;if(0!==c)f=c;else{var g=a.af,h=b.af;f=g>h?1:g<h?-1:0}return f}
function wk(a,b){if(!Zg)return;var c=function(d){var e=b.od(ld[d])?"3":"4",f=td(ld[d][xd.$d],b,[]);f&&f.length&&c(f[0].index);bh(b.id,ld[d],e);var g=td(ld[d][xd.be],b,[]);g&&g.length&&c(g[0].index)};c(a);}
var zk=!1,Ak=function(a,b,c,d,e){if("gtm.js"==b){if(zk)return!1;zk=!0}ah(a,b);var f=Xj(a,d,e);mh(a,"event",1);mh(a,"ecommerce",1);mh(a,"gtm");var g={id:a,name:b,od:Gj(c),Fb:[],Yh:[],Ke:function(){I(6)}};g.Fb=Hd(g);
var h=yk(g,f);"gtm.js"!==b&&"gtm.sync"!==b||ik(Md.C);if(!h)return h;for(var l=0;l<g.Fb.length;l++)if(g.Fb[l]){var n=ld[l];if(n&&!zg[String(n[xd.Sa])])return!0}return!1};function Bk(a,b){if(a){var c=""+a;0!==c.indexOf("http://")&&0!==c.indexOf("https://")&&(c="https://"+c);"/"===c[c.length-1]&&(c=c.substring(0,c.length-1));return xh(""+c+b).href}}function Ck(a,b){return Dk()?Bk(a,b):void 0}function Dk(){var a=!1;return a};var Ek=function(){this.eventModel={};this.targetConfig={};this.containerConfig={};this.a={};this.globalConfig={};this.I=function(){};this.H=function(){};this.eventId=void 0},Fk=function(a){var b=new Ek;b.eventModel=a;return b},Gk=function(a,b){a.targetConfig=b;return a},Hk=function(a,b){a.containerConfig=b;return a},Ik=function(a,b){a.a=b;return a},Jk=function(a,b){a.globalConfig=b;return a},Kk=function(a,b){a.I=b;return a},Lk=function(a,b){a.H=b;return a};
Ek.prototype.getWithConfig=function(a){if(void 0!==this.eventModel[a])return this.eventModel[a];if(void 0!==this.targetConfig[a])return this.targetConfig[a];if(void 0!==this.containerConfig[a])return this.containerConfig[a];if(void 0!==this.a[a])return this.a[a];if(void 0!==this.globalConfig[a])return this.globalConfig[a]};
var Mk=function(a){function b(e){Na(e,function(f){c[f]=null})}var c={};b(a.eventModel);b(a.targetConfig);b(a.containerConfig);b(a.globalConfig);var d=[];Na(c,function(e){d.push(e)});return d};var Nk;if(3===Md.bc.length)Nk="g";else{var Ok="G";Nk=Ok}
var Pk={"":"n",UA:"u",AW:"a",DC:"d",G:"e",GF:"f",HA:"h",GTM:Nk,OPT:"o"},Qk=function(a){var b=Md.C.split("-"),c=b[0].toUpperCase(),d=Pk[c]||"i",e=a&&"GTM"===c?b[1]:"OPT"===c?b[1]:"",f;if(3===Md.bc.length){var g="w";f="2"+g}else f="";return f+d+Md.bc+e};var Rk=function(a,b){a.addEventListener&&a.addEventListener("message",b,!1)};var Sk=function(){return nf("iPhone")&&!nf("iPod")&&!nf("iPad")};nf("Opera");nf("Trident")||nf("MSIE");nf("Edge");!nf("Gecko")||-1!=jf.toLowerCase().indexOf("webkit")&&!nf("Edge")||nf("Trident")||nf("MSIE")||nf("Edge");-1!=jf.toLowerCase().indexOf("webkit")&&!nf("Edge")&&nf("Mobile");nf("Macintosh");nf("Windows");nf("Linux")||nf("CrOS");var Tk=la.navigator||null;Tk&&(Tk.appVersion||"").indexOf("X11");nf("Android");Sk();nf("iPad");nf("iPod");Sk()||nf("iPad")||nf("iPod");jf.toLowerCase().indexOf("kaios");var Uk=function(a,b){for(var c=a,d=0;50>d;++d){var e;try{e=!(!c.frames||!c.frames[b])}catch(h){e=!1}if(e)return c;var f;a:{try{var g=c.parent;if(g&&g!=c){f=g;break a}}catch(h){}f=null}if(!(c=f))break}return null};var Vk=function(){};var Wk=function(a){return void 0!==a.tcString&&"string"!==typeof a.tcString||void 0!==a.gdprApplies&&"boolean"!==typeof a.gdprApplies||void 0!==a.listenerId&&"number"!==typeof a.listenerId||void 0!==a.addtlConsent&&"string"!==typeof a.addtlConsent?2:a.cmpStatus&&"error"!==a.cmpStatus?0:3},Xk=function(a,b){this.i=a;this.a=null;this.s={};this.F=0;this.O=void 0===b?500:b;this.m=null};ja(Xk,Vk);
var Zk=function(a){return"function"===typeof a.i.__tcfapi||null!=Yk(a)},bl=function(a,b){var c=setTimeout(function(){c=0;b({tcString:"tcunavailable",internalErrorState:1})},a.O);$k(a,"addEventListener",function(d){d&&al(d)&&(d.internalErrorState=Wk(d),0!=d.internalErrorState&&(d.tcString="tcunavailable"),$k(a,"removeEventListener",null,d.listenerId),c&&(clearTimeout(c),c=0,b(d)))})};
Xk.prototype.addEventListener=function(a){$k(this,"addEventListener",function(b,c){var d=c?b:{};d.internalErrorState=Wk(d);0!==d.internalErrorState&&(d.tcString="tcunavailable");a(d)})};Xk.prototype.removeEventListener=function(a){a&&a.listenerId&&$k(this,"removeEventListener",null,a.listenerId)};
var dl=function(a,b){if(!a.purpose||!a.vendor)return!1;var c=cl(a.vendor.consents,"755");return c&&"1"===b&&a.purposeOneTreatment&&"DE"===a.publisherCC?!0:c&&cl(a.purpose.consents,b)},cl=function(a,b){return!(!a||!a[b])},$k=function(a,b,c,d){c||(c=function(){});if("function"===typeof a.i.__tcfapi){var e=a.i.__tcfapi;e(b,2,c,d)}else if(Yk(a)){el(a);var f=++a.F;a.s[f]=c;if(a.a){var g={};a.a.postMessage((g.__tcfapiCall={command:b,version:2,callId:f,parameter:d},g),"*")}}else c({},!1)},Yk=function(a){if(a.a)return a.a;
a.a=Uk(a.i,"__tcfapiLocator");return a.a},el=function(a){a.m||(a.m=function(b){try{var c,d;"string"===typeof b.data?d=JSON.parse(b.data):d=b.data;c=d.__tcfapiReturn;a.s[c.callId](c.returnValue,c.success)}catch(e){}},Rk(a.i,a.m))},al=function(a){return!1===a.gdprApplies||"error"===a.cmpStatus||"loaded"===a.cmpStatus&&("tcloaded"===a.eventStatus||"useractioncomplete"===a.eventStatus)?!0:!1};var fl={1:1,3:1,7:3,9:3,10:3};function gl(a,b){if(""===a)return b;var c=Number(a);return isNaN(c)?b:c}var hl=gl("",550),il=gl("",500);function jl(){var a=R.tcf||{};return R.tcf=a}
var kl=function(){var a=jl();if(!a.active){a.active=!0;var b=new Xk(C,3E3),c="x";"function"===typeof C.__tcfapi?c="s":Zk(b)?c="i":"function"===typeof C.__cmp?c="c":Uk(C,"__cmpLocator")&&(c="d");a.Je=Ta();try{var d=!1;bl(b,function(){d=!0;a.sd=Ta()});d&&(a.sd=a.Je)}catch(e){c="e"}a.type=c}},ql=function(){if(ll()?!0===C.gtag_enable_tcf_support:!1!==C.gtag_enable_tcf_support){var a=jl();if(!a.active||!a.Ka){var b=new Xk(C,3E3);if("function"===typeof C.__tcfapi||Zk(b)){a.active=!0;a.type="p";a.Ka={};
ml();var c=setTimeout(function(){nl(a);ol(a);c=null},il);try{b.addEventListener(function(d){c&&(clearTimeout(c),c=null);if(0!==d.internalErrorState)nl(a),ol(a);else{var e;if(!1===d.gdprApplies)e=pl(),b.removeEventListener(d);else if("tcloaded"===d.eventStatus||"useractioncomplete"===d.eventStatus||"cmpuishown"===d.eventStatus){var f={},g;for(g in fl)if(fl.hasOwnProperty(g))if("1"===g)f["1"]=al(d)?!1===d.gdprApplies||"tcunavailable"===d.tcString?!0:dl(d,"1"):!1;else{var h=d.purpose&&d.vendor?cl(d.purpose.legitimateInterests,
g)&&cl(d.vendor.legitimateInterests,"755"):!1,l=dl(d,g),n=fl[g];1===n?f[g]=l:2===n?f[g]=h:3===n&&(f[g]=l||h)}e=f}e&&(a.tcString=d.tcString||"tcempty",a.Ka=e,ol(a))}})}catch(d){c&&(clearTimeout(c),c=null),nl(a),ol(a)}}}}};function nl(a){a.type="e";a.tcString="tcunavailable";a.Ka=pl()}function ml(){var a={};bg((a.ad_storage="denied",a.wait_for_update=hl,a))}var ll=function(){var a=!1;a=!0;return a};
function pl(){var a={},b;for(b in fl)fl.hasOwnProperty(b)&&(a[b]=!0);return a}function ol(a){var b={};cg((b.ad_storage=a.Ka["1"]?"granted":"denied",b))}var rl=function(){var a=jl();if(a.active&&void 0!==a.sd)return Number(a.sd-a.Je)},sl=function(){var a=jl();return a.active&&a.Ka?a.tcString||"":""},tl=function(a){if(!fl.hasOwnProperty(String(a)))return!0;var b=jl();return b.active&&b.Ka?!!b.Ka[String(a)]:!0};function ul(a,b,c){function d(q){var t;R.reported_gclid||(R.reported_gclid={});t=R.reported_gclid;var r=f+(q?"gcu":"gcs");if(!t[r]){t[r]=!0;var u=[],v=function(A,z){z&&u.push(A+"="+encodeURIComponent(z))},w="https://www.google.com";if(Xf()){var y=dg(H.o);v("gcs",eg());q&&v("gcu","1");v("rnd",m);if((!f||g&&"aw.ds"!==g)&&dg(H.o)){var x=Mi("_gcl_aw");v("gclaw",x.join("."))}v("url",String(C.location).split(/[?#]/)[0]);v("dclid",vl(b,h));!y&&b&&(w="https://pagead2.googlesyndication.com")}
v("gdpr_consent",sl());"1"===vi(!1)._up&&v("gtm_up","1");v("gclid",vl(b,f));v("gclsrc",g);v("gtm",Qk(!c));var B=w+"/pagead/landing?"+u.join("&");Kf(B)}}var e=Pi(),f=e.gclid||"",g=e.gclsrc,h=e.dclid||"",l=!a&&(!f||g&&"aw.ds"!==g?!1:!0),n=Xf();if(l||n){var m=""+Oh();n?fg(function(){d();dg(H.o)||$f(function(){return d(!0)},H.o)},[H.o]):d()}}function vl(a,b){var c=a&&!dg(H.o);return b&&c?"0":b}
var Fl=function(a){return!(void 0===a||null===a||0===(a+"").length)},Gl=function(a,b){var c;if(2===b.ba)return a("ord",Ka(1E11,1E13)),!0;if(3===b.ba)return a("ord","1"),a("num",Ka(1E11,1E13)),!0;if(4===b.ba)return Fl(b.sessionId)&&a("ord",b.sessionId),!0;if(5===b.ba)c="1";else if(6===b.ba)c=b.Dd;else return!1;Fl(c)&&a("qty",c);Fl(b.ic)&&a("cost",b.ic);Fl(b.transactionId)&&a("ord",b.transactionId);return!0},Il=function(a,b,c){function d(x,B,A){m.hasOwnProperty(x)||(B=String(B),n.push(";"+x+"="+(A?
B:Hl(B))))}var e=a.gd,f=a.Gd,g=a.protocol;g+=f?"//"+e+".fls.doubleclick.net/activityi":"//ad.doubleclick.net/activity";var h=";",l=!dg(H.o)&&a.Kb;l&&(g="https://ade.googlesyndication.com/ddm/activity",h="/",f=!1);var n=[h,"src="+Hl(e),";type="+Hl(a.kd),";cat="+Hl(a.ob)],m=a.Ig||{};Na(m,function(x,B){n.push(";"+Hl(x)+"="+Hl(B+""))});if(Gl(d,a)){Fl(a.Ec)&&d("u",a.Ec);Fl(a.Dc)&&d("tran",a.Dc);d("gtm",Qk());Xf()&&(d("gcs",eg()),c&&d("gcu","1"));(function(x,B){B&&
d(x,B)})("gdpr_consent",sl());"1"===vi(!1)._up&&d("gtm_up","1");!1===a.hg&&d("npa","1");if(a.fd){var q=void 0===a.Kb?!0:!!a.Kb,t=cj("dc",a.Za,q);t&&t.length&&d("gcldc",t.join("."));var r=cj("aw",a.Za,q);r&&r.length&&d("gclaw",r.join("."));var u=dj(q);u&&d("gac",u);Zh({prefix:a.Za,Db:a.Fg,domain:a.Eg,flags:a.oi});var v=Vh[Wh(a.Za)];v&&d("auiddc",v)}Fl(a.zd)&&d("prd",a.zd,!0);Na(a.Kd,function(x,B){d(x,B)});n.push(b||"");if(Fl(a.vc)){var w=a.vc||"";l&&(w=yh(w));
d("~oref",w)}var y=g+n.join("")+"?";f?Cf(y,a.I):Df(y,a.I,a.H)}else O(a.H)},Hl=encodeURIComponent,Jl=function(a,b){Xf()?fg(function(){Il(a,b);dg(H.o)||$f(function(){Il(a,b,!0)},H.o)},[H.o]):Il(a,b)};var hm=function(){var a=!0;tl(7)&&tl(9)&&tl(10)||(a=!1);var b=!0;b&&!tl(3)&&(a=!1);return a},im=function(){var a=!0;tl(3)||(a=!1);return a};function Cm(){var a=R;return a.gcq=a.gcq||new Dm}
var Em=function(a,b,c){Cm().register(a,b,c)},Fm=function(a,b,c,d){Cm().push("event",[b,a],c,d)},Gm=function(a,b){Cm().push("config",[a],b)},Hm=function(a,b,c){Cm().push("get",[a,b],c)},Im={},Jm=function(){this.status=1;this.containerConfig={};this.targetConfig={};this.i={};this.m=null;this.a=!1},Km=function(a,b,c,d,e){this.type=a;this.m=b;this.da=c||"";this.a=d;this.i=e},Dm=function(){this.m={};this.i={};this.a=[]},Lm=function(a,b){var c=hj(b);return a.m[c.containerId]=a.m[c.containerId]||new Jm},
Mm=function(a,b,c){if(b){var d=hj(b);if(d&&1===Lm(a,b).status){Lm(a,b).status=2;var e={};Zg&&(e.timeoutId=C.setTimeout(function(){I(38);Lg()},3E3));a.push("require",[e],d.containerId);Im[d.containerId]=Ta();if(kj()){}else{var g="/gtag/js?id="+encodeURIComponent(d.containerId)+"&l=dataLayer&cx=c",h=("http:"!=C.location.protocol?"https:":"http:")+("//www.googletagmanager.com"+g),l=Ck(c,g)||h;Af(l)}}}},Nm=function(a,b,c,d){if(d.da){var e=Lm(a,d.da),f=e.m;if(f){var g=E(c),h=E(e.targetConfig[d.da]),l=E(e.containerConfig),n=E(e.i),m=E(a.i),q=ih("gtm.uniqueEventId"),t=hj(d.da).prefix,r=Lk(Kk(Jk(Ik(Hk(Gk(Fk(g),h),l),n),m),function(){
ch(q,t,"2");}),function(){ch(q,t,"3");});try{ch(q,t,"1");f(d.da,b,d.m,r)}catch(u){ch(q,t,"4");}}}};
Dm.prototype.register=function(a,b,c){if(3!==Lm(this,a).status){Lm(this,a).m=b;Lm(this,a).status=3;c&&(Lm(this,a).i=c);var d=hj(a),e=Im[d.containerId];if(void 0!==e){var f=R[d.containerId].bootstrap,g=d.prefix.toUpperCase();R[d.containerId]._spx&&(g=g.toLowerCase());var h=ih("gtm.uniqueEventId"),l=g,n=Ta()-f;if(Zg&&!Qg[h]){h!==Mg&&(Kg(),Mg=h);var m=l+"."+Math.floor(f-e)+"."+Math.floor(n);Vg=Vg?Vg+","+m:"&cl="+m}delete Im[d.containerId]}this.flush()}};
Dm.prototype.push=function(a,b,c,d){var e=Math.floor(Ta()/1E3);Mm(this,c,b[0][H.Ga]||this.i[H.Ga]);this.a.push(new Km(a,e,c,b,d));d||this.flush()};
Dm.prototype.flush=function(a){for(var b=this;this.a.length;){var c=this.a[0];if(c.i)c.i=!1,this.a.push(c);else switch(c.type){case "require":if(3!==Lm(this,c.da).status&&!a)return;Zg&&C.clearTimeout(c.a[0].timeoutId);break;case "set":Na(c.a[0],function(m,q){E($a(m,q),b.i)});break;case "config":var d=c.a[0],e=!!d[H.Wb];delete d[H.Wb];var f=Lm(this,c.da),g=hj(c.da),h=g.containerId===g.id;e||(h?f.containerConfig={}:f.targetConfig[c.da]={});f.a&&e||Nm(this,H.ia,d,c);f.a=!0;delete d[H.ib];h?E(d,f.containerConfig):
E(d,f.targetConfig[c.da]);break;case "event":Nm(this,c.a[1],c.a[0],c);break;case "get":}this.a.shift()}};var Om=function(a,b,c){};var Pm=function(a,b,c,d){};var Qm=function(a){};var Rm=function(a,b,c){};var Sm=function(a,b){return!0};var Tm=function(a,b){var c;return c};var Um=function(a){};var Vm=!1,Wm=[];function Xm(){if(!Vm){Vm=!0;for(var a=0;a<Wm.length;a++)O(Wm[a])}}var Ym=function(a){Vm?O(a):Wm.push(a)};var Zm=function(a){F(this.i.a,["listener:!Fn"],arguments);Le(this,"process_dom_events","window","load");Ym(mb(a))};var $m=function(a,b){var c;var d=tb(c,this.m);void 0===d&&void 0!==c&&I(45);return d};var an=function(a){var b;var h=tb(b,this.m);void 0===h&&void 0!==b&&I(45);return h};var bn=function(a,b){var c=null;F(this.i.a,["functionPath:!string","arrayPath:!string"],arguments);Le(this,"access_globals","readwrite",a);Le(this,"access_globals","readwrite",b);var d=a.split("."),e=Za(d),f=d[d.length-1];if(void 0===e)throw Error("Path "+a+" does not exist.");var g=e[f];if(g&&!Fa(g))return null;if(g)return tb(g,this.m);var h;g=function(){if(!Fa(h.push))throw Error("Object at "+b+" in window is not an array.");h.push.call(h,
arguments)};e[f]=g;var l=b.split("."),n=Za(l),m=l[l.length-1];if(void 0===n)throw Error("Path "+l+" does not exist.");h=n[m];void 0===h&&(h=[],n[m]=h);c=function(){g.apply(g,Array.prototype.slice.call(arguments,0))};return tb(c,this.m)};var cn=function(a){var b;F(this.i.a,["path:!string"],arguments);Le(this,"access_globals","readwrite",a);var c=a.split("."),d=Za(c),e=c[c.length-1];if(void 0===d)throw Error("Path "+a+" does not exist.");var f=d[e];void 0===f&&(f=[],d[e]=f);b=function(){if(!Fa(f.push))throw Error("Object at "+a+" in window is not an array.");f.push.apply(f,Array.prototype.slice.call(arguments,0))};return tb(b,this.m)};var dn=function(a){var b;return b};var en=function(a,b){b=void 0===b?!0:b;var c;return c};var fn=function(a){var b=null;return b};var gn=function(a,b){var c;return c};var hn=function(a,b){var c;return c};var jn=function(a){var b="";return b};var kn=function(a){var b="";return b};var Xe=function(){Le(this,"get_user_agent");return C.navigator.userAgent};var ln=function(a,b){};var mn={},nn=function(a,b,c,d){F(this.i.a,["url:!string","onSuccess:?Fn","onFailure:?Fn","cacheToken:?string"],arguments);Le(this,"inject_script",a);var e=this.m,f=function(){b instanceof bb&&b.Ma(e)},g=function(){c instanceof bb&&c.Ma(e)};if(!d){Af(a,f,g);return}var h=d;mn[h]?(mn[h].onSuccess.push(f),mn[h].onFailure.push(g)):(mn[h]={onSuccess:[f],onFailure:[g]},f=function(){for(var l=mn[h].onSuccess,n=0;n<l.length;n++)O(l[n]);l.push=function(m){O(m);
return 0}},g=function(){for(var l=mn[h].onFailure,n=0;n<l.length;n++)O(l[n]);mn[h]=null},Af(a,f,g));};var on=function(){return!1},pn={getItem:function(a){var b=null;return b},setItem:function(a,
b){return!1},removeItem:function(a){}};var qn=function(){};var rn=function(a,b){var c=!1;return c};var sn=function(){var a="";return a};var tn=function(){var a="";return a};var un=function(a,b,c){};var vn=function(a,b,c,d){var e=this;d=void 0===d?!0:d;var f=!1;return f};var wn=function(a,b,c){F(this.i.a,["path:!string","value:?*","overrideExisting:?boolean"],arguments);Le(this,"access_globals","readwrite",a);var d=a.split("."),e=C,f;for(f=0;f<d.length-1;f++)if(e=e[d[f]],void 0===e)return!1;if(void 0===e[d[f]]||c)return e[d[f]]=sb(b,this.m),!0;return!1};var xn=function(a){for(var b=[],c=0,d=0;d<a.length;d++){var e=a.charCodeAt(d);128>e?b[c++]=e:(2048>e?b[c++]=e>>6|192:(55296==(e&64512)&&d+1<a.length&&56320==(a.charCodeAt(d+1)&64512)?(e=65536+((e&1023)<<10)+(a.charCodeAt(++d)&1023),b[c++]=e>>18|240,b[c++]=e>>12&63|128):b[c++]=e>>12|224,b[c++]=e>>6&63|128),b[c++]=e&63|128)}return b};var yn=function(a,b,c){var d=this;};var zn={},An={};zn.getItem=function(a){var b=null;return b};
zn.setItem=function(a,b){};
zn.removeItem=function(a){};zn.clear=function(){};var Bn=function(a){var b;return b};var Jc=function(){var a=new We;kj()?(a.add("injectHiddenIframe",Ea),a.add("injectScript",Ea)):(a.add("injectHiddenIframe",ln),a.add("injectScript",nn));var b=un;a.add("Math",Ee());a.add("TestHelper",Ze());a.add("addEventCallback",Qm);a.add("aliasInWindow",Sm);a.add("assertApi",Ae);a.add("assertThat",Be);a.add("callInWindow",
Tm);a.add("callLater",Um);a.add("copyFromDataLayer",$m);a.add("copyFromWindow",an);a.add("createArgumentsQueue",bn);a.add("createQueue",cn);a.add("decodeUri",Fe);a.add("decodeUriComponent",Ge);a.add("encodeUri",He);a.add("encodeUriComponent",Ie);a.add("fail",Je);a.add("fromBase64",dn,!("atob"in C));a.add("generateRandom",Ke);a.add("getContainerVersion",Me);a.add("getCookieValues",en);a.add("getQueryParameters",gn);a.add("getReferrerQueryParameters",hn);a.add("getReferrerUrl",jn);a.add("getTimestamp",
Ne);a.add("getTimestampMillis",Ne);a.add("getType",Oe);a.add("getUrl",kn);a.add("localStorage",pn,!on());a.add("logToConsole",qn);a.add("makeInteger",Qe);a.add("makeNumber",Re);a.add("makeString",Se);a.add("makeTableMap",Te);a.add("mock",Ve);a.add("queryPermission",rn);a.add("readCharacterSet",sn);a.add("readTitle",tn);a.add("sendPixel",b);a.add("setCookie",vn);a.add("setInWindow",wn);a.add("sha256",yn);a.add("templateStorage",zn);a.add("toBase64",Bn,!("btoa"in C));a.add("JSON",Pe(function(c){var d=this.m.a;d&&d.log.call(this,"error",c)}));
return function(c){var d;if(a.a.hasOwnProperty(c))d=a.get(c,this);else{var e;if(e=a.i.hasOwnProperty(c))b:{var f=this.m.a;if(f){var g=f.ub();if(g&&0!==g.indexOf("__cvt_")){e=!0;break b}}e=!1}if(e)d=a.i.hasOwnProperty(c)?a.i[c]:void 0;else throw Error(c+" is not a valid API name.");}return d}};var Hc,Qd;
function Cn(){var a=data.runtime||[],b=data.runtime_lines;Hc=new Fc;Dn();hd=function(e,f,g){En(f);var h=new gb;Na(f,function(r,u){var v=tb(u);void 0===v&&void 0!==u&&I(44);h.set(r,v)});Hc.a.a.s=Dd();var l={mg:Rd(e),eventId:void 0!==g?g.id:void 0,ub:function(){return e},log:function(){}};if(ok()){var n=pk(),m=void 0,q=void 0;l.fa={i:{},a:function(r,u,v){1===u&&(m=r);7===u&&(q=v);n(r,u,v)},m:Ue()};l.log=function(r,u){if(m){var v=Array.prototype.slice.call(arguments,1);n(m,4,{level:r,source:q,message:v})}}}var t=
Ic(l,[e,h]);Hc.a.a.s=void 0;t instanceof qa&&"return"===t.a&&(t=t.i);return sb(t)};Kc();for(var c=0;c<a.length;c++){var d=a[c];if(!Ha(d)||3>d.length){if(0===d.length)continue;break}b&&b[c]&&b[c].length&&zd(d,b[c]);Hc.nc(d)}}function En(a){var b=a.gtmOnSuccess,c=a.gtmOnFailure;Fa(b)&&(a.gtmOnSuccess=function(){O(b)});Fa(c)&&(a.gtmOnFailure=function(){O(c)})}
function Dn(){var a=Hc;R.SANDBOXED_JS_SEMAPHORE=R.SANDBOXED_JS_SEMAPHORE||0;Lc(a,function(b,c,d){R.SANDBOXED_JS_SEMAPHORE++;try{return b.apply(c,d)}finally{R.SANDBOXED_JS_SEMAPHORE--}})}function Fn(a){void 0!==a&&Na(a,function(b,c){for(var d=0;d<c.length;d++){var e=c[d].replace(/^_*/,"");Gg[e]=Gg[e]||[];Gg[e].push(b)}})};var Gn="HA GF GP G UA AW DC".split(" "),Hn=!1,In={},Jn=!1;function Kn(a,b){var c={event:a};b&&(c.eventModel=E(b),b[H.Kc]&&(c.eventCallback=b[H.Kc]),b[H.Xb]&&(c.eventTimeout=b[H.Xb]));return c}function Ln(){return Hn}
var On={config:function(a){},event:function(a){var b=a[1];if(p(b)&&!(3<a.length)){var c;if(2<a.length){if(!kb(a[2])&&
void 0!=a[2])return;c=a[2]}var d=Kn(b,c);return d}},js:function(a){if(2==a.length&&a[1].getTime)return Jn=!0,Ln(),{event:"gtm.js","gtm.start":a[1].getTime()}},policy:function(a){if(3===a.length){var b=a[1],c=a[2],d=Qd.i;d.a[b]?d.a[b].push(c):d.a[b]=[c]}},set:function(a){var b;2==a.length&&kb(a[1])?b=E(a[1]):3==a.length&&p(a[1])&&(b={},kb(a[2])||Ha(a[2])?b[a[1]]=E(a[2]):b[a[1]]=a[2]);if(b){b._clear=!0;return b}},consent:function(a){if(3===a.length){var b=function(){Ln()&&E(a[2],{subcommand:a[1]})};I(39);var c=a[1];"default"===c?(b(),bg(a[2])):"update"===c&&(b(),cg(a[2]))}}};var Pn={policy:!0};var Qn=function(a,b){var c=a.hide;if(c&&void 0!==c[b]&&c.end){c[b]=!1;var d=!0,e;for(e in c)if(c.hasOwnProperty(e)&&!0===c[e]){d=!1;break}d&&(c.end(),c.end=null)}},Sn=function(a){var b=Rn(),c=b&&b.hide;c&&c.end&&(c[a]=!0)};var jo=function(a){if(io(a))return a;this.a=a};jo.prototype.Zg=function(){return this.a};var io=function(a){return!a||"object"!==ib(a)||kb(a)?!1:"getUntrustedUpdateValue"in a};jo.prototype.getUntrustedUpdateValue=jo.prototype.Zg;var ko=[],lo=!1,mo=function(a){return C["dataLayer"].push(a)},no=function(a){var b=R["dataLayer"],c=b?b.subscribers:1,d=0;return function(){++d===c&&a()}};
function oo(a){var b=a._clear;Na(a,function(f,g){"_clear"!==f&&(b&&lh(f,void 0),lh(f,g))});Cg||(Cg=a["gtm.start"]);var c=a.event,d=a["gtm.uniqueEventId"];if(!c)return!1;d||(d=Hg(),a["gtm.uniqueEventId"]=d,lh("gtm.uniqueEventId",d));var e=po(a);switch(c){case "gtm.init":I(19),e&&I(20)}return e}
function po(a){var b=a.event,c=a["gtm.uniqueEventId"],d,e=R.zones;d=e?e.checkState(Md.C,c):Hj;return d.active?Ak(c,b,d.isAllowed,a.eventCallback,a.eventTimeout)?!0:!1:!1}
function qo(){for(var a=!1;!lo&&0<ko.length;){lo=!0;delete fh.eventModel;hh();var b=ko.shift();if(null!=b){var c=io(b);if(c){var d=b;b=io(d)?d.getUntrustedUpdateValue():void 0;for(var e=["gtm.allowlist","gtm.blocklist","gtm.whitelist","gtm.blacklist","tagTypeBlacklist"],f=0;f<e.length;f++){var g=e[f],h=ih(g,1);if(Ha(h)||kb(h))h=E(h);gh[g]=h}}try{if(Fa(b))try{b.call(jh)}catch(v){}else if(Ha(b)){var l=
b;if(p(l[0])){var n=l[0].split("."),m=n.pop(),q=l.slice(1),t=ih(n.join("."),2);if(void 0!==t&&null!==t)try{t[m].apply(t,q)}catch(v){}}}else{if(Oa(b)){a:{var r=b;if(r.length&&p(r[0])){var u=On[r[0]];if(u&&(!c||!Pn[r[0]])){b=u(r);break a}}b=void 0}if(!b){lo=!1;continue}}a=oo(b)||a}}finally{c&&hh(!0)}}lo=!1}return!a}
function ro(){var a=qo();try{Qn(C["dataLayer"],Md.C)}catch(b){}return a}
var to=function(){var a=yf("dataLayer",[]),b=yf("google_tag_manager",{});b=b["dataLayer"]=b["dataLayer"]||{};Pj(function(){b.gtmDom||(b.gtmDom=!0,a.push({event:"gtm.dom"}))});Ym(function(){b.gtmLoad||(b.gtmLoad=!0,a.push({event:"gtm.load"}))});b.subscribers=(b.subscribers||0)+1;var c=a.push;a.push=function(){var e;if(0<R.SANDBOXED_JS_SEMAPHORE){e=[];for(var f=0;f<arguments.length;f++)e[f]=new jo(arguments[f])}else e=[].slice.call(arguments,0);var g=c.apply(a,e);ko.push.apply(ko,e);if(300<
this.length)for(I(4);300<this.length;)this.shift();var h="boolean"!==typeof g||g;return qo()&&h};var d=a.slice(0);ko.push.apply(ko,d);so()&&O(ro)},so=function(){var a=!0;return a};var uo={};uo.Yb=new String("undefined");
var vo=function(a){this.a=function(b){for(var c=[],d=0;d<a.length;d++)c.push(a[d]===uo.Yb?b:a[d]);return c.join("")}};vo.prototype.toString=function(){return this.a("undefined")};vo.prototype.valueOf=vo.prototype.toString;uo.Sf=vo;uo.Yc={};uo.Gg=function(a){return new vo(a)};var wo={};uo.Nh=function(a,b){var c=Hg();wo[c]=[a,b];return c};uo.se=function(a){var b=a?0:1;return function(c){var d=wo[c];if(d&&"function"===typeof d[b])d[b]();wo[c]=void 0}};uo.jh=function(a){for(var b=!1,c=!1,d=2;d<a.length;d++)b=
b||8===a[d],c=c||16===a[d];return b&&c};uo.Fh=function(a){if(a===uo.Yb)return a;var b=Hg();uo.Yc[b]=a;return'google_tag_manager["'+Md.C+'"].macro('+b+")"};uo.wh=function(a,b,c){a instanceof uo.Sf&&(a=a.a(uo.Nh(b,c)),b=Ea);return{md:a,I:b}};var xo=function(a,b,c){function d(f,g){var h=f[g];return h}var e={event:b,"gtm.element":a,"gtm.elementClasses":d(a,"className"),"gtm.elementId":a["for"]||Gf(a,"id")||"","gtm.elementTarget":a.formTarget||d(a,"target")||""};c&&(e["gtm.triggers"]=c.join(","));e["gtm.elementUrl"]=(a.attributes&&a.attributes.formaction?a.formAction:"")||a.action||d(a,"href")||a.src||a.code||a.codebase||
"";return e},yo=function(a){R.hasOwnProperty("autoEventsSettings")||(R.autoEventsSettings={});var b=R.autoEventsSettings;b.hasOwnProperty(a)||(b[a]={});return b[a]},zo=function(a,b,c){yo(a)[b]=c},Ao=function(a,b,c,d){var e=yo(a),f=Ua(e,b,d);e[b]=c(f)},Bo=function(a,b,c){var d=yo(a);return Ua(d,b,c)};var Co=["input","select","textarea"],Do=["button","hidden","image","reset","submit"],Eo=function(a){var b=a.tagName.toLowerCase();return!Ja(Co,function(c){return c===b})||"input"===b&&Ja(Do,function(c){return c===a.type.toLowerCase()})?!1:!0},Fo=function(a){return a.form?a.form.tagName?a.form:K.getElementById(a.form):Jf(a,["form"],100)},Go=function(a,b,c){if(!a.elements)return 0;for(var d=b.getAttribute(c),e=0,f=1;e<a.elements.length;e++){var g=a.elements[e];if(Eo(g)){if(g.getAttribute(c)===d)return f;
f++}}return 0};var Ho=!!C.MutationObserver,Io=void 0,Jo=function(a){if(!Io){var b=function(){var c=K.body;if(c)if(Ho)(new MutationObserver(function(){for(var e=0;e<Io.length;e++)O(Io[e])})).observe(c,{childList:!0,subtree:!0});else{var d=!1;Ef(c,"DOMNodeInserted",function(){d||(d=!0,O(function(){d=!1;for(var e=0;e<Io.length;e++)O(Io[e])}))})}};Io=[];K.body?b():O(b)}Io.push(a)};
var Uo=function(){var a=K.body,b=K.documentElement||a&&a.parentElement,c,d;if(K.compatMode&&"BackCompat"!==K.compatMode)c=b?b.clientHeight:0,d=b?b.clientWidth:0;else{var e=function(f,g){return f&&g?Math.min(f,g):Math.max(f,g)};I(7);c=e(b?b.clientHeight:0,a?a.clientHeight:0);d=e(b?b.clientWidth:0,a?a.clientWidth:0)}return{width:d,height:c}},Vo=function(a){var b=Uo(),c=b.height,d=b.width,e=a.getBoundingClientRect(),f=e.bottom-e.top,g=e.right-e.left;return f&&g?(1-Math.min((Math.max(0-e.left,0)+Math.max(e.right-
d,0))/g,1))*(1-Math.min((Math.max(0-e.top,0)+Math.max(e.bottom-c,0))/f,1)):0},Wo=function(a){if(K.hidden)return!0;var b=a.getBoundingClientRect();if(b.top==b.bottom||b.left==b.right||!C.getComputedStyle)return!0;var c=C.getComputedStyle(a,null);if("hidden"===c.visibility)return!0;for(var d=a,e=c;d;){if("none"===e.display)return!0;var f=e.opacity,g=e.filter;if(g){var h=g.indexOf("opacity(");0<=h&&(g=g.substring(h+8,g.indexOf(")",h)),"%"==g.charAt(g.length-1)&&(g=g.substring(0,g.length-1)),f=Math.min(g,
f))}if(void 0!==f&&0>=f)return!0;(d=d.parentElement)&&(e=C.getComputedStyle(d,null))}return!1};
var cp=function(a,b,c){function d(){var g=a();f+=e?(Ta()-e)*g.playbackRate/1E3:0;e=Ta()}var e=0,f=0;return{mc:function(g,h,l){var n=a(),m=n.te,q=void 0!==l?Math.round(l):void 0!==h?Math.round(n.te*h):Math.round(n.Hg),t=void 0!==h?Math.round(100*h):0>=m?0:Math.round(q/m*100),r=K.hidden?!1:.5<=Vo(c);d();var u=xo(c,"gtm.video",[b]);u["gtm.videoProvider"]="youtube";u["gtm.videoStatus"]=g;u["gtm.videoUrl"]=n.url;u["gtm.videoTitle"]=n.title;u["gtm.videoDuration"]=Math.round(m);u["gtm.videoCurrentTime"]=
Math.round(q);u["gtm.videoElapsedTime"]=Math.round(f);u["gtm.videoPercent"]=t;u["gtm.videoVisible"]=r;mo(u)},Ph:function(){e=Ta()},ad:function(){d()}}};var dp=C.clearTimeout,ep=C.setTimeout,S=function(a,b,c){if(kj()){b&&O(b)}else return Af(a,b,c)},fp=function(){return new Date},gp=function(){return C.location.href},hp=function(a){return vh(xh(a),"fragment")},ip=function(a){return wh(xh(a))},jp=function(a,b){return ih(a,b||2)},kp=function(a,b,c){var d;b?(a.eventCallback=b,c&&(a.eventTimeout=c),d=mo(a)):d=mo(a);return d},lp=function(a,b){C[a]=b},V=function(a,b,c){b&&
(void 0===C[a]||c&&!C[a])&&(C[a]=b);return C[a]},mp=function(a,b,c){return Bh(a,b,void 0===c?!0:!!c)},np=function(a,b,c){return 0===Lh(a,b,c)},op=function(a,b){if(kj()){b&&O(b)}else Cf(a,b)},pp=function(a){return!!Bo(a,"init",!1)},qp=function(a){zo(a,"init",!0)},rp=function(a,b){var c=(void 0===b?0:b)?"www.googletagmanager.com/gtag/js":Bg;c+="?id="+encodeURIComponent(a)+"&l=dataLayer";S(mj("https://","http://",c))},sp=function(a,
b){var c=a[b];return c};
var tp=uo.wh;function Qp(a,b){a=String(a);b=String(b);var c=a.length-b.length;return 0<=c&&a.indexOf(b,c)==c}var Rp=new La;function Sp(a,b){function c(g){var h=xh(g),l=vh(h,"protocol"),n=vh(h,"host",!0),m=vh(h,"port"),q=vh(h,"path").toLowerCase().replace(/\/$/,"");if(void 0===l||"http"==l&&"80"==m||"https"==l&&"443"==m)l="web",m="default";return[l,n,m,q]}for(var d=c(String(a)),e=c(String(b)),f=0;f<d.length;f++)if(d[f]!==e[f])return!1;return!0}
function Tp(a){return Up(a)?1:0}
function Up(a){var b=a.arg0,c=a.arg1;if(a.any_of&&Ha(c)){for(var d=0;d<c.length;d++)if(Tp({"function":a["function"],arg0:b,arg1:c[d]}))return!0;return!1}switch(a["function"]){case "_cn":return 0<=String(b).indexOf(String(c));case "_css":var e;a:{if(b){var f=["matches","webkitMatchesSelector","mozMatchesSelector","msMatchesSelector","oMatchesSelector"];try{for(var g=0;g<f.length;g++)if(b[f[g]]){e=b[f[g]](c);break a}}catch(t){}}e=!1}return e;case "_ew":return Qp(b,c);case "_eq":return String(b)==String(c);
case "_ge":return Number(b)>=Number(c);case "_gt":return Number(b)>Number(c);case "_lc":var h;h=String(b).split(",");return 0<=Ia(h,String(c));case "_le":return Number(b)<=Number(c);case "_lt":return Number(b)<Number(c);case "_re":var l;var n=a.ignore_case?"i":void 0;try{var m=String(c)+n,q=Rp.get(m);q||(q=new RegExp(c,n),Rp.set(m,q));l=q.test(b)}catch(t){l=!1}return l;case "_sw":return 0==String(b).indexOf(String(c));case "_um":return Sp(b,c)}return!1};var Vp={},Wp=encodeURI,Y=encodeURIComponent,Xp=Df;var Yp=function(a,b){if(!a)return!1;var c=vh(xh(a),"host");if(!c)return!1;for(var d=0;b&&d<b.length;d++){var e=b[d]&&b[d].toLowerCase();if(e){var f=c.length-e.length;0<f&&"."!=e.charAt(0)&&(f--,e="."+e);if(0<=f&&c.indexOf(e,f)==f)return!0}}return!1};
var Zp=function(a,b,c){for(var d={},e=!1,f=0;a&&f<a.length;f++)a[f]&&a[f].hasOwnProperty(b)&&a[f].hasOwnProperty(c)&&(d[a[f][b]]=a[f][c],e=!0);return e?d:null};Vp.kh=function(){var a=!1;return a};function xr(){return C.gaGlobal=C.gaGlobal||{}}var yr=function(){var a=xr();a.hid=a.hid||Ka();return a.hid},zr=function(a,b){var c=xr();if(void 0==c.vid||b&&!c.from_cookie)c.vid=a,c.from_cookie=b};var Ir=window,Jr=document,Kr=function(a){var b=Ir._gaUserPrefs;if(b&&b.ioo&&b.ioo()||a&&!0===Ir["ga-disable-"+a])return!0;try{var c=Ir.external;if(c&&c._gaUserPrefs&&"oo"==c._gaUserPrefs)return!0}catch(f){}for(var d=zh("AMP_TOKEN",String(Jr.cookie),!0),e=0;e<d.length;e++)if("$OPT_OUT"==d[e])return!0;return Jr.getElementById("__gaOptOutExtension")?!0:!1};
function Nr(a){delete a.eventModel[H.ib];Pr(a.eventModel)}var Pr=function(a){Na(a,function(c){"_"===c.charAt(0)&&delete a[c]});var b=a[H.oa]||{};Na(b,function(c){"_"===c.charAt(0)&&delete b[c]})};var Sr=function(a,b,c){Fm(b,c,a)},Tr=function(a,b,c){Fm(b,c,a,!0)},Vr=function(a,b){};
function Ur(a,b){}var Z={b:{}};
Z.b.gaawc=["google"],function(){function a(b,c,d){for(var e=0;e<c.length;e++)b.hasOwnProperty(c[e])&&(b[c[e]]=d(b[c[e]]))}(function(b){Z.__gaawc=b;Z.__gaawc.g="gaawc";Z.__gaawc.h=!0;Z.__gaawc.priorityOverride=10})(function(b){var c=String(b.vtp_measurementId),d=Zp(b.vtp_fieldsToSet,"name","value")||{};if(d.hasOwnProperty(H.oa)||b.vtp_userProperties){var e=d[H.oa]||{};E(Zp(b.vtp_userProperties,"name","value"),e);d[H.oa]=e}a(d,H.bf,function(f){return Qa(f)});a(d,H.df,function(f){return Number(f)});
d.send_page_view=b.vtp_sendPageView;Gm(d,c);O(b.vtp_gtmOnSuccess)})}();

Z.b.jsm=["customScripts"],function(){(function(a){Z.__jsm=a;Z.__jsm.g="jsm";Z.__jsm.h=!0;Z.__jsm.priorityOverride=0})(function(a){if(void 0!==a.vtp_javascript){var b=a.vtp_javascript;try{var c=V("google_tag_manager");return c&&c.e&&c.e(b)}catch(d){}}})}();
Z.b.flc=[],function(){function a(b,c){c=c?c.slice(0,-1):void 0;Jl(b,c)}(function(b){Z.__flc=b;Z.__flc.g="flc";Z.__flc.h=!0;Z.__flc.priorityOverride=0})(function(b){var c=!b.hasOwnProperty("vtp_enableConversionLinker")||b.vtp_enableConversionLinker,d=Zp(b.vtp_customVariable||[],"key","value")||{},e={ob:b.vtp_activityTag,fd:c,Za:b.vtp_conversionCookiePrefix||void 0,ic:void 0,ba:{UNIQUE:3,SESSION:4}[b.vtp_ordinalType]||2,gd:b.vtp_advertiserId,kd:b.vtp_groupTag,H:b.vtp_gtmOnFailure,I:b.vtp_gtmOnSuccess,
vc:b.vtp_useImageTag?void 0:b.vtp_url,protocol:"",Dd:void 0,Gd:!b.vtp_useImageTag,sessionId:b.vtp_sessionId,Dc:b.vtp_transactionVariable,transactionId:void 0,Ec:b.vtp_userVariable,Kd:d},f=!dg(H.o)&&void 0!=jp(H.S)&&!1!==jp(H.S);e.Kb=f;if(b.vtp_enableAttribution){var g=b.vtp_attributionFields||[];if(g.length){S("//www.gstatic.com/attribution/collection/attributiontools.js",function(){a(e,V("google_attr").build([Zp(g,"key","value")||{}]))},b.vtp_gtmOnFailure);return}}a(e)})}();

Z.b.e=["google"],function(){(function(a){Z.__e=a;Z.__e.g="e";Z.__e.h=!0;Z.__e.priorityOverride=0})(function(a){return String(nh(a.vtp_gtmEventId,"event"))})}();
Z.b.f=["google"],function(){(function(a){Z.__f=a;Z.__f.g="f";Z.__f.h=!0;Z.__f.priorityOverride=0})(function(a){var b=jp("gtm.referrer",1)||K.referrer;return b?a.vtp_component&&"URL"!=a.vtp_component?vh(xh(String(b)),a.vtp_component,a.vtp_stripWww,a.vtp_defaultPages,a.vtp_queryKey):ip(String(b)):String(b)})}();
Z.b.cl=["google"],function(){function a(b){var c=b.target;if(c){var d=xo(c,"gtm.click");kp(d)}}(function(b){Z.__cl=b;Z.__cl.g="cl";Z.__cl.h=!0;Z.__cl.priorityOverride=0})(function(b){if(!pp("cl")){var c=V("document");Ef(c,"click",a,!0);qp("cl")}O(b.vtp_gtmOnSuccess)})}();
Z.b.j=["google"],function(){(function(a){Z.__j=a;Z.__j.g="j";Z.__j.h=!0;Z.__j.priorityOverride=0})(function(a){for(var b=String(a.vtp_name).split("."),c=V(b.shift()),d=0;d<b.length;d++)c=c&&c[b[d]];return c})}();Z.b.k=["google"],function(){(function(a){Z.__k=a;Z.__k.g="k";Z.__k.h=!0;Z.__k.priorityOverride=0})(function(a){return mp(a.vtp_name,jp("gtm.cookie",1),!!a.vtp_decodeCookie)[0]})}();

Z.b.fls=[],function(){function a(b,c){c=c?c.slice(0,-1):void 0;Jl(b,c)}(function(b){Z.__fls=b;Z.__fls.g="fls";Z.__fls.h=!0;Z.__fls.priorityOverride=0})(function(b){var c;if(b.vtp_enableProductReporting){var d=function(t){t=t||[];for(var r=[],u=[["i","id"],["p","price"],["q","quantity"],["c","country"],["l","language"],["a","accountId"]],v=0;v<t.length;v++)for(var w=0;w<u.length;w++){var y=u[w],x=t[v][y[1]];void 0!==x&&r.push(y[0]+
(v+1)+":"+Y(x))}return r.join("|")};switch(b.vtp_dataSource){case "DATA_LAYER":c=d(jp("ecommerce.purchase.products"));break;case "JSON":c=d(b.vtp_productData);break;case "STRING":for(var e=(b.vtp_productData||"").split("|"),f=0;f<e.length;f++){var g=e[f].split(":");g[1]=g[1]&&Y(g[1])||"";e[f]=g.join(":")}c=e.join("|")}}var h=!b.hasOwnProperty("vtp_enableConversionLinker")||b.vtp_enableConversionLinker,l=Zp(b.vtp_customVariable||
[],"key","value")||{},n={ob:b.vtp_activityTag,fd:h,Za:b.vtp_conversionCookiePrefix||void 0,ic:b.vtp_revenue,ba:"ITEM_SOLD"===b.vtp_countingMethod?6:5,gd:b.vtp_advertiserId,kd:b.vtp_groupTag,H:b.vtp_gtmOnFailure,I:b.vtp_gtmOnSuccess,vc:b.vtp_useImageTag?void 0:b.vtp_url,zd:c,protocol:"",Dd:b.vtp_quantity,Gd:!b.vtp_useImageTag,Dc:b.vtp_transactionVariable,transactionId:b.vtp_orderId,Ec:b.vtp_userVariable,Kd:l},m=!dg(H.o)&&void 0!=jp(H.S)&&!1!==jp(H.S);n.Kb=m;if(b.vtp_enableAttribution){var q=b.vtp_attributionFields||
[];if(q.length){S("//www.gstatic.com/attribution/collection/attributiontools.js",function(){a(n,V("google_attr").build([Zp(q,"key","value")||{}]))},b.vtp_gtmOnFailure);return}}a(n)})}();
Z.b.access_globals=["google"],function(){function a(b,c,d){var e={key:d,read:!1,write:!1,execute:!1};switch(c){case "read":e.read=!0;break;case "write":e.write=!0;break;case "readwrite":e.read=e.write=!0;break;case "execute":e.execute=!0;break;default:throw Error("Invalid access_globals request "+c);}return e}(function(b){Z.__access_globals=b;Z.__access_globals.g="access_globals";Z.__access_globals.h=!0;Z.__access_globals.priorityOverride=0})(function(b){for(var c=b.vtp_keys||[],d=b.vtp_createPermissionError,
e=[],f=[],g=[],h=0;h<c.length;h++){var l=c[h],n=l.key;l.read&&e.push(n);l.write&&f.push(n);l.execute&&g.push(n)}return{assert:function(m,q,t){if(!p(t))throw d(m,{},"Key must be a string.");if("read"===q){if(-1<Ia(e,t))return}else if("write"===q){if(-1<Ia(f,t))return}else if("readwrite"===q){if(-1<Ia(f,t)&&-1<Ia(e,t))return}else if("execute"===q){if(-1<Ia(g,t))return}else throw d(m,{},"Operation must be either 'read', 'write', or 'execute', was "+q);throw d(m,{},"Prohibited "+q+" on global variable: "+
t+".");},J:a}})}();Z.b.r=["google"],function(){(function(a){Z.__r=a;Z.__r.g="r";Z.__r.h=!0;Z.__r.priorityOverride=0})(function(a){return Ka(a.vtp_min,a.vtp_max)})}();
Z.b.t=["google"],function(){(function(a){Z.__t=a;Z.__t.g="t";Z.__t.h=!0;Z.__t.priorityOverride=0})(function(){return fp().getTime()})}();
Z.b.u=["google"],function(){var a=function(b){return{toString:function(){return b}}};(function(b){Z.__u=b;Z.__u.g="u";Z.__u.h=!0;Z.__u.priorityOverride=0})(function(b){var c;b.vtp_customUrlSource?c=b.vtp_customUrlSource:c=jp("gtm.url",1);c=c||gp();var d=b[a("vtp_component")];if(!d||"URL"==d)return ip(String(c));var e=xh(String(c)),f;if("QUERY"===d)a:{var g=b[a("vtp_multiQueryKeys").toString()],h=b[a("vtp_queryKey").toString()]||"",l=b[a("vtp_ignoreEmptyQueryParam").toString()],n;g?Ha(h)?n=h:n=String(h).replace(/\s+/g,
"").split(","):n=[String(h)];for(var m=0;m<n.length;m++){var q=vh(e,"QUERY",void 0,void 0,n[m]);if(void 0!=q&&(!l||""!==q)){f=q;break a}}f=void 0}else f=vh(e,d,"HOST"==d?b[a("vtp_stripWww")]:void 0,"PATH"==d?b[a("vtp_defaultPages")]:void 0,void 0);return f})}();
Z.b.v=["google"],function(){(function(a){Z.__v=a;Z.__v.g="v";Z.__v.h=!0;Z.__v.priorityOverride=0})(function(a){var b=a.vtp_name;if(!b||!b.replace)return!1;var c=jp(b.replace(/\\\./g,"."),a.vtp_dataLayerVersion||1);return void 0!==c?c:a.vtp_defaultValue})}();
Z.b.tl=["google"],function(){function a(b){return function(){if(b.rd&&b.ud>=b.rd)b.nd&&V("self").clearInterval(b.nd);else{b.ud++;var c=fp().getTime();kp({event:b.R,"gtm.timerId":b.nd,"gtm.timerEventNumber":b.ud,"gtm.timerInterval":b.interval,"gtm.timerLimit":b.rd,"gtm.timerStartTime":b.$e,"gtm.timerCurrentTime":c,"gtm.timerElapsedTime":c-b.$e,"gtm.triggers":b.ai})}}}(function(b){Z.__tl=b;Z.__tl.g="tl";Z.__tl.h=!0;Z.__tl.priorityOverride=0})(function(b){O(b.vtp_gtmOnSuccess);if(!isNaN(b.vtp_interval)){var c=
{R:b.vtp_eventName,ud:0,interval:Number(b.vtp_interval),rd:isNaN(b.vtp_limit)?0:Number(b.vtp_limit),ai:String(b.vtp_uniqueTriggerId||"0"),$e:fp().getTime()};c.nd=V("self").setInterval(a(c),0>Number(b.vtp_interval)?0:Number(b.vtp_interval))}})}();
Z.b.ua=["google"],function(){function a(m,q){if(Xf()&&!d[m]){var t=function(){var r=dk(),u="gtm"+Hg(),v=l(q),w={name:u};h(v,w,!0);r("create",m,w);r(function(){r.remove(u)})};$f(t,H.L);$f(t,H.o);d[m]=!0}}var b,c={},d={},e=function(m){fg(function(){n(m)},[H.L,H.o])},f={name:!0,clientId:!0,sampleRate:!0,siteSpeedSampleRate:!0,alwaysSendReferrer:!0,allowAnchor:!0,allowLinker:!0,cookieName:!0,cookieDomain:!0,cookieExpires:!0,cookiePath:!0,cookieUpdate:!0,cookieFlags:!0,legacyCookieDomain:!0,legacyHistoryImport:!0,
storage:!0,useAmpClientId:!0,storeGac:!0,_cd2l:!0},g={allowAnchor:!0,allowLinker:!0,alwaysSendReferrer:!0,anonymizeIp:!0,cookieUpdate:!0,exFatal:!0,forceSSL:!0,javaEnabled:!0,legacyHistoryImport:!0,nonInteraction:!0,useAmpClientId:!0,useBeacon:!0,storeGac:!0,allowAdFeatures:!0,allowAdPersonalizationSignals:!0,_cd2l:!0},h=function(m,q,t){var r=0;if(m)for(var u in m)if(m.hasOwnProperty(u)&&(t&&f[u]||!t&&void 0===f[u])){var v=g[u]?Qa(m[u]):m[u];"anonymizeIp"!=u||v||(v=void 0);q[u]=v;r++}return r},l=
function(m){var q={};m.vtp_gaSettings&&E(Zp(m.vtp_gaSettings.vtp_fieldsToSet,"fieldName","value"),q);E(Zp(m.vtp_fieldsToSet,"fieldName","value"),q);dg(H.L)||(q.storage="none");dg(H.o)||(q.allowAdFeatures=!1,q.storeGac=!1);hm()||(q.allowAdFeatures=!1);im()||(q.allowAdPersonalizationSignals=!1);m.vtp_transportUrl&&(q._x_19=m.vtp_transportUrl);return q},n=function(m){function q(ta,
U){void 0!==U&&D("set",ta,U)}var t={},r={},u={},v={};if(m.vtp_gaSettings){var w=m.vtp_gaSettings;E(Zp(w.vtp_contentGroup,"index","group"),r);E(Zp(w.vtp_dimension,"index","dimension"),u);E(Zp(w.vtp_metric,"index","metric"),v);var y=E(w);y.vtp_fieldsToSet=void 0;y.vtp_contentGroup=void 0;y.vtp_dimension=void 0;y.vtp_metric=void 0;m=E(m,y)}E(Zp(m.vtp_contentGroup,"index","group"),r);E(Zp(m.vtp_dimension,"index","dimension"),u);E(Zp(m.vtp_metric,"index","metric"),v);var x=l(m),B=fk(m.vtp_functionName);
if(Fa(B)){var A="",z="";m.vtp_setTrackerName&&"string"==typeof m.vtp_trackerName?""!==m.vtp_trackerName&&(z=m.vtp_trackerName,A=z+"."):(z="gtm"+Hg(),A=z+".");var D=function(ta){var U=[].slice.call(arguments,0);U[0]=A+U[0];B.apply(window,U)},G=function(ta,U){return void 0===U?U:ta(U)},L=function(ta,U){if(U)for(var Bb in U)U.hasOwnProperty(Bb)&&D("set",ta+Bb,U[Bb])},Q=function(){var ta=function(Zr,Ll,$r){if(!kb(Ll))return!1;for(var ae=
Ua(Object(Ll),$r,[]),Fh=0;ae&&Fh<ae.length;Fh++)D(Zr,ae[Fh]);return!!ae&&0<ae.length},U;if(m.vtp_useEcommerceDataLayer){var Bb=!1;Bb||(U=jp("ecommerce",1))}else m.vtp_ecommerceMacroData&&(U=m.vtp_ecommerceMacroData.ecommerce);if(!kb(U))return;U=Object(U);var be=Ua(x,"currencyCode",U.currencyCode);void 0!==be&&D("set","&cu",be);ta("ec:addImpression",
U,"impressions");if(ta("ec:addPromo",U[U.promoClick?"promoClick":"promoView"],"promotions")&&U.promoClick){D("ec:setAction","promo_click",U.promoClick.actionField);return}for(var zc="detail checkout checkout_option click add remove purchase refund".split(" "),Ac="refund purchase remove checkout checkout_option add click detail".split(" "),qb=0;qb<zc.length;qb++){var Cb=U[zc[qb]];if(Cb){ta("ec:addProduct",Cb,"products");D("ec:setAction",zc[qb],Cb.actionField);if(Zg)for(var Tb=0;Tb<Ac.length;Tb++){var fd=
U[Ac[Tb]];if(fd){fd!==Cb&&I(13);break}}break}}},X={name:z};h(x,X,!0);var P=m.vtp_trackingId||t.trackingId;B("create",P,X);D("set","&gtm",Qk(!0));Xf()&&(D("set","&gcs",eg()),a(P,m));x._x_19&&(null==xf&&delete x._x_19,x._x_20&&!c[z]&&(c[z]=!0,B(jk(z,String(x._x_20)))));m.vtp_enableRecaptcha&&
D("require","recaptcha","recaptcha.js");(function(ta,U){void 0!==m[U]&&D("set",ta,m[U])})("nonInteraction","vtp_nonInteraction");L("contentGroup",r);L("dimension",u);L("metric",v);var Aa={};h(x,Aa,!1)&&D("set",Aa);var da;m.vtp_enableLinkId&&D("require","linkid","linkid.js");D("set","hitCallback",function(){var ta=x&&x.hitCallback;
Fa(ta)&&ta();m.vtp_gtmOnSuccess()});if("TRACK_EVENT"==m.vtp_trackType){m.vtp_enableEcommerce&&(D("require","ec","ec.js"),Q());var N={hitType:"event",eventCategory:String(m.vtp_eventCategory||t.category),eventAction:String(m.vtp_eventAction||t.action),eventLabel:G(String,m.vtp_eventLabel||t.label),eventValue:G(Pa,m.vtp_eventValue||t.value)};h(da,N,!1);D("send",N);}else if("TRACK_SOCIAL"==
m.vtp_trackType){}else if("TRACK_TRANSACTION"==m.vtp_trackType){}else if("TRACK_TIMING"==m.vtp_trackType){}else if("DECORATE_LINK"==m.vtp_trackType){}else if("DECORATE_FORM"==m.vtp_trackType){}else if("TRACK_DATA"==m.vtp_trackType){}else{m.vtp_enableEcommerce&&(D("require","ec","ec.js"),Q());if(m.vtp_doubleClick||"DISPLAY_FEATURES"==m.vtp_advertisingFeaturesType){var ra="_dc_gtm_"+String(m.vtp_trackingId).replace(/[^A-Za-z0-9-]/g,
"");D("require","displayfeatures",void 0,{cookieName:ra})}if("DISPLAY_FEATURES_WITH_REMARKETING_LISTS"==m.vtp_advertisingFeaturesType){var yc="_dc_gtm_"+String(m.vtp_trackingId).replace(/[^A-Za-z0-9-]/g,"");D("require","adfeatures",{cookieName:yc})}da?D("send","pageview",da):D("send","pageview");}if(!b){var Sb=
m.vtp_useDebugVersion?"u/analytics_debug.js":"analytics.js";m.vtp_useInternalVersion&&!m.vtp_useDebugVersion&&(Sb="internal/"+Sb);b=!0;var $d=Ck(x._x_19,"/analytics.js"),mf=mj("https:","http:","//www.google-analytics.com/"+Sb,x&&!!x.forceSSL);S("analytics.js"===Sb&&$d?$d:mf,function(){var ta=dk();ta&&ta.loaded||m.vtp_gtmOnFailure();},m.vtp_gtmOnFailure)}}else O(m.vtp_gtmOnFailure)};Z.__ua=e;Z.__ua.g="ua";Z.__ua.h=!0;Z.__ua.priorityOverride=0}();

Z.b.inject_script=["google"],function(){function a(b,c){return{url:c}}(function(b){Z.__inject_script=b;Z.__inject_script.g="inject_script";Z.__inject_script.h=!0;Z.__inject_script.priorityOverride=0})(function(b){var c=b.vtp_urls||[],d=b.vtp_createPermissionError;return{assert:function(e,f){if(!p(f))throw d(e,{},"Script URL must be a string.");try{if(re(xh(f),c))return}catch(g){throw d(e,{},"Invalid script URL filter.");}throw d(e,{},"Prohibited script URL: "+f);},J:a}})}();


Z.b.ytl=["google"],function(){function a(){var w=Math.round(1E9*Math.random())+"";return K.getElementById(w)?a():w}function b(w,y){if(!w)return!1;for(var x=0;x<t.length;x++)if(0<=w.indexOf("//"+t[x]+"/"+y))return!0;return!1}function c(w){var y=-1!==w.indexOf("?")?"&":"?";if(-1<w.indexOf("origin="))return w+y+"enablejsapi=1";if(!u){var x=V("document");u=x.location.protocol+"//"+x.location.hostname;x.location.port&&(u+=":"+x.location.port)}return w+y+"enablejsapi=1&origin="+encodeURIComponent(u)}function d(w,
y){var x=w.getAttribute("src");if(b(x,"embed/")){if(0<x.indexOf("enablejsapi=1"))return!0;if(y)return w.setAttribute("src",c(x)),!0}return!1}function e(w,y){if(!w.getAttribute("data-gtm-yt-inspected-"+y.Jd)&&(w.setAttribute("data-gtm-yt-inspected-"+y.Jd,"true"),d(w,y.ze))){w.id||(w.id=a());var x=V("YT"),B=x.get(w.id);B||(B=new x.Player(w.id));var A=g(B,y),z={},D;for(D in A)z.gb=D,A.hasOwnProperty(z.gb)&&B.addEventListener(z.gb,function(G){return function(L){return A[G.gb](L.data)}}(z)),z={gb:z.gb}}}
function f(w){O(function(){function y(){for(var B=x.getElementsByTagName("iframe"),A=B.length,z=0;z<A;z++)e(B[z],w)}var x=V("document");y();Jo(y)})}function g(w,y){var x,B;function A(){da=cp(function(){return{url:M,title:W,te:J,Hg:w.getCurrentTime(),playbackRate:T}},y.Jd,w.getIframe());J=0;W=M="";T=1;return z}function z(ka){switch(ka){case r.PLAYING:J=Math.round(w.getDuration());M=w.getVideoUrl();if(w.getVideoData){var ra=w.getVideoData();W=ra?ra.title:""}T=w.getPlaybackRate();y.zg?da.mc("start"):
da.ad();N=n(y.Hh,y.Gh,w.getDuration());return D(ka);default:return z}}function D(){xa=w.getCurrentTime();va=fp().getTime();da.Ph();Aa();return G}function G(ka){var ra;switch(ka){case r.ENDED:return Q(ka);case r.PAUSED:ra="pause";case r.BUFFERING:var yc=w.getCurrentTime()-xa;ra=1<Math.abs((fp().getTime()-va)/1E3*T-yc)?"seek":ra||"buffering";w.getCurrentTime()&&(y.yg?da.mc(ra):da.ad());P();return L;case r.UNSTARTED:return A(ka);default:return G}}function L(ka){switch(ka){case r.ENDED:return Q(ka);case r.PLAYING:return D(ka);
case r.UNSTARTED:return A(ka);default:return L}}function Q(){for(;B;){var ka=x;dp(B);ka()}y.xg&&da.mc("complete",1);return A(r.UNSTARTED)}function X(){}function P(){B&&(dp(B),B=0,x=X)}function Aa(){if(N.length&&0!==T){var ka=-1,ra;do{ra=N[0];if(ra.Na>w.getDuration())return;ka=(ra.Na-w.getCurrentTime())/T;if(0>ka&&(N.shift(),0===N.length))return}while(0>ka);x=function(){B=0;x=X;0<N.length&&N[0].Na===ra.Na&&(N.shift(),da.mc("progress",ra.Re,ra.Ye));Aa()};B=ep(x,1E3*ka)}}var da,N=[],J,M,W,T,xa,va,cb=
A(r.UNSTARTED);B=0;x=X;return{onStateChange:function(ka){cb=cb(ka)},onPlaybackRateChange:function(ka){xa=w.getCurrentTime();va=fp().getTime();da.ad();T=ka;P();Aa()}}}function h(w){for(var y=w.split(","),x=y.length,B=[],A=0;A<x;A++){var z=parseInt(y[A],10);isNaN(z)||100<z||0>z||B.push(z/100)}B.sort(function(D,G){return D-G});return B}function l(w){for(var y=w.split(","),x=y.length,B=[],A=0;A<x;A++){var z=parseInt(y[A],10);isNaN(z)||0>z||B.push(z)}B.sort(function(D,G){return D-G});return B}function n(w,
y,x){var B=w.map(function(D){return{Na:D,Ye:D,Re:void 0}});if(!y.length)return B;var A=y.map(function(D){return{Na:D*x,Ye:void 0,Re:D}});if(!B.length)return A;var z=B.concat(A);z.sort(function(D,G){return D.Na-G.Na});return z}function m(w){w.vtp_triggerStartOption?q(w):Pj(function(){q(w)})}function q(w){var y=!!w.vtp_captureStart,x=!!w.vtp_captureComplete,B=!!w.vtp_capturePause,A=h(w.vtp_progressThresholdsPercent+""),z=l(w.vtp_progressThresholdsTimeInSeconds+""),D=!!w.vtp_fixMissingApi;if(y||x||B||
A.length||z.length){var G={zg:y,xg:x,yg:B,Gh:A,Hh:z,ze:D,Jd:void 0===w.vtp_uniqueTriggerId?"":w.vtp_uniqueTriggerId},L=V("YT"),Q=function(){f(G)};O(w.vtp_gtmOnSuccess);if(L)L.ready&&L.ready(Q);else{var X=V("onYouTubeIframeAPIReady");lp("onYouTubeIframeAPIReady",function(){X&&X();Q()});O(function(){for(var P=V("document"),Aa=P.getElementsByTagName("script"),da=Aa.length,N=0;N<da;N++){var J=Aa[N].getAttribute("src");if(b(J,"iframe_api")||b(J,"player_api"))return}for(var M=P.getElementsByTagName("iframe"),
W=M.length,T=0;T<W;T++)if(!v&&d(M[T],G.ze)){S("https://www.youtube.com/iframe_api");v=!0;break}})}}else O(w.vtp_gtmOnSuccess)}var t=["www.youtube.com","www.youtube-nocookie.com"],r={UNSTARTED:-1,ENDED:0,PLAYING:1,PAUSED:2,BUFFERING:3,CUED:5},u,v=!1;Z.__ytl=m;Z.__ytl.g="ytl";Z.__ytl.h=!0;Z.__ytl.priorityOverride=0}();
Z.b.cid=["google"],function(){(function(a){Z.__cid=a;Z.__cid.g="cid";Z.__cid.h=!0;Z.__cid.priorityOverride=0})(function(){return Md.C})}();

Z.b.gclidw=["google"],function(){var a=["aw","dc","gf","ha","gp"];(function(b){Z.__gclidw=b;Z.__gclidw.g="gclidw";Z.__gclidw.h=!0;Z.__gclidw.priorityOverride=100})(function(b){O(b.vtp_gtmOnSuccess);var c,d,e,f;b.vtp_enableCookieOverrides&&(e=b.vtp_cookiePrefix,c=b.vtp_path,d=b.vtp_domain,b.vtp_enableCookieFlagsFeature&&(f=b.vtp_cookieFlags));var g=null;b.vtp_enableCookieUpdateFeature&&(g=!0,void 0!==b.vtp_cookieUpdate&&(g=!!b.vtp_cookieUpdate));var h={prefix:e,path:c,domain:d,flags:f};b.vtp_enableCrossDomainFeature&&
(b.vtp_enableCrossDomain&&!1===b.vtp_acceptIncoming||(b.vtp_enableCrossDomain||Ci())&&Ui(a,h));Ri(h);Wi(["aw","dc"],h);ej(g,h);var l=e;if(b.vtp_enableCrossDomainFeature&&b.vtp_enableCrossDomain&&b.vtp_linkerDomains){var n=b.vtp_linkerDomains.toString().replace(/\s+/g,"").split(",");Vi(a,n,b.vtp_urlPosition,!!b.vtp_formDecoration,l)}var m=jp(H.S);ul(!1,void 0!=m&&!1!==m);b.vtp_enableUrlPassthroughFeature&&b.vtp_enableUrlPassthrough&&Yi()})}();

Z.b.aev=["google"],function(){function a(r,u){var v=nh(r,"gtm");if(v)return v[u]}function b(r,u,v,w){w||(w="element");var y=r+"."+u,x;if(m.hasOwnProperty(y))x=m[y];else{var B=a(r,w);if(B&&(x=v(B),m[y]=x,q.push(y),35<q.length)){var A=q.shift();delete m[A]}}return x}function c(r,u,v){var w=a(r,t[u]);return void 0!==w?w:v}function d(r,u){if(!r)return!1;var v=e(gp());Ha(u)||(u=String(u||"").replace(/\s+/g,"").split(","));for(var w=[v],y=0;y<u.length;y++)if(u[y]instanceof RegExp){if(u[y].test(r))return!1}else{var x=
u[y];if(0!=x.length){if(0<=e(r).indexOf(x))return!1;w.push(e(x))}}return!Yp(r,w)}function e(r){n.test(r)||(r="http://"+r);return vh(xh(r),"HOST",!0)}function f(r,u,v){switch(r){case "SUBMIT_TEXT":return b(u,"FORM."+r,g,"formSubmitElement")||v;case "LENGTH":var w=b(u,"FORM."+r,h);return void 0===w?v:w;case "INTERACTED_FIELD_ID":return l(u,"id",v);case "INTERACTED_FIELD_NAME":return l(u,"name",v);case "INTERACTED_FIELD_TYPE":return l(u,"type",v);case "INTERACTED_FIELD_POSITION":var y=a(u,"interactedFormFieldPosition");
return void 0===y?v:y;case "INTERACT_SEQUENCE_NUMBER":var x=a(u,"interactSequenceNumber");return void 0===x?v:x;default:return v}}function g(r){switch(r.tagName.toLowerCase()){case "input":return Gf(r,"value");case "button":return Hf(r);default:return null}}function h(r){if("form"===r.tagName.toLowerCase()&&r.elements){for(var u=0,v=0;v<r.elements.length;v++)Eo(r.elements[v])&&u++;return u}}function l(r,u,v){var w=a(r,"interactedFormField");return w&&Gf(w,u)||v}var n=/^https?:\/\//i,m={},q=[],t={ATTRIBUTE:"elementAttribute",
CLASSES:"elementClasses",ELEMENT:"element",ID:"elementId",HISTORY_CHANGE_SOURCE:"historyChangeSource",HISTORY_NEW_STATE:"newHistoryState",HISTORY_NEW_URL_FRAGMENT:"newUrlFragment",HISTORY_OLD_STATE:"oldHistoryState",HISTORY_OLD_URL_FRAGMENT:"oldUrlFragment",TARGET:"elementTarget"};(function(r){Z.__aev=r;Z.__aev.g="aev";Z.__aev.h=!0;Z.__aev.priorityOverride=0})(function(r){var u=r.vtp_gtmEventId,v=r.vtp_defaultValue,w=r.vtp_varType;switch(w){case "TAG_NAME":var y=a(u,"element");return y&&y.tagName||
v;case "TEXT":return b(u,w,Hf)||v;case "URL":var x;a:{var B=String(a(u,"elementUrl")||v||""),A=xh(B),z=String(r.vtp_component||"URL");switch(z){case "URL":x=B;break a;case "IS_OUTBOUND":x=d(B,r.vtp_affiliatedDomains);break a;default:x=vh(A,z,r.vtp_stripWww,r.vtp_defaultPages,r.vtp_queryKey)}}return x;case "ATTRIBUTE":var D;if(void 0===r.vtp_attribute)D=c(u,w,v);else{var G=r.vtp_attribute,L=a(u,"element");D=L&&Gf(L,G)||v||""}return D;case "MD":var Q=r.vtp_mdValue,X=b(u,"MD",Qo);return Q&&X?To(X,Q)||
v:X||v;case "FORM":return f(String(r.vtp_component||"SUBMIT_TEXT"),u,v);default:return c(u,w,v)}})}();
Z.b.gas=["google"],function(){(function(a){Z.__gas=a;Z.__gas.g="gas";Z.__gas.h=!0;Z.__gas.priorityOverride=0})(function(a){var b=E(a),c=b;c[xd.Sa]=null;c[xd.yf]=null;var d=b=c;d.vtp_fieldsToSet=d.vtp_fieldsToSet||[];var e=d.vtp_cookieDomain;void 0!==e&&(d.vtp_fieldsToSet.push({fieldName:"cookieDomain",value:e}),delete d.vtp_cookieDomain);return b})}();

Z.b.hl=["google"],function(){function a(f){return f.target&&f.target.location&&f.target.location.href?f.target.location.href:gp()}function b(f,g){Ef(f,"hashchange",function(h){var l=a(h);g({source:"hashchange",state:null,url:ip(l),T:hp(l)})})}function c(f,g){Ef(f,"popstate",function(h){var l=a(h);g({source:"popstate",state:h.state,url:ip(l),T:hp(l)})})}function d(f,g,h){var l=g.history,n=l[f];if(Fa(n))try{l[f]=function(m,q,t){n.apply(l,[].slice.call(arguments,0));h({source:f,state:m,url:ip(gp()),
T:hp(gp())})}}catch(m){}}function e(){var f={source:null,state:V("history").state||null,url:ip(gp()),T:hp(gp())};return function(g){var h=f,l={};l[h.source]=!0;l[g.source]=!0;if(!l.popstate||!l.hashchange||h.T!=g.T){var n={event:"gtm.historyChange","gtm.historyChangeSource":g.source,"gtm.oldUrlFragment":f.T,"gtm.newUrlFragment":g.T,"gtm.oldHistoryState":f.state,"gtm.newHistoryState":g.state,"gtm.oldUrl":f.url,"gtm.newUrl":g.url};f=g;kp(n)}}}(function(f){Z.__hl=f;Z.__hl.g="hl";Z.__hl.h=!0;Z.__hl.priorityOverride=
0})(function(f){var g=V("self");if(!pp("hl")){var h=e();b(g,h);c(g,h);d("pushState",g,h);d("replaceState",g,h);qp("hl")}O(f.vtp_gtmOnSuccess)})}();Z.b.remm=["google"],function(){(function(a){Z.__remm=a;Z.__remm.g="remm";Z.__remm.h=!0;Z.__remm.priorityOverride=0})(function(a){for(var b=a.vtp_input,c=a.vtp_map||[],d=a.vtp_fullMatch,e=a.vtp_ignoreCase?"gi":"g",f=0;f<c.length;f++){var g=c[f].key||"";d&&(g="^"+g+"$");var h=new RegExp(g,e);if(h.test(b)){var l=c[f].value;a.vtp_replaceAfterMatch&&(l=String(b).replace(h,l));return l}}return a.vtp_defaultValue})}();
Z.b.smm=["google"],function(){(function(a){Z.__smm=a;Z.__smm.g="smm";Z.__smm.h=!0;Z.__smm.priorityOverride=0})(function(a){var b=a.vtp_input,c=Zp(a.vtp_map,"key","value")||{};return c.hasOwnProperty(b)?c[b]:a.vtp_defaultValue})}();



Z.b.paused=[],function(){(function(a){Z.__paused=a;Z.__paused.g="paused";Z.__paused.h=!0;Z.__paused.priorityOverride=0})(function(a){O(a.vtp_gtmOnFailure)})}();

Z.b.html=["customScripts"],function(){function a(d,e,f,g){return function(){try{if(0<e.length){var h=e.shift(),l=a(d,e,f,g);if("SCRIPT"==String(h.nodeName).toUpperCase()&&"text/gtmscript"==h.type){var n=K.createElement("script");n.async=!1;n.type="text/javascript";n.id=h.id;n.text=h.text||h.textContent||h.innerHTML||"";h.charset&&(n.charset=h.charset);var m=h.getAttribute("data-gtmsrc");m&&(n.src=m,zf(n,l));d.insertBefore(n,null);m||l()}else if(h.innerHTML&&0<=h.innerHTML.toLowerCase().indexOf("<script")){for(var q=
[];h.firstChild;)q.push(h.removeChild(h.firstChild));d.insertBefore(h,null);a(h,q,l,g)()}else d.insertBefore(h,null),l()}else f()}catch(t){O(g)}}}var c=function(d){if(K.body){var e=
d.vtp_gtmOnFailure,f=tp(d.vtp_html,d.vtp_gtmOnSuccess,e),g=f.md,h=f.I;if(d.vtp_useIframe){}else d.vtp_supportDocumentWrite?b(g,h,e):a(K.body,If(g),h,e)()}else ep(function(){c(d)},
200)};Z.__html=c;Z.__html.g="html";Z.__html.h=!0;Z.__html.priorityOverride=0}();




Z.b.img=["customPixels"],function(){(function(a){Z.__img=a;Z.__img.g="img";Z.__img.h=!0;Z.__img.priorityOverride=0})(function(a){var b=If('<a href="'+a.vtp_url+'"></a>')[0].href,c=a.vtp_cacheBusterQueryParam;if(a.vtp_useCacheBuster){c||(c="gtmcb");var d=b.charAt(b.length-1),e=0<=b.indexOf("?")?"?"==d||"&"==d?"":"&":"?";b+=e+c+"="+a.vtp_randomNumber}Xp(b,a.vtp_gtmOnSuccess,a.vtp_gtmOnFailure)})}();


Z.b.lcl=[],function(){function a(){var c=V("document"),d=0,e=function(f){var g=f.target;if(g&&3!==f.which&&!(f.ih||f.timeStamp&&f.timeStamp===d)){d=f.timeStamp;g=Jf(g,["a","area"],100);if(!g)return f.returnValue;var h=f.defaultPrevented||!1===f.returnValue,l=Bo("lcl",h?"nv.mwt":"mwt",0),n;n=h?Bo("lcl","nv.ids",[]):Bo("lcl","ids",[]);if(n.length){var m=xo(g,"gtm.linkClick",n);if(b(f,g,c)&&!h&&l&&g.href){var q=String(sp(g,"rel")||""),t=!!Ja(q.split(" "),function(v){return"noreferrer"===v.toLowerCase()});
t&&I(36);var r=V((sp(g,"target")||"_self").substring(1)),u=!0;if(kp(m,no(function(){var v;if(v=u&&r){var w;a:if(t){var y;try{y=new MouseEvent(f.type)}catch(x){if(!c.createEvent){w=!1;break a}y=c.createEvent("MouseEvents");y.initEvent(f.type,!0,!0)}y.ih=!0;f.target.dispatchEvent(y);w=!0}else w=!1;v=!w}v&&(r.location.href=sp(g,"href"))}),l))u=!1;else return f.preventDefault&&f.preventDefault(),f.returnValue=!1}else kp(m,function(){},l||2E3);return!0}}};Ef(c,"click",e,!1);Ef(c,"auxclick",e,!1)}function b(c,
d,e){if(2===c.which||c.ctrlKey||c.shiftKey||c.altKey||c.metaKey)return!1;var f=sp(d,"href"),g=f.indexOf("#"),h=sp(d,"target");if(h&&"_self"!==h&&"_parent"!==h&&"_top"!==h||0===g)return!1;if(0<g){var l=ip(f),n=ip(e.location);return l!==n}return!0}(function(c){Z.__lcl=c;Z.__lcl.g="lcl";Z.__lcl.h=!0;Z.__lcl.priorityOverride=0})(function(c){var d=void 0===c.vtp_waitForTags?!0:c.vtp_waitForTags,e=void 0===c.vtp_checkValidation?!0:c.vtp_checkValidation,f=Number(c.vtp_waitForTagsTimeout);if(!f||0>=f)f=2E3;
var g=c.vtp_uniqueTriggerId||"0";if(d){var h=function(n){return Math.max(f,n)};Ao("lcl","mwt",h,0);e||Ao("lcl","nv.mwt",h,0)}var l=function(n){n.push(g);return n};Ao("lcl","ids",l,[]);e||Ao("lcl","nv.ids",l,[]);pp("lcl")||(a(),qp("lcl"));O(c.vtp_gtmOnSuccess)})}();


var Wr={};Wr.macro=function(a){if(uo.Yc.hasOwnProperty(a))return uo.Yc[a]},Wr.onHtmlSuccess=uo.se(!0),Wr.onHtmlFailure=uo.se(!1);Wr.dataLayer=jh;Wr.callback=function(a){Fg.hasOwnProperty(a)&&Fa(Fg[a])&&Fg[a]();delete Fg[a]};function Xr(){R[Md.C]=Wr;Wa(Gg,Z.b);pd=pd||uo;qd=Id}
function Yr(){Mf.gtm_3pds=!0;Mf.gtag_cs_api=!0;R=C.google_tag_manager=C.google_tag_manager||{};var a=!1;ql(),a=!0;if(R[Md.C]){var b=R.zones;b&&b.unregisterChild(Md.C);}else{for(var c=data.resource||{},d=c.macros||[],e=0;e<d.length;e++)id.push(d[e]);for(var f=c.tags||[],g=0;g<f.length;g++)ld.push(f[g]);for(var h=c.predicates||[],l=0;l<h.length;l++)kd.push(h[l]);for(var n=c.rules||[],m=0;m<n.length;m++){for(var q=n[m],t={},r=0;r<q.length;r++)t[q[r][0]]=Array.prototype.slice.call(q[r],1);jd.push(t)}nd=Z;od=Tp;var u=data.permissions||{},v=data.sandboxed_scripts,w=data.security_groups;Cn();Qd=new Pd(u);if(void 0!==
v)for(var y=["sandboxedScripts"],x=0;x<v.length;x++){var B=v[x].replace(/^_*/,"");Gg[B]=y}Fn(w);Xr();to();Kj=!1;Lj=0;if("interactive"==K.readyState&&!K.createEventObject||"complete"==K.readyState)Nj();else{Ef(K,"DOMContentLoaded",Nj);Ef(K,"readystatechange",Nj);if(K.createEventObject&&K.documentElement.doScroll){var A=!0;try{A=!C.frameElement}catch(L){}A&&Oj()}Ef(C,"load",Nj)}Vm=!1;"complete"===K.readyState?Xm():Ef(C,"load",Xm);a:{if(!Zg)break a;C.setInterval($g,864E5);}
Dg=(new Date).getTime();}}
(function(a){a()})(Yr);

})()
