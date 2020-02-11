//Import jQuery
var jQuery = document.createElement('script');
jQuery.src = 'https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js';
jQuery.type = 'text/javascript';
document.getElementsByTagName('head')[0].appendChild(jQuery);

//Import 'onHoldScript.js'
var jScript = document.createElement('script');
jScript.src = 'onHoldScript.js';
jScript.type = 'text/javascript';
document.getElementsByTagName('head')[0].appendChild(jScript);

