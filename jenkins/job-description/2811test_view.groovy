 
listView('2811test Jobs') {
    description('2811test Jobs')
    jobs {
        regex('2811test_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
