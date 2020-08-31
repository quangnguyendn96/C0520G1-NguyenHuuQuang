/* eslint-disable */
var files = 'app~21833f8f.0b3c48505c14c2e4a26e.js,app~748942c6.7d4b337bb6e96488a11e.js,app~970f9218.77789d06b8cb1a89602a.js,app~9b7c0466.261c1800b1ff3d7316e2.js,app~c714bc7b.29911c8b7ee1562df6c2.js,styles~21833f8f.256f02cd8ec8924b2e6c.js,vendors~253ae210.8b3cc37b87538617b002.js,vendors~678f84af.aa0625ca76b6db5036c0.js,vendors~7274e1de.f4e3d4c5626f126fb972.js,vendors~db300d2f.6284a68b7a61f497f79a.js,vendors~f734b0c6.3e5d91fe688ca6287ce3.js,vendors~f9ca8911.b305d2a1a7b7c3837327.js,styles~21833f8f.eba667abf8e5859d1652.css'
var isFromLocal = false
var buildTime = 'Fri Aug 21 2020 20:34:14 GMT+0800 (+08)'
var buildEnv = 'live'
var buildRegion = 'vn'
var host = window.location.href
var isVisitingCN = host.indexOf('cn') > -1
var cdnDomain = !!isFromLocal
  ? ''
  : isVisitingCN
    ? 'https://deo.shopeesz.com/shopee/shopee-seller-' + buildEnv + '-' + buildRegion
    : 'https://deo.shopeemobile.com/shopee/shopee-seller-' + buildEnv + '-' + buildRegion
/* eslint-enable */
function createAssetScriptTags (fileNames) {
  console.log('MiniChat Build Time: ', buildTime)
  var files = fileNames.split(',')
  var fileLength = files.length
  var fragment = document.createDocumentFragment()
  if (fileLength) {
    for (var i = 0; i < fileLength; i++) {
      var jsFile = files[i].indexOf('js') > -1
      var cssFile = files[i].indexOf('css') > -1
      var fileUrl = cdnDomain + '/chateasy/' + files[i]
      if (jsFile) {
        var jstag = document.createElement('script')
        jstag.src = fileUrl
        jstag.type = 'text/javascript'
        jstag.charset = 'utf-8'
        if (jstag) {
          fragment.appendChild(jstag)
        }
      } else if (cssFile) {
        var csstag = document.createElement('link')
        csstag.href = fileUrl
        csstag.rel = 'stylesheet'
        csstag.type = 'text/css'
        if (csstag) {
          fragment.appendChild(csstag)
        }
      }
    }
    document.body.appendChild(fragment)
  }
}
createAssetScriptTags(files)
