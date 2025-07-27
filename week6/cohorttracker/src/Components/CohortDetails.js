import React from 'react';
import styles from './CohortDetails.module.css'; 

function CohortDetails(props) {
    const { cohort } = props;

    // Normalize status for case-insensitive comparison
    const status = cohort.currentStatus?.toLowerCase();

    let titleStyle = {};
    if (status === 'ongoing') {
        titleStyle = { color: 'green' };
    } else {
        titleStyle = { color: 'blue' };
    }

    return (
        <div className={styles.box}>
            <h3 style={titleStyle}>
                {cohort.cohortCode} - <span>{cohort.technology}</span>
            </h3>
            <dl>
                <dt>Started On</dt>
                <dd>{cohort.startDate}</dd>
                <dt>Current Status</dt>
                <dd>{cohort.currentStatus}</dd>
                <dt>Coach</dt>
                <dd>{cohort.coachName}</dd>
                <dt>Trainer</dt>
                <dd>{cohort.trainerName}</dd>
            </dl>
        </div>
    );
}

export default CohortDetails;
