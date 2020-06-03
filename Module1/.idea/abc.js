var MultiSelectComponent = React.createClass({
    handleChange: function(e) {
        var newArrayOfSelectedOptionValues = ???;
        this.props.someCallbackFromParent(newArrayOfSelectedOptionValues);
    },
    render: function() {
        return (
            <select multiple={true} value={this.props.arrayOfOptionValues} onChange={this.handleChange}>
            <option value={1}>First option</option>
        <option value={2}>Second option</option>
        <option value={3}>Third option</option>
        </select>
    );
    }
});