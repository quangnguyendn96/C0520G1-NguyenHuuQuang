(("undefined"!=typeof self?self:this).webpackJsonp=("undefined"!=typeof self?self:this).webpackJsonp||[]).push([[2],{1019:function(e,t,a){"use strict";var n=a(0),r=a(33),i=a.n(r),c=a(946),o=a(1949),l=a.n(o);t.a=Object(c.b)(function(e){var t=e.item,a=e.className;return t&&t.name?n.createElement("div",{className:i()(l.a.itemName,a)},t.name):null})},1020:function(e,t,a){"use strict";var n=a(0),r=a.n(n),i=a(33),c=a.n(i),o=a(1957),l=a.n(o);t.a=function(e){var t=e.color,a=e.children,n=e.className;return r.a.createElement("div",{className:c()(l.a.imageFlag,n),style:{color:t}},a)}},1024:function(e,t,a){"use strict";var n=a(0),r=a(33),i=a.n(r),c=a(946),o=a(945),l=a(1967),s=a.n(l),u=function(e){var t=e.item,r=e.isUserAdult,c=e.adultAge,l=e.getImageUrl,u=e.className,m=e.placeholderClassName,f=e.children,d=e.maskAdultImageWhenApplicable,p=e.useTransparentBackgroundImage,_=e.useThumbnailImage,g=void 0===_||_,b=!!(d&&t&&t.is_adult)&&!r,v=a(1963)("./"+c+"-plus.png"),O=b?v:t?l(p&&t.transparent_background_image?t.transparent_background_image:t.image,g):null;return t?n.createElement(o.a,{useImgTag:!0,className:i()(s.a.itemImage,b&&s.a.adultImage,u),wrapperClassName:i()(s.a.wrapper),placeholderClassName:m,src:O},f):null};u.defaultProps={useTransparentBackgroundImage:!1},t.a=Object(c.b)(u)},1035:function(e,t,a){"use strict";var n=a(0),r=a.n(n),i=a(33),c=a.n(i),o=a(946),l=a(44),s=a(1020),u=a(89),m=a(1956),f=a.n(m),d=function(){return r.a.createElement(s.a,{color:"#F25220",className:f.a.imageFlagPreferred},r.a.createElement("span",{className:f.a.preferredText},Object(u.t)("label_preferred_for_preferred_seller")))},p=a(1958),_=a.n(p),g=function(){return r.a.createElement(s.a,{color:"#F25220",className:_.a.imageFlagPreferred},r.a.createElement("span",{className:_.a.preferredText},Object(u.t)("label_preferred_plus")))},b=a(1168),v=a(1959),O=a.n(v);function h(){return(h=Object.assign||function(e){for(var t=1;t<arguments.length;t++){var a=arguments[t];for(var n in a)Object.prototype.hasOwnProperty.call(a,n)&&(e[n]=a[n])}return e}).apply(this,arguments)}var E=function(e){return n.createElement(b.a,h({},e,{className:O.a.customizedImageFlag}))},I=a(1960),N=a.n(I);var y,S=a(1111),j=a(62),P=a(1961),x=a.n(P),C=((y={})[S.a.SBS_ID_SHOPEE_24]=j.a.PRODUCT_DIKELOLA_SHOPEE?x.a.badgeImageFlagDikelolaShopee:x.a.badgeImageFlagSbs24,y[S.a.SBS_TH_SHOPEE_24]=x.a.badgeImageFlagSbs24,y[S.a.SBS_PH_SHOPEE_24]=x.a.badgeImageFlagSbs24hr,y[S.a.SBS_VN_GHTK_24]=x.a.badgeImageFlagSbs24,y[S.a.SERVICE_BY_SHOPEE_24H]=x.a.badgeImageFlagSbs24h,y[S.a.SBS_VN_RAPIDSLA_4]=x.a.badgeImageFlagSbs4h,y[S.a.SERVICE_BY_SHOPEE_MY_24H]=x.a.badgeImageFlagSbs24,y[S.a.SBS_SG_SHOPEE_24]=x.a.badgeImageFlagSbs24,y);var R,T=Object(o.b)(function(e){var t=function(e){return e&&(e.badge_icon_type||e.service_by_shopee_flag)}(e.item);if(!t)return null;var a=C[t];return n.createElement(s.a,{color:"#d0011b",className:x.a.badgeImageFlagSbsContainer},n.createElement("div",{className:c()(x.a.badgeImageFlagSbs,a)}))}),k=a(24),A=a(932),F=a(46),M=a(1962),w=a.n(M),B=Object.freeze(((R={})[k.a.IMAGE_FLAG_PREFERRED]=d,R[k.a.IMAGE_FLAG_CUSTOM]=E,R[k.a.IMAGE_FLAG_MALL]=function(){return r.a.createElement(s.a,{color:"#d0011b",className:N.a.imageFlagOfficialMallContainer},r.a.createElement("div",{className:c()(N.a.imageFlagOfficialMall,"TW"===__LOCALE__&&N.a.taiwan)}))},R[k.a.IMAGE_FLAG_SBS]=T,R[k.a.IMAGE_FLAG_PREFERRED_PLUS]=g,R));t.a=Object(l.withRouter)(Object(o.b)(n.memo(function(e){var t=e.manifest,a=e.item,r=e.componentMapping,i=e.location,o=e.className,l=Object(A.a)(t,a,{isOfficialMallPath:Object(F.e)(i.pathname)});return l&&0!==l.length?n.createElement("div",{className:c()(w.a.itemCardTopLeftBadges,o)},l.map(function(e,t){var a=r||B[e.type];return a?n.createElement(a,{key:t,data:e.data?e.data:void 0}):null})):null})))},1057:function(e,t,a){"use strict";var n=a(0),r=a.n(n),i=a(33),c=a.n(i),o=a(44),l=a(946),s=a(1134),u=a(458),m=a(1950),f=a.n(m);function d(){return(d=Object.assign||function(e){for(var t=1;t<arguments.length;t++){var a=arguments[t];for(var n in a)Object.prototype.hasOwnProperty.call(a,n)&&(e[n]=a[n])}return e}).apply(this,arguments)}var p=function(e){var t,a;function n(t){var a;return(a=e.call(this,t)||this).onClickFindSimilar=function(e){e.preventDefault(),e.stopPropagation();var t=a.props.item;if(t){var n=t.shopid,r=t.itemid,i=t.catid;if(n&&r&&i){var c=u.d.getUrl({shopid:n,itemid:r,catid:i});a.props.history.push(c)}}},a}return a=e,(t=n).prototype=Object.create(a.prototype),t.prototype.constructor=t,t.__proto__=a,n.prototype.render=function(){var e=this.props,t=e.showItemFindSimilarButton,a=e.children,n=e.item,i=e.index,o=e.className,l=e.findSimilarButtonProps;return r.a.createElement("div",{className:c()(f.a.card,t&&f.a.similarWrapper,o)},a,t&&r.a.createElement(s.a,d({onClick:this.onClickFindSimilar,itemId:n.itemid,shopId:n.shopid,index:i},l)))},n}(r.a.Component);t.a=Object(l.b)(Object(o.withRouter)(p))},1060:function(e,t,a){e.exports={lower:"_3eufr2",nameEtAl:"O6wiAW",priceEtAl:"_2lBkmX",priceBeforeDiscount:"U90Nhh",actualPrice:"_2ZYSiu"}},1072:function(e,t,a){"use strict";var n=a(0),r=a(58),i=a(876),c=a(392),o=a(457);var l=function(e){return function(t){var a=t.item,r=t.listPosition,i=void 0===r?-1:r,l=t.adParams,s=(l=void 0===l?{}:l).adsId,u=void 0===s?0:s,m=l.adsKeyword,f=void 0===m?null:m,d=l.campaignId,p={position:i,adsid:u,campaignid:void 0===d?0:d,ads_keyword:f},_=a?a.name?o.b.getUrl({shopId:a.shopid,itemId:a.itemid,seoName:a.name}):o.a.getUrl({shopId:a.shopid,itemId:a.itemid}):"#";return n.createElement(c.a,{to:p?{pathname:_,query:p}:_,"data-sqe":"link"},n.createElement(e,t))}},s=a(409),u=a(185),m=a(165),f=a(54),d=a(24),p=a(1167),_=a(1174),g=a(1176),b=a(184),v=a(261);function O(e,t,a,n,r,i,c){try{var o=e[i](c),l=o.value}catch(e){return void a(e)}o.done?t(l):Promise.resolve(l).then(n,r)}var h=function(e,t){var a=t.itemId,n=t.item,r=a||n&&n.itemid,i=r&&Object(m.a)(e,r)||n,c=t.setId||d.d.STANDARD,o=Object(b.getAccountInfo)(e);return{item:i,propsItem:n,manifest:Object(p.a)(e,c),isCcInstallmentPaymentWhitelist:!!o&&!!o.get("is_cc_installment_payment_eligible"),isNonCcInstallmentPaymentWhitelist:!!o&&!!o.get("is_non_cc_installment_payment_eligible")}},E={passItemDataFromList:s.g,setOfficialShopRedUI:u.f,fetchItemCardManifestV2:_.a};var I=function(e){var t=function(t){var a,r;function i(e){return t.call(this,e)||this}r=t,(a=i).prototype=Object.create(r.prototype),a.prototype.constructor=a,a.__proto__=r;var c,o,l=i.prototype;return l.universalDataFetch=function(){return this.load(this.props)},l.load=(c=regeneratorRuntime.mark(function e(t){var a;return regeneratorRuntime.wrap(function(e){for(;;)switch(e.prev=e.next){case 0:if("function"==typeof t.injectAsyncReducer&&t.injectAsyncReducer({itemCardManifest:g.a}),!(a=t.setId)){e.next=6;break}if(i.manifestRequested[a]){e.next=6;break}return i.manifestRequested[a]=!0,e.abrupt("return",t.fetchItemCardManifestV2([a]));case 6:case"end":return e.stop()}},e,this)}),o=function(){var e=this,t=arguments;return new Promise(function(a,n){var r=c.apply(e,t);function i(e){O(r,a,n,i,o,"next",e)}function o(e){O(r,a,n,i,o,"throw",e)}i(void 0)})},function(e){return o.apply(this,arguments)}),l.componentDidMount=function(){this.load(this.props)},l.render=function(){var t=this.props,a=(t.fetchItemCardManifestV2,t.injectAsyncReducer,function(e,t){if(null==e)return{};var a,n,r={},i=Object.keys(e);for(n=0;n<i.length;n++)a=i[n],t.indexOf(a)>=0||(r[a]=e[a]);return r}(t,["fetchItemCardManifestV2","injectAsyncReducer"]));return n.createElement(e,a)},i}(n.Component);return t.manifestRequested={},t.defaultProps={setId:d.d.STANDARD},Object(f.connect)(h,E)(Object(v.b)(t))},N=a(434);var y=function(e){return Object(N.a)(function(t){var a=t.trackingRef,r=t.trackingClick,i=function(e,t){if(null==e)return{};var a,n,r={},i=Object.keys(e);for(n=0;n<i.length;n++)a=i[n],t.indexOf(a)>=0||(r[a]=e[a]);return r}(t,["trackingRef","trackingClick"]);return n.createElement("div",{ref:a,onClick:r},n.createElement(e,i))},"ItemCard",{reportOnce:!0})},S=a(1880);function j(){return(j=Object.assign||function(e){for(var t=1;t<arguments.length;t++){var a=arguments[t];for(var n in a)Object.prototype.hasOwnProperty.call(a,n)&&(e[n]=a[n])}return e}).apply(this,arguments)}var P=a(1018),x=a(89),C=a(1506),R=Object(r.d)(i.b,y,l,I,function(e){return function(t){return n.createElement(S.a.Consumer,null,function(a){return n.createElement(e,j({},t,{useTransparentBackgroundImage:a}))})}},Object(x.withI18nCollections)([P.h],C.a));t.a=R},1073:function(e,t,a){"use strict";var n=a(0),r=a(24),i=a(4),c=a(173);var o=a(946),l=a(985),s=a(89),u=a(61);var m=Object(o.b)(function(e){var t=e.item;return n.createElement(l.e,{language:u.f,rawDiscount:t.raw_discount,offText:Object(s.t)("badge_label_off")})});var f,d=Object(o.b)(function(){return n.createElement(l.f,{language:u.f,soldText:Object(s.t)("badge_label_sold"),outText:Object(s.t)("badge_label_out")})}),p=a(1954),_=a.n(p),g=Object.freeze(((f={})[r.a.TOP_RIGHT_SOLD_OUT]=d,f[r.a.TOP_RIGHT_DISCOUNT]=m,f));t.a=Object(o.b)(function(e){var t=e.manifest,a=e.item,r=e.componentMapping,o=function(e,t,a){var n=a.locale,r=[];if(e&&e.topRight){var o=e.topRight,l=Array.isArray(o),s=0;for(o=l?o:o[Symbol.iterator]();;){var u;if(l){if(s>=o.length)break;u=o[s++]}else{if((s=o.next()).done)break;u=s.value}var m=u,f=c.a[m.type];f&&f(t,{locale:n})&&r.push(m)}}return r.slice(0,Object(i.a)(e,["maxBadges","topRight"],1/0))}(t,a,{locale:__LOCALE__});return o&&0!==o.length?n.createElement("div",{className:_.a.upperRight},o.map(function(e,t){var a=(r||g)[e.type];return a?n.createElement(a,{key:t}):null})):null})},1074:function(e,t,a){"use strict";var n=a(0),r=a.n(n),i=a(24),c=a(4),o=a(173);var l,s=a(946),u=a(1135),m=a(1951),f=a.n(m),d=function(){return r.a.createElement(u.a,{className:f.a.iconCamera})},p=a(1372),_=a(1953),g=a.n(_),b=Object.freeze(((l={})[i.a.BOTTOM_RIGHT_VIDEO]=d,l[i.a.BOTTOM_RIGHT_ADS]=p.a,l));t.a=Object(s.b)(function(e){var t=e.manifest,a=e.item,r=e.componentMapping,i=function(e,t){var a=[];if(e&&e.bottomRight){var n=e.bottomRight,r=Array.isArray(n),i=0;for(n=r?n:n[Symbol.iterator]();;){var l;if(r){if(i>=n.length)break;l=n[i++]}else{if((i=n.next()).done)break;l=i.value}var s=l,u=o.a[s.type];u&&u(t)&&a.length<1&&a.push(s)}}return a.slice(0,Object(c.a)(e,["maxBadges","bottomRight"],1/0))}(t,e.propsItem||a);return i&&0!==i.length?n.createElement("div",{className:g.a.lowerRight},i.map(function(e,t){var a=(r||b)[e.type];return a?n.createElement(a,{key:t}):null})):null})},1076:function(e,t,a){"use strict";var n,r=a(0),i=a(24),c=a(931),o=a(946),l=a(1168),s=a(89),u=a(1310),m=function(){return r.createElement(u.a,{className:"shopee-item-card__sneak-peak"},Object(s.t)("label_sneak_peak"))},f=a(1955),d=a.n(f),p=Object.freeze(((n={})[i.a.OVERLAY_PRODUCT_PREVIEW]=m,n[i.a.OVERLAY_CUSTOM]=l.a,n));t.a=Object(o.b)(function(e){var t=e.item,a=e.manifest,n=e.componentMapping,i=Object(c.a)(a,t);return i&&0!==i.length?r.createElement("div",{className:d.a.overlay},i.map(function(e,t){var a=n||p[e.type];return a?r.createElement(a,{key:t,data:e.data?e.data:void 0}):null})):null})},1107:function(e,t,a){"use strict";var n=a(0),r=a.n(n),i=a(33),c=a.n(i),o=a(54),l=a(946),s=a(1019),u=a(24),m=a(1310),f=a(1940),d=a.n(f);var p=Object(l.b)(function(e){var t=e.item;return t.bundle_deal_info?n.createElement(m.a,{className:d.a.badgeBundleDeal},t.bundle_deal_info.bundle_deal_label):null}),_=a(89),g=a(1941),b=a.n(g);var v=function(){return n.createElement("div",{className:c()(b.a.badgeInstallment)},Object(_.t)("label_installment_tag"))},O=a(61);var h=a(1942),E=a.n(h);var I=function(e){var t=e.data,a=t.display_height,r=t.display_width,i=t.color,c=t.texts;return c?n.createElement(m.a,{style:{color:i,height:a,width:r},className:E.a.promotionCustomized},function(e,t){return e[u.e[t]]||e.en||""}(c,O.f)):null},N=a(1943),y=a.n(N);var S=function(){return n.createElement("div",{className:y.a.badgePromotionWholesale},Object(_.t)("product_card_label_wholesale"))},j=a(1944),P=a.n(j);var x=Object(l.b)(function(e){var t=e.item;return t&&t.coin_earn_label?n.createElement("div",{className:c()(P.a.badgePromotionCoinsCashback)},t.coin_earn_label):null}),C=a(1078),R=function(){return n.createElement(C.a,{groupSize:0,small:!0,showGroupSize:!1})},T=a(1945),k=a.n(T),A=a(4);var F=Object(l.b)(function(e){var t=e.item;return n.createElement("div",{className:k.a.badgePromotionAddOn},Object(A.a)(t,["add_on_deal_info","add_on_deal_label"]))}),M=a(1946),w=a.n(M);var B,L=Object(l.b)(function(e){var t=e.item,a=t.exclusive_price_info&&t.exclusive_price_info.exclusive_price_results&&t.exclusive_price_info.exclusive_price_results.length>0&&t.exclusive_price_info.exclusive_price_results[0],r=t&&t.flash_sale?t.flash_sale:null;if(!a||r)return null;var i=a.label;return i?n.createElement(m.a,{className:w.a.badgeExclusivePrice},i):null}),D=a(1947),U=a.n(D),H=Object.freeze(((B={})[u.a.PROMOTION_BUNDLE_DEAL]=p,B[u.a.PROMOTION_CC_INSTALLMENT]=v,B[u.a.PROMOTION_NON_CC_INSTALLMENT]=v,B[u.a.PROMOTION_GROUP_BUY]=R,B[u.a.PROMOTION_CUSTOM]=I,B[u.a.PROMOTION_WHOLESALE]=S,B[u.a.PROMOTION_COINS_CASHBACK]=x,B[u.a.PROMOTION_ADD_ON]=F,B[u.a.PROMOTION_PWG]=F,B[u.a.PROMOTION_EXCLUSIVE_PRICE]=L,B));function G(e){var t=e.badges;return r.a.createElement("div",{className:U.a.promotion},t.map(function(e,t){var a=H[e.type];return a?r.a.createElement(a,{key:t,data:e.data?e.data:void 0}):null}))}var W=a(184),V=a(933),z=a(62),q=a(1948),Y=a.n(q),K=!!z.a.GROUP_BUY;t.a=Object(o.connect)(function(e){var t=Object(W.getAccountInfo)(e);return{isCcInstallmentPaymentWhitelist:!!t&&!!t.get("is_cc_installment_payment_eligible"),isNonCcInstallmentPaymentWhitelist:!!t&&!!t.get("is_non_cc_installment_payment_eligible")}})(Object(l.b)(n.memo(function(e){var t=e.className,a=e.showPromotionLabels,r=e.manifest,i=e.item,o=e.isCcInstallmentPaymentWhitelist,l=e.isNonCcInstallmentPaymentWhitelist,u=e.ItemNameComponent,m=void 0===u?s.a:u,f=e.numLines,d=Object(V.a)(r,i,{supportsGroupBuy:K,supportsPwg:!0,isCcInstallmentPaymentWhitelist:o,isNonCcInstallmentPaymentWhitelist:l}),p=d.length>0,_=2===f||!f&&!p;return n.createElement(n.Fragment,null,n.createElement(m,{className:c()(t,_?Y.a.twoLineName:Y.a.oneLineName)}),a&&p&&n.createElement(G,{badges:d}))})))},1168:function(e,t,a){"use strict";var n=a(0),r=a(33),i=a.n(r),c=a(1310),o=a(90);t.a=function(e){var t=e.data,a=t.display_height,r=t.display_width,l=t.image,s=e.className;return l?n.createElement(c.a,{className:i()("customized-overlay-image",s)},n.createElement("img",{src:Object(o.b)(l),width:r,height:a})):null}},1310:function(e,t,a){"use strict";var n=a(0),r=a.n(n);function i(){return(i=Object.assign||function(e){for(var t=1;t<arguments.length;t++){var a=arguments[t];for(var n in a)Object.prototype.hasOwnProperty.call(a,n)&&(e[n]=a[n])}return e}).apply(this,arguments)}t.a=function(e){var t=e.className,a=e.children,n=e.style,c=function(e,t){if(null==e)return{};var a,n,r={},i=Object.keys(e);for(n=0;n<i.length;n++)a=i[n],t.indexOf(a)>=0||(r[a]=e[a]);return r}(e,["className","children","style"]);return r.a.createElement("div",i({className:t,style:n},c),a)}},1372:function(e,t,a){"use strict";var n=a(0),r=a.n(n),i=a(89),c=a(1310),o=a(1952),l=a.n(o);t.a=function(){return r.a.createElement(c.a,{className:l.a.adBadge,"data-sqe":"ad"},Object(i.t)("label_ad_card"))}},1506:function(e,t,a){"use strict";var n=a(0),r=a.n(n),i=a(33),c=a.n(i),o=a(986),l=a(1939),s=a.n(l);t.a=function(){return r.a.createElement("div",{className:s.a.card},r.a.createElement(o.a,null),r.a.createElement("div",{className:s.a.info},r.a.createElement("div",{className:c()("skeleton",s.a.text,s.a.name)}),r.a.createElement("div",{className:c()("skeleton skeleton-medium",s.a.text)})))}},1880:function(e,t,a){"use strict";a.d(t,"a",function(){return r});var n=a(0),r=n.createContext(!1)},1939:function(e,t,a){e.exports={card:"_39HLSS",info:"XyanZs",text:"Sw1cAg",name:"_2K7SFD"}},1940:function(e,t,a){e.exports={badgeBundleDeal:"_2B9nvB"}},1941:function(e,t,a){e.exports={badgeInstallment:"kanzJK"}},1942:function(e,t,a){e.exports={promotionCustomized:"xzLmKO"}},1943:function(e,t,a){e.exports={badgePromotionWholesale:"_3TvbSB"}},1944:function(e,t,a){e.exports={badgePromotionCoinsCashback:"_28qZHR"}},1945:function(e,t,a){e.exports={badgePromotionAddOn:"_3jeCIu"}},1946:function(e,t,a){e.exports={badgeExclusivePrice:"FgQpBT"}},1947:function(e,t,a){e.exports={promotion:"_1q6y2m"}},1948:function(e,t,a){e.exports={oneLineName:"_1JBBaM",twoLineName:"_16BAGk"}},1949:function(e,t,a){e.exports={itemName:"_1NoI8_"}},1950:function(e,t,a){e.exports={card:"_1gkBDw",similarWrapper:"_2O43P5"}},1951:function(e,t,a){e.exports={iconCamera:"_3pgUjF"}},1952:function(e,t,a){e.exports={adBadge:"_3ao649"}},1953:function(e,t,a){e.exports={lowerRight:"_1HvBLA"}},1954:function(e,t,a){e.exports={upperRight:"_2N1Tif"}},1955:function(e,t,a){e.exports={overlay:"_1wwdfZ"}},1956:function(e,t,a){e.exports={imageFlagPreferred:"bgXBUk",preferredText:"lVCR4M"}},1957:function(e,t,a){e.exports={imageFlag:"_150RS_"}},1958:function(e,t,a){e.exports={imageFlagPreferred:"_2qgHNu",preferredText:"ETcfiP"}},1959:function(e,t,a){e.exports={customizedImageFlag:"_1o_tj7"}},1960:function(e,t,a){e.exports={imageFlagOfficialMallContainer:"_1p4JPR",imageFlagOfficialMall:"_1jRNA3",taiwan:"_1EbmwM"}},1961:function(e,t,a){e.exports={badgeImageFlagSbsContainer:"_33gJHj",badgeImageFlagSbs:"_1truSW",badgeImageFlagSbs4h:"pgvvf_",badgeImageFlagSbs24:"_1hOhk3",badgeImageFlagSbs24h:"_1MqYX3",badgeImageFlagSbs24hr:"_6VYvA0",badgeImageFlagDikelolaShopee:"_4tgZqo"}},1962:function(e,t,a){e.exports={itemCardTopLeftBadges:"MW4BW_"}},1963:function(e,t,a){var n={"./18-plus.png":1964,"./20-plus.png":1965,"./21-plus.png":1966};function r(e){var t=i(e);return a(t)}function i(e){if(!a.o(n,e)){var t=new Error("Cannot find module '"+e+"'");throw t.code="MODULE_NOT_FOUND",t}return n[e]}r.keys=function(){return Object.keys(n)},r.resolve=i,e.exports=r,r.id=1963},1964:function(e,t,a){e.exports=a.p+"724fe29aff014684ed7bd2db6f59506b.png"},1965:function(e,t,a){e.exports=a.p+"b7c6b7a72a7e657e516323c5e1816547.png"},1966:function(e,t,a){e.exports=a.p+"e48b2864a78d7d266eca9b63cc2f24b9.png"},1967:function(e,t,a){e.exports={itemImage:"_1T9dHf",wrapper:"_1tDEiO"}}}]);
//# sourceMappingURL=https://shopee.sg/assets/default~BffFromSameShop~BffPdpRecommendationSection~BffSimilarProducts~BffYouMayAlsoLike~BundleFromS~97424328.cae0674c4d7dad34b6cb.js.map