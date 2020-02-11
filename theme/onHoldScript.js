//Old onHoldHighlight script
$(function(){
    function onHoldHighlight(){
        console.log("Script loaded");
        var teamMemberLabels = jQuery('.fc-resource-area div.fc-rows tr');
        teamMemberLabels.each(function() {
            var teamMemberLabel = jQuery(this);
            var teamMemberText = jQuery(teamMemberLabel.find('span.fc-cell-text')[0]).text();
            if(/\(on hold\)$/m.test(teamMemberText)) {      // '/\(on hold\)$/m.test(teamMemberText)'
                var teamMemberId = teamMemberLabel.attr('data-resource-id');
                var teamMemberTime = jQuery('.fc-time-area div.fc-rows tr[data-resource-id=' + teamMemberId + ']');
                teamMemberLabel.addClass('TeamMemberOnHold');
                teamMemberTime.addClass('TeamMemberOnHold');
            }
        });
    }
    var searchOnHold = setInterval(onHoldHighlight, 5000);
});


