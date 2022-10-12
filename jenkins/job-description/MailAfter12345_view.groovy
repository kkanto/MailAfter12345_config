 
listView('MailAfter12345 Jobs') {
    description('MailAfter12345 Jobs')
    jobs {
        regex('MailAfter12345_.+')
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
