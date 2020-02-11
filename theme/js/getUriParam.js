$( function() {
    var code = '';
    if( window.location.href.indexOf( '?' ) >= 0 ) {
        $.each( window.location.href.split( '?' )[1].split( '&' ), function() {
            var param = this.split( '=' );
            if( param[0] == 'code' ) code = param[1];
        } );
        if( code !== '' ) { 
            // window.location.href = window.location.href.replace( /^((?:https?:)?\/\/[a-z.]+(?::\d+)?(?:\/[^?]*))(?:(\?(?:[^=]+=[^&\r\n]*&)+?)?(?:\??code=[^&\r\n]*?)((?:&[^=]+=[^&\r\n]*)*))?$/g, "$1$2$3" );
            $( '.authCodeTextarea>.form-control' ).val( code );
        }
    }
} );